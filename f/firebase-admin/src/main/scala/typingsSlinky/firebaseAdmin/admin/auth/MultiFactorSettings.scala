package typingsSlinky.firebaseAdmin.admin.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The multi-factor related user settings.
  */
@js.native
trait MultiFactorSettings extends js.Object {
  /**
    * List of second factors enrolled with the current user.
    * Currently only phone second factors are supported.
    */
  var enrolledFactors: js.Array[MultiFactorInfo] = js.native
  /**
    * @return A JSON-serializable representation of this multi-factor object.
    */
  def toJSON(): js.Object = js.native
}

object MultiFactorSettings {
  @scala.inline
  def apply(enrolledFactors: js.Array[MultiFactorInfo], toJSON: () => js.Object): MultiFactorSettings = {
    val __obj = js.Dynamic.literal(enrolledFactors = enrolledFactors.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[MultiFactorSettings]
  }
  @scala.inline
  implicit class MultiFactorSettingsOps[Self <: MultiFactorSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnrolledFactors(value: js.Array[MultiFactorInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enrolledFactors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

