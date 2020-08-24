package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StackItem {
  @JSImport("office-ui-fabric-react", "StackItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: IStackItemProps): SharedBuilder_IStackItemProps1971397930 = new SharedBuilder_IStackItemProps1971397930(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: StackItem.type): SharedBuilder_IStackItemProps1971397930 = new SharedBuilder_IStackItemProps1971397930(js.Array(this.component, js.Dictionary.empty))()
}

