package typingsSlinky.angularCore.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugNodePOSTR3 extends DebugNode {
  @JSName("nativeNode")
  val nativeNode_DebugNodePOSTR3: Node = js.native
}

object DebugNodePOSTR3 {
  @scala.inline
  def apply(
    componentInstance: js.Any,
    context: js.Any,
    injector: Injector,
    listeners: js.Array[DebugEventListener],
    nativeNode: Node,
    providerTokens: js.Array[_],
    references: StringDictionary[js.Any]
  ): DebugNodePOSTR3 = {
    val __obj = js.Dynamic.literal(componentInstance = componentInstance.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], injector = injector.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], nativeNode = nativeNode.asInstanceOf[js.Any], providerTokens = providerTokens.asInstanceOf[js.Any], references = references.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugNodePOSTR3]
  }
  @scala.inline
  implicit class DebugNodePOSTR3Ops[Self <: DebugNodePOSTR3] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNativeNode(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nativeNode")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

