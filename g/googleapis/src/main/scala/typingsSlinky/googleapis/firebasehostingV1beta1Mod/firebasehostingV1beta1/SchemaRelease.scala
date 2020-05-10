package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Release` is a particular [collection of configurations and
  * files](sites.versions) that is set to be public at a particular time.
  */
@js.native
trait SchemaRelease extends js.Object {
  /**
    * The deploy description when the release was created. The value can be up
    * to 512&amp;nbsp;characters.
    */
  var message: js.UndefOr[String] = js.native
  /**
    * Output only. The unique identifier for the release, in the format:
    * &lt;code&gt;sites/&lt;var&gt;site-name&lt;/var&gt;/releases/&lt;var&gt;releaseID&lt;/var&gt;&lt;/code&gt;
    * This name is provided in the response body when you call the
    * [`CreateRelease`](sites.releases/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the version is set to be public.
    */
  var releaseTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who created the release.
    */
  var releaseUser: js.UndefOr[SchemaActingUser] = js.native
  /**
    * Explains the reason for the release. &lt;br&gt;Specify a value for this
    * field only when creating a `SITE_DISABLE` type release.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * Output only.  The configuration and content that was released.
    */
  var version: js.UndefOr[SchemaVersion] = js.native
}

object SchemaRelease {
  @scala.inline
  def apply(): SchemaRelease = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRelease]
  }
  @scala.inline
  implicit class SchemaReleaseOps[Self <: SchemaRelease] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
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
    def withReleaseTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseTime")(js.undefined)
        ret
    }
    @scala.inline
    def withReleaseUser(value: SchemaActingUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReleaseUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("releaseUser")(js.undefined)
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
    def withVersion(value: SchemaVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

