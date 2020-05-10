package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The multi-factor related user settings for create operations.
  */
@js.native
trait MultiFactorCreateSettings extends js.Object {
  /**
    * The created user's list of enrolled second factors.
    */
  var enrolledFactors: js.Array[CreateMultiFactorInfoRequest] = js.native
}

object MultiFactorCreateSettings {
  @scala.inline
  def apply(enrolledFactors: js.Array[CreateMultiFactorInfoRequest]): MultiFactorCreateSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiFactorCreateSettings]
  }
  @scala.inline
  implicit class MultiFactorCreateSettingsOps[Self <: MultiFactorCreateSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrolledFactors(value: js.Array[CreateMultiFactorInfoRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledFactors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

