package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subjectid extends js.Object {
  var subject_id: Type = js.native
  var subject_type: Enum = js.native
  var username: Required = js.native
}

object Subjectid {
  @scala.inline
  def apply(subject_id: Type, subject_type: Enum, username: Required): Subjectid = {
    val __obj = js.Dynamic.literal(subject_id = subject_id.asInstanceOf[js.Any], subject_type = subject_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subjectid]
  }
  @scala.inline
  implicit class SubjectidOps[Self <: Subjectid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSubject_id(value: Type): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubject_type(value: Enum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subject_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsername(value: Required): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("username")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

