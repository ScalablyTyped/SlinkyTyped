package typingsSlinky.octokitPluginRestEndpointMethods.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Archived extends js.Object {
  var archived: Type
  var card_id: Required
  var note: Type
}

object Archived {
  @scala.inline
  def apply(archived: Type, card_id: Required, note: Type): Archived = {
    val __obj = js.Dynamic.literal(archived = archived.asInstanceOf[js.Any], card_id = card_id.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Archived]
  }
}

