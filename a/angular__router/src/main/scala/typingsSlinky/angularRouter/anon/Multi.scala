package typingsSlinky.angularRouter.anon

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.angularCore.mod.ComponentRef
import typingsSlinky.angularCore.mod.InjectionToken
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularRouter.mod.ɵangularPackagesRouterRouterH
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multi extends js.Object {
  
  var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangularPackagesRouterRouterH]] = js.native
  
  var multi: js.UndefOr[scala.Nothing] = js.native
  
  var provide: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
  
  var useExisting: js.UndefOr[scala.Nothing] = js.native
  
  def useFactory(r: ɵangularPackagesRouterRouterH): js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit] = js.native
  @JSName("useFactory")
  var useFactory_Original: js.Function1[
    /* r */ ɵangularPackagesRouterRouterH, 
    js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit]
  ] = js.native
}
