package typingsSlinky.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditorChangeLinkedList extends EditorChange {
  /** Points to another change object (which may point to another, etc). */
  var next: js.UndefOr[EditorChangeLinkedList] = js.native
}

object EditorChangeLinkedList {
  @scala.inline
  def apply(from: Position, text: js.Array[String], to: Position): EditorChangeLinkedList = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeLinkedList]
  }
  @scala.inline
  implicit class EditorChangeLinkedListOps[Self <: EditorChangeLinkedList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNext(value: EditorChangeLinkedList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
  }
  
}

