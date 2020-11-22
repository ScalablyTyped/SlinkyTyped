package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ButtonGridBase {
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "ButtonGridBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IButtonGridProps): SharedBuilder_IButtonGridProps2062964594 = new SharedBuilder_IButtonGridProps2062964594(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(columnCount: Double, items: js.Array[_], onRenderItem: (js.Any, Double) => ReactElement): SharedBuilder_IButtonGridProps2062964594 = {
    val __props = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
    new SharedBuilder_IButtonGridProps2062964594(js.Array(this.component, __props.asInstanceOf[IButtonGridProps]))
  }
}
