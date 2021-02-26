package typingsSlinky.fluxibleAddonsReact

import org.scalablytyped.runtime.Instantiable1
import slinky.core.ReactComponentClass
import typingsSlinky.dispatchr.mod.DispatcherInterface
import typingsSlinky.fluxible.baseStoreMod.^
import typingsSlinky.fluxible.mod.ComponentContext
import typingsSlinky.fluxibleAddonsReact.anon.TypeofComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fluxible-addons-react", "connectToStores")
  @js.native
  def connectToStores(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      ReactComponentClass[js.Object]
    ]),
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _]
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    ReactComponentClass[js.Object]
  ]) = js.native
  @JSImport("fluxible-addons-react", "connectToStores")
  @js.native
  def connectToStores(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      ReactComponentClass[js.Object]
    ]),
    stores: js.Array[(Instantiable1[/* dispatcher */ DispatcherInterface, ^[js.Object]]) | String],
    getStateFromStores: js.Function2[/* context */ ComponentContext, /* props */ js.Any, _],
    customContextTypes: js.Any
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    ReactComponentClass[js.Object]
  ]) = js.native
  
  @JSImport("fluxible-addons-react", "provideContext")
  @js.native
  def provideContext(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      ReactComponentClass[js.Object]
    ])
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    ReactComponentClass[js.Object]
  ]) = js.native
  @JSImport("fluxible-addons-react", "provideContext")
  @js.native
  def provideContext(
    Component: TypeofComponent with (Instantiable1[
      /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
      ReactComponentClass[js.Object]
    ]),
    customContextTypes: js.Any
  ): TypeofComponent with (Instantiable1[
    /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ js.Any, 
    ReactComponentClass[js.Object]
  ]) = js.native
}
