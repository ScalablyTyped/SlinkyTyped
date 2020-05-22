package typingsSlinky.javascriptObfuscator.icontrolflowreplacerMod

import org.scalajs.dom.raw.Node
import typingsSlinky.javascriptObfuscator.tcontrolflowstorageMod.TControlFlowStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlFlowReplacer extends js.Object {
  /**
    * @param node
    * @param parentNode
    * @param controlFlowStorage
    * @returns ESTree.Node
    */
  def replace(node: Node, parentNode: Node, controlFlowStorage: TControlFlowStorage): Node
}

object IControlFlowReplacer {
  @scala.inline
  def apply(replace: (Node, Node, TControlFlowStorage) => Node): IControlFlowReplacer = {
    val __obj = js.Dynamic.literal(replace = js.Any.fromFunction3(replace))
    __obj.asInstanceOf[IControlFlowReplacer]
  }
}

