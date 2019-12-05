package typingsSlinky.agDashGrid

import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentProviderMod.AgGridComponentFunctionInput
import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentProviderMod.AgGridRegisteredComponentInput
import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentSource
import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ComponentType
import typingsSlinky.agDashGrid.distLibComponentsFrameworkComponentResolverMod.ResolvedComponent
import typingsSlinky.agDashGrid.distLibInterfacesIComponentMod.IComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/components/framework/agComponentUtils", JSImport.Namespace)
@js.native
object distLibComponentsFrameworkAgComponentUtilsMod extends js.Object {
  @js.native
  class AgComponentUtils () extends js.Object {
    var componentMetadataProvider: js.Any = js.native
    def adaptCellRendererFunction(callback: AgGridComponentFunctionInput): Anon_Any = js.native
    def adaptFunction[A /* <: IComponent[_] with B */, B](
      propertyName: String,
      hardcodedJsFunction: AgGridComponentFunctionInput,
      `type`: ComponentType,
      source: ComponentSource
    ): ResolvedComponent[A, B] = js.native
    def doesImplementIComponent(candidate: AgGridRegisteredComponentInput[IComponent[_]]): Boolean = js.native
  }
  
}

