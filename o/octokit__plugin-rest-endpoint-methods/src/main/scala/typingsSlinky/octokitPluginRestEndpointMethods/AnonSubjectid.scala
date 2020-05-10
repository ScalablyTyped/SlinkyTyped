package typingsSlinky.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonSubjectid extends js.Object {
  var subject_id: AnonType = js.native
  var subject_type: AnonEnum = js.native
  var username: AnonRequired = js.native
}

object AnonSubjectid {
  @scala.inline
  def apply(subject_id: AnonType, subject_type: AnonEnum, username: AnonRequired): AnonSubjectid = {
    val __obj = js.Dynamic.literal(subject_id = subject_id.asInstanceOf[js.Any], subject_type = subject_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubjectid]
  }
  @scala.inline
  implicit class AnonSubjectidOps[Self <: AnonSubjectid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubject_id(value: AnonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject_type(value: AnonEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: AnonRequired): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

