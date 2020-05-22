package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Subjectid extends js.Object {
  var subject_id: Type
  var subject_type: Enum
  var username: Required
}

object Subjectid {
  @scala.inline
  def apply(subject_id: Type, subject_type: Enum, username: Required): Subjectid = {
    val __obj = js.Dynamic.literal(subject_id = subject_id.asInstanceOf[js.Any], subject_type = subject_type.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subjectid]
  }
}

