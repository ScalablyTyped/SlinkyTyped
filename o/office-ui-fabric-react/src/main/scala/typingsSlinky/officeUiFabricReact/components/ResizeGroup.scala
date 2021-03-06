package typingsSlinky.officeUiFabricReact.components

import slinky.core.facade.ReactElement
import typingsSlinky.officeUiFabricReact.resizeGroupTypesMod.IResizeGroupProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ResizeGroup {
  
  @scala.inline
  def apply(data: js.Any, onReduceData: js.Any => js.Any, onRenderData: js.Any => ReactElement): SharedBuilder_IResizeGroupProps1800450644[typingsSlinky.officeUiFabricReact.mod.ResizeGroup] = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any], onReduceData = js.Any.fromFunction1(onReduceData), onRenderData = js.Any.fromFunction1(onRenderData))
    new SharedBuilder_IResizeGroupProps1800450644[typingsSlinky.officeUiFabricReact.mod.ResizeGroup](js.Array(this.component, __props.asInstanceOf[IResizeGroupProps]))
  }
  
  @JSImport("office-ui-fabric-react", "ResizeGroup")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IResizeGroupProps): SharedBuilder_IResizeGroupProps1800450644[typingsSlinky.officeUiFabricReact.mod.ResizeGroup] = new SharedBuilder_IResizeGroupProps1800450644[typingsSlinky.officeUiFabricReact.mod.ResizeGroup](js.Array(this.component, p.asInstanceOf[js.Any]))
}
