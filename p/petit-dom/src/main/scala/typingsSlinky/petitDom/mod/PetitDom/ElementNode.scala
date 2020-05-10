package typingsSlinky.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementNode[T /* <: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: petit-dom.petit-dom.PetitDom.DomElements[T] */ js.Any */] extends VNode {
  @JSName("props")
  val props_ElementNode: Props[E] = js.native
  @JSName("type")
  val type_ElementNode: T = js.native
}

object ElementNode {
  @scala.inline
  def apply[T, E](content: js.Array[VNode], isSVG: Boolean, props: Props[E], `type`: T): ElementNode[T, E] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementNode[T, E]]
  }
  @scala.inline
  implicit class ElementNodeOps[Self[t, e] <: ElementNode[t, e], T, E] (val x: Self[T, E]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T, E] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T, E]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[T, E]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[T, E]) with Other]
    @scala.inline
    def withProps(value: Props[E]): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: T): Self[T, E] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

