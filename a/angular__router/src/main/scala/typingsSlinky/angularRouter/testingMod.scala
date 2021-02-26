package typingsSlinky.angularRouter

import typingsSlinky.angularCommon.mod.Location
import typingsSlinky.angularCore.mod.Compiler
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.ModuleWithProviders
import typingsSlinky.angularCore.mod.NgModuleFactoryLoader
import typingsSlinky.angularRouter.mod.ChildrenOutletContexts
import typingsSlinky.angularRouter.mod.ExtraOptions
import typingsSlinky.angularRouter.mod.Route
import typingsSlinky.angularRouter.mod.Router
import typingsSlinky.angularRouter.mod.Routes
import typingsSlinky.angularRouter.mod.UrlHandlingStrategy
import typingsSlinky.angularRouter.mod.UrlSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/router/testing", "RouterTestingModule")
  @js.native
  class RouterTestingModule ()
    extends typingsSlinky.angularRouter.testingTestingMod.RouterTestingModule
  /* static members */
  object RouterTestingModule {
    
    @JSImport("@angular/router/testing", "RouterTestingModule.withRoutes")
    @js.native
    def withRoutes(routes: Routes): ModuleWithProviders[typingsSlinky.angularRouter.testingTestingMod.RouterTestingModule] = js.native
    @JSImport("@angular/router/testing", "RouterTestingModule.withRoutes")
    @js.native
    def withRoutes(routes: Routes, config: ExtraOptions): ModuleWithProviders[typingsSlinky.angularRouter.testingTestingMod.RouterTestingModule] = js.native
  }
  
  @JSImport("@angular/router/testing", "SpyNgModuleFactoryLoader")
  @js.native
  class SpyNgModuleFactoryLoader protected ()
    extends typingsSlinky.angularRouter.testingTestingMod.SpyNgModuleFactoryLoader {
    def this(compiler: Compiler) = this()
  }
  
  @JSImport("@angular/router/testing", "setupTestingRouter")
  @js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]]
  ): Router = js.native
  @JSImport("@angular/router/testing", "setupTestingRouter")
  @js.native
  def setupTestingRouter(
    urlSerializer: UrlSerializer,
    contexts: ChildrenOutletContexts,
    location: Location,
    loader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    routes: js.Array[js.Array[Route]],
    opts: js.UndefOr[scala.Nothing],
    urlHandlingStrategy: UrlHandlingStrategy
  ): Router = js.native
  @JSImport("@angular/router/testing", "setupTestingRouter")
  @js.native
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
  @JSImport("@angular/router/testing", "setupTestingRouter")
  @js.native
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
  @JSImport("@angular/router/testing", "setupTestingRouter")
  @js.native
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
}
