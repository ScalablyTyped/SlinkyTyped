package typingsSlinky.petitDom.mod.PetitDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentClassNode[P /* <: ComponentProps */] extends VNode {
  @JSName("props")
  val props_ComponentClassNode: P with IntrinsicProps = js.native
  @JSName("type")
  val type_ComponentClassNode: ComponentClass[P] = js.native
}

object ComponentClassNode {
  @scala.inline
  def apply[P](content: js.Array[VNode], isSVG: Boolean, props: P with IntrinsicProps, `type`: ComponentClass[P]): ComponentClassNode[P] = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], isSVG = isSVG.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentClassNode[P]]
  }
  @scala.inline
  implicit class ComponentClassNodeOps[Self[p] <: ComponentClassNode[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withProps(value: P with IntrinsicProps): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ComponentClass[P]): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

