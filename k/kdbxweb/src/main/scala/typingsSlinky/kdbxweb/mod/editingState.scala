package typingsSlinky.kdbxweb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editingState extends js.Object {
  var added: js.Array[js.Date]
  var deleted: js.Array[js.Date]
}

object editingState {
  @scala.inline
  def apply(added: js.Array[js.Date], deleted: js.Array[js.Date]): editingState = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[editingState]
  }
}

