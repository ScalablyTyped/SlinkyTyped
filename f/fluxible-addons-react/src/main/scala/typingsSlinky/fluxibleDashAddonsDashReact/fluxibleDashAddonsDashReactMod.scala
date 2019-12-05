package typingsSlinky.fluxibleDashAddonsDashReact

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.dispatchr.dispatchrMod.DispatcherInterface
import typingsSlinky.fluxible.addonsBaseStoreMod.^
import typingsSlinky.fluxible.fluxibleMod.ComponentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluxible-addons-react", JSImport.Namespace)
@js.native
object fluxibleDashAddonsDashReactMod extends js.Object {
  def connectToStores(
    Component: TypeofClassComponent,
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _]
  ): TypeofClassComponent = js.native
  def connectToStores(
    Component: TypeofClassComponent,
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): TypeofClassComponent = js.native
  def provideContext(Component: TypeofClassComponent): TypeofClassComponent = js.native
  def provideContext(Component: TypeofClassComponent, customContextTypes: js.Any): TypeofClassComponent = js.native
}

