package typingsSlinky.googleapis.tagmanagerV1Mod.tagmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Environment. Note that a user can create,
  * delete and update environments of type USER, but can only update the
  * enable_debug and url fields of environments of other types.
  */
@js.native
trait SchemaEnvironment extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * The environment authorization code.
    */
  var authorizationCode: js.UndefOr[String] = js.native
  /**
    * The last update time-stamp for the authorization code.
    */
  var authorizationTimestampMs: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  var containerVersionId: js.UndefOr[String] = js.native
  /**
    * The environment description. Can be set or changed only on USER type
    * environments.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Whether or not to enable debug by default on for the environment.
    */
  var enableDebug: js.UndefOr[Boolean] = js.native
  /**
    * GTM Environment ID uniquely identifies the GTM Environment.
    */
  var environmentId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM environment as computed at storage time. This
    * value is recomputed whenever the environment is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The environment display name. Can be set or changed only on USER type
    * environments.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of this environment.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Default preview page url for the environment.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaEnvironment {
  @scala.inline
  def apply(): SchemaEnvironment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironment]
  }
  @scala.inline
  implicit class SchemaEnvironmentOps[Self <: SchemaEnvironment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationCode")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthorizationTimestampMs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationTimestampMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthorizationTimestampMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authorizationTimestampMs")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerId")(js.undefined)
        ret
    }
    @scala.inline
    def withContainerVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainerVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("containerVersionId")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDebug")(js.undefined)
        ret
    }
    @scala.inline
    def withEnvironmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnvironmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withFingerprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFingerprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fingerprint")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

