package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Columnid extends js.Object {
  var column_id: Required
  var content_id: Type
  var content_type: Type
  var note: Type
}

object Columnid {
  @scala.inline
  def apply(column_id: Required, content_id: Type, content_type: Type, note: Type): Columnid = {
    val __obj = js.Dynamic.literal(column_id = column_id.asInstanceOf[js.Any], content_id = content_id.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Columnid]
  }
}

