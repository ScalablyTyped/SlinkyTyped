package typingsSlinky.atAngularRouter

import typingsSlinky.atAngularCommon.atAngularCommonMod.Location
import typingsSlinky.atAngularCore.atAngularCoreMod.Compiler
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typingsSlinky.atAngularCore.atAngularCoreMod.NgModuleFactoryLoader
import typingsSlinky.atAngularRouter.atAngularRouterMod.ChildrenOutletContexts
import typingsSlinky.atAngularRouter.atAngularRouterMod.ExtraOptions
import typingsSlinky.atAngularRouter.atAngularRouterMod.Route
import typingsSlinky.atAngularRouter.atAngularRouterMod.Router
import typingsSlinky.atAngularRouter.atAngularRouterMod.Routes
import typingsSlinky.atAngularRouter.atAngularRouterMod.UrlHandlingStrategy
import typingsSlinky.atAngularRouter.atAngularRouterMod.UrlSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router/testing", JSImport.Namespace)
@js.native
object testingMod extends js.Object {
  @js.native
  class RouterTestingModule ()
    extends typingsSlinky.atAngularRouter.testingTestingMod.RouterTestingModule
  
  @js.native
  class SpyNgModuleFactoryLoader protected ()
    extends typingsSlinky.atAngularRouter.testingTestingMod.SpyNgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
  }
  
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]]
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: ExtraOptions,
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  /* static members */
  @js.native
  object RouterTestingModule extends js.Object {
    def withRoutes(routes: Routes): ModuleWithProviders[typingsSlinky.atAngularRouter.testingTestingMod.RouterTestingModule] = js.native
    def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[typingsSlinky.atAngularRouter.testingTestingMod.RouterTestingModule] = js.native
  }
  
}

