package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The multi-factor related user settings for update operations.
  */
@js.native
trait MultiFactorUpdateSettings extends js.Object {
  /**
    * The updated list of enrolled second factors. The provided list overwrites the user's
    * existing list of second factors.
    * When null is passed, all of the user's existing second factors are removed.
    */
  var enrolledFactors: js.Array[UpdateMultiFactorInfoRequest] | Null = js.native
}

object MultiFactorUpdateSettings {
  @scala.inline
  def apply(): MultiFactorUpdateSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiFactorUpdateSettings]
  }
  @scala.inline
  implicit class MultiFactorUpdateSettingsOps[Self <: MultiFactorUpdateSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrolledFactors(value: js.Array[UpdateMultiFactorInfoRequest]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledFactors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnrolledFactorsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledFactors")(null)
        ret
    }
  }
  
}

