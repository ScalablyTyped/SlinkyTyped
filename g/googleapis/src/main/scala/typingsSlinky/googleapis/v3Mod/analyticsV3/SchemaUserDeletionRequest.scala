package typingsSlinky.googleapis.v3Mod.analyticsV3

import typingsSlinky.googleapis.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for a user deletion request resource.
  */
@js.native
trait SchemaUserDeletionRequest extends js.Object {
  /**
    * This marks the point in time for which all user data before should be
    * deleted
    */
  var deletionRequestTime: js.UndefOr[String] = js.native
  /**
    * Firebase Project Id
    */
  var firebaseProjectId: js.UndefOr[String] = js.native
  /**
    * User ID.
    */
  var id: js.UndefOr[AnonType] = js.native
  /**
    * Value is &quot;analytics#userDeletionRequest&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Web property ID of the form UA-XXXXX-YY.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}

object SchemaUserDeletionRequest {
  @scala.inline
  def apply(): SchemaUserDeletionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDeletionRequest]
  }
  @scala.inline
  implicit class SchemaUserDeletionRequestOps[Self <: SchemaUserDeletionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletionRequestTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionRequestTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeletionRequestTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletionRequestTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFirebaseProjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firebaseProjectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirebaseProjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firebaseProjectId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withWebPropertyId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebPropertyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webPropertyId")(js.undefined)
        ret
    }
  }
  
}

