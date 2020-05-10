package typingsSlinky.reactMove.components

import typingsSlinky.reactMove.mod.HashMap
import typingsSlinky.reactMove.nodeGroupMod.INodeGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object INodeGroup {
  @JSImport("react-move/NodeGroup", "INodeGroup")
  @js.native
  object component extends js.Object
  
  def withProps(p: INodeGroupProps): SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup] = new SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap
  ): SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    new SharedBuilder_INodeGroupProps1345005892[typingsSlinky.reactMove.nodeGroupMod.INodeGroup](js.Array(this.component, __props.asInstanceOf[INodeGroupProps]))
  }
}

