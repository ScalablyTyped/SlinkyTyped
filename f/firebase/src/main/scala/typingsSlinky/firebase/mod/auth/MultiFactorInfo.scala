package typingsSlinky.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A structure containing the information of a second factor entity.
  */
@js.native
trait MultiFactorInfo extends js.Object {
  /**
    * The user friendly name of the current second factor.
    */
  var displayName: js.UndefOr[String | Null] = js.native
  /**
    * The enrollment date of the second factor formatted as a UTC string.
    */
  var enrollmentTime: String = js.native
  /**
    * The identifier of the second factor.
    */
  var factorId: String = js.native
  /**
    * The multi-factor enrollment ID.
    */
  var uid: String = js.native
}

object MultiFactorInfo {
  @scala.inline
  def apply(enrollmentTime: String, factorId: String, uid: String): MultiFactorInfo = {
    val __obj = js.Dynamic.literal(enrollmentTime = enrollmentTime.asInstanceOf[js.Any], factorId = factorId.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorInfo]
  }
  @scala.inline
  implicit class MultiFactorInfoOps[Self <: MultiFactorInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrollmentTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrollmentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFactorId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayName")(null)
        ret
    }
  }
  
}

