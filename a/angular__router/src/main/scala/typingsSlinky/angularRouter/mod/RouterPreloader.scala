package typingsSlinky.angularRouter.mod

import typingsSlinky.angularCore.mod.Compiler
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.NgModuleFactoryLoader
import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.rxjs.mod.Observable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/router", "RouterPreloader")
@js.native
class RouterPreloader protected () extends OnDestroy {
  def this(
    router: Router,
    moduleLoader: NgModuleFactoryLoader,
    compiler: Compiler,
    injector: Injector,
    preloadingStrategy: PreloadingStrategy
  ) = this()
  var injector: js.Any = js.native
  var loader: js.Any = js.native
  var preloadConfig: js.Any = js.native
  var preloadingStrategy: js.Any = js.native
  var processRoutes: js.Any = js.native
  var router: js.Any = js.native
  var subscription: js.Any = js.native
  def preload(): Observable_[_] = js.native
  def setUpPreloading(): Unit = js.native
}

