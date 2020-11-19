package typingsSlinky.reactMove.components

import slinky.core.facade.ReactElement
import typingsSlinky.reactMove.mod.HashMap
import typingsSlinky.reactMove.nodeGroupMod.INodeGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NodeGroup {
  
  @JSImport("react-move", "NodeGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: INodeGroupProps): SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.mod.NodeGroup] = new SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.mod.NodeGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    children: js.Array[_] => ReactElement,
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap
  ): SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.mod.NodeGroup] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    new SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.mod.NodeGroup](js.Array(this.component, __props.asInstanceOf[INodeGroupProps]))
  }
}
