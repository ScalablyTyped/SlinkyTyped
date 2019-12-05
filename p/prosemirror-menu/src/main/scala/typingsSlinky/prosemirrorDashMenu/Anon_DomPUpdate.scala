package typingsSlinky.prosemirrorDashMenu

import org.scalajs.dom.raw.DocumentFragment
import typingsSlinky.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typingsSlinky.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomPUpdate[S /* <: Schema[_, _] */] extends js.Object {
  var dom: js.UndefOr[DocumentFragment | Null] = js.undefined
  def update(p: EditorState[S]): Boolean
}

object Anon_DomPUpdate {
  @scala.inline
  def apply[S /* <: Schema[_, _] */](update: EditorState[S] => Boolean, dom: DocumentFragment = null): Anon_DomPUpdate[S] = {
    val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DomPUpdate[S]]
  }
}

