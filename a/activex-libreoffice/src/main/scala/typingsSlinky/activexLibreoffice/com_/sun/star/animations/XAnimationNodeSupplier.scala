package typingsSlinky.activexLibreoffice.com_.sun.star.animations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XAnimationNodeSupplier extends js.Object {
  val AnimationNode: XAnimationNode = js.native
  def getAnimationNode(): XAnimationNode = js.native
}

object XAnimationNodeSupplier {
  @scala.inline
  def apply(AnimationNode: XAnimationNode, getAnimationNode: () => XAnimationNode): XAnimationNodeSupplier = {
    val __obj = js.Dynamic.literal(AnimationNode = AnimationNode.asInstanceOf[js.Any], getAnimationNode = js.Any.fromFunction0(getAnimationNode))
    __obj.asInstanceOf[XAnimationNodeSupplier]
  }
  @scala.inline
  implicit class XAnimationNodeSupplierOps[Self <: XAnimationNodeSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnimationNode(value: XAnimationNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AnimationNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAnimationNode(value: () => XAnimationNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnimationNode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

