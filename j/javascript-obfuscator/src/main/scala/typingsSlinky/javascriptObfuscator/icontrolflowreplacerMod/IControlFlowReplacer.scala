package typingsSlinky.javascriptObfuscator.icontrolflowreplacerMod

import org.scalajs.dom.raw.Node
import typingsSlinky.javascriptObfuscator.tcontrolflowstorageMod.TControlFlowStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IControlFlowReplacer extends js.Object {
  /**
    * @param node
    * @param parentNode
    * @param controlFlowStorage
    * @returns ESTree.Node
    */
  def replace(node: Node, parentNode: Node, controlFlowStorage: TControlFlowStorage): Node = js.native
}

object IControlFlowReplacer {
  @scala.inline
  def apply(replace: (Node, Node, TControlFlowStorage) => Node): IControlFlowReplacer = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction3(replace))
    __obj.asInstanceOf[IControlFlowReplacer]
  }
  @scala.inline
  implicit class IControlFlowReplacerOps[Self <: IControlFlowReplacer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReplace(value: (Node, Node, TControlFlowStorage) => Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

