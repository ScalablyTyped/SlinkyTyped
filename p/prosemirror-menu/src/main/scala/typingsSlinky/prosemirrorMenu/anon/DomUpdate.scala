package typingsSlinky.prosemirrorMenu.anon

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorState.mod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: js.UndefOr[DocumentFragment | Null] = js.undefined
  def update(p: EditorState[S]): Boolean
}

object DomUpdate {
  @scala.inline
  def apply[S](update: EditorState[S] => Boolean, dom: js.UndefOr[Null | DocumentFragment] = js.undefined): DomUpdate[S] = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    if (!js.isUndefined(dom)) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomUpdate[S]]
  }
}

