package typingsSlinky.reactMove.components

import typingsSlinky.reactMove.mod.HashMap
import typingsSlinky.reactMove.nodeGroupMod.INodeGroupProps
import typingsSlinky.reactMove.nodeGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NodeGroup {
  @JSImport("react-move/NodeGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: INodeGroupProps): SharedBuilder_INodeGroupProps1345005892[default] = new SharedBuilder_INodeGroupProps1345005892[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(
    data: js.Array[_],
    keyAccessor: (js.Any, Double) => String | Double,
    start: (js.Any, Double) => HashMap
  ): SharedBuilder_INodeGroupProps1345005892[default] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], keyAccessor = js.Any.fromFunction2(keyAccessor), start = js.Any.fromFunction2(start))
    new SharedBuilder_INodeGroupProps1345005892[default](js.Array(this.component, __props.asInstanceOf[INodeGroupProps]))
  }
}

