package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.buttonGridTypesMod.IButtonGridProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridBase {
  
  @scala.inline
  def apply(columnCount: Double, items: js.Array[_], onRenderItem: (js.Any, Double) => ReactElement): SharedBuilder_IButtonGridProps523119058[typingsSlinky.officeUiFabricReact.buttonGridBaseMod.GridBase] = {
    val __props = js.Dynamic.literal(columnCount = columnCount.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], onRenderItem = js.Any.fromFunction2(onRenderItem))
    new SharedBuilder_IButtonGridProps523119058[typingsSlinky.officeUiFabricReact.buttonGridBaseMod.GridBase](js.Array(this.component, __props.asInstanceOf[IButtonGridProps]))
  }
  
  @JSImport("office-ui-fabric-react/lib/utilities/ButtonGrid/ButtonGrid.base", "GridBase")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IButtonGridProps): SharedBuilder_IButtonGridProps523119058[typingsSlinky.officeUiFabricReact.buttonGridBaseMod.GridBase] = new SharedBuilder_IButtonGridProps523119058[typingsSlinky.officeUiFabricReact.buttonGridBaseMod.GridBase](js.Array(this.component, p.asInstanceOf[js.Any]))
}
