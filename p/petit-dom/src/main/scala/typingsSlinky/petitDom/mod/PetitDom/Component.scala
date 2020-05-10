package typingsSlinky.petitDom.mod.PetitDom

import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Component[P /* <: ComponentProps */] extends js.Object {
  def mount(props: P, content: js.Array[VNode]): Element = js.native
  def patch(
    element: Element,
    newProps: P,
    oldProps: P,
    newContent: js.Array[VNode],
    oldContent: js.Array[VNode]
  ): Element = js.native
  def unmount(element: Element): Unit = js.native
}

object Component {
  @scala.inline
  def apply[P](
    mount: (P, js.Array[VNode]) => Element,
    patch: (Element, P, P, js.Array[VNode], js.Array[VNode]) => Element,
    unmount: Element => Unit
  ): Component[P] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction2(mount), patch = js.Any.fromFunction5(patch), unmount = js.Any.fromFunction1(unmount))
    __obj.asInstanceOf[Component[P]]
  }
  @scala.inline
  implicit class ComponentOps[Self[p] <: Component[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withMount(value: (P, js.Array[VNode]) => Element): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPatch(value: (Element, P, P, js.Array[VNode], js.Array[VNode]) => Element): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patch")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withUnmount(value: Element => Unit): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unmount")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

