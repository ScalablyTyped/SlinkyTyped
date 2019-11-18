package typingsSlinky.atAngularRouter

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.atAngularCore.atAngularCoreMod.ComponentRef
import typingsSlinky.atAngularCore.atAngularCoreMod.InjectionToken
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atAngularRouter.atAngularRouterMod.ɵangular_packages_router_router_h
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_BootstrappedComponentRef extends js.Object {
  var deps: js.Array[Instantiable1[/* injector */ Injector, ɵangular_packages_router_router_h]] = js.native
  var multi: js.UndefOr[scala.Nothing] = js.native
  var provide: InjectionToken[js.Function1[/* compRef */ ComponentRef[_], Unit]] = js.native
  var useExisting: js.UndefOr[scala.Nothing] = js.native
  @JSName("useFactory")
  var useFactory_Original: js.Function1[
    /* r */ ɵangular_packages_router_router_h, 
    js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit]
  ] = js.native
  def useFactory(r: ɵangular_packages_router_router_h): js.Function1[/* bootstrappedComponentRef */ ComponentRef[_], Unit] = js.native
}

