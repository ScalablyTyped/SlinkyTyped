package typingsSlinky.fluxibleAddonsReact

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.dispatchr.mod.DispatcherInterface
import typingsSlinky.fluxible.baseStoreMod.^
import typingsSlinky.fluxible.mod.ComponentContext
import typingsSlinky.fluxibleAddonsReact.anon.TypeofComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fluxible-addons-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def connectToStores(
    Component: TypeofComponent,
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _]
  ): TypeofComponent = js.native
  def connectToStores(
    Component: TypeofComponent,
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): TypeofComponent = js.native
  
  def provideContext(Component: TypeofComponent): TypeofComponent = js.native
  def provideContext(Component: TypeofComponent, customContextTypes: js.Any): TypeofComponent = js.native
}
