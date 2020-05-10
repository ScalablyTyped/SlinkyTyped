package typingsSlinky.mithril.mod

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// In some lifecycle methods, Vnode will have a dom property
// and possibly a domSize property.
@js.native
trait VnodeDOM[Attrs, State /* <: Lifecycle[Attrs, State] */] extends Vnode[Attrs, State] {
  /** Points to the element that corresponds to the vnode. */
  var dom: Element = js.native
  /** This defines the number of DOM elements that the vnode represents (starting from the element referenced by the dom property). */
  var domSize: js.UndefOr[Double] = js.native
}

object VnodeDOM {
  @scala.inline
  def apply[Attrs, State](attrs: Attrs, dom: Element, state: State, tag: String | (ComponentTypes[Attrs, State])): VnodeDOM[Attrs, State] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], dom = dom.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[VnodeDOM[Attrs, State]]
  }
  @scala.inline
  implicit class VnodeDOMOps[Self[attrs, state] <: VnodeDOM[attrs, state], Attrs, State] (val x: Self[Attrs, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Attrs, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Attrs, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Attrs, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Attrs, State]) with Other]
    @scala.inline
    def withDom(value: Element): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDomSize(value: Double): Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomSize: Self[Attrs, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domSize")(js.undefined)
        ret
    }
  }
  
}

