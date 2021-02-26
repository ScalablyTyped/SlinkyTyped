package typingsSlinky.reactMove.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactMove.mod.HashMap
import typingsSlinky.reactMove.nodeGroupMod.INodeGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object INodeGroup {
  
  @scala.inline
  def apply(
    children: js.Array[_] => ReactElement,
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap
  ): SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    new SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup](js.Array(this.component, __props.asInstanceOf[INodeGroupProps]))
  }
  
  @JSImport("react-move/NodeGroup", "INodeGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: INodeGroupProps): SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup] = new SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
