package typingsSlinky.prosemirrorMenu.mod

import typingsSlinky.prosemirrorMenu.anon.Dom
import typingsSlinky.prosemirrorModel.mod.Schema
import typingsSlinky.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuElement[S /* <: Schema[_, _] */] extends js.Object {
  /**
    * Render the element for display in the menu. Must return a DOM
    * element and a function that can be used to update the element to
    * a new state. The `update` function will return false if the
    * update hid the entire element.
    */
  def render(pm: EditorView[S]): Dom[S] = js.native
}

object MenuElement {
  @scala.inline
  def apply[S](render: EditorView[S] => Dom[S]): MenuElement[S] = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[MenuElement[S]]
  }
  @scala.inline
  implicit class MenuElementOps[Self[s] <: MenuElement[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withRender(value: EditorView[S] => Dom[S]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

