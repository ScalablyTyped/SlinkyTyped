package typingsSlinky.javascriptObfuscator.icustomnodeMod

import typingsSlinky.javascriptObfuscator.iinitializableMod.IInitializable
import typingsSlinky.javascriptObfuscator.tstatementMod.TStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICustomNode
  extends IInitializable[js.Array[js.Any]] {
  /**
    * @returns ESTree.Node[]
    */
  def getNode(): js.Array[TStatement] = js.native
}

object ICustomNode {
  @scala.inline
  def apply(getNode: () => js.Array[TStatement], initialize: js.Array[js.Any] => Unit): ICustomNode = {
    val __obj = js.Dynamic.literal(getNode = js.Any.fromFunction0(getNode), initialize = js.Any.fromFunction1(initialize))
    __obj.asInstanceOf[ICustomNode]
  }
  @scala.inline
  implicit class ICustomNodeOps[Self <: ICustomNode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNode(value: () => js.Array[TStatement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNode")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

