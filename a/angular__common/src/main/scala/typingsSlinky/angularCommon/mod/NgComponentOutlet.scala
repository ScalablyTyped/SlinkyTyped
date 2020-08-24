package typingsSlinky.angularCommon.mod

import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.NgModuleFactory
import typingsSlinky.angularCore.mod.OnChanges
import typingsSlinky.angularCore.mod.OnDestroy
import typingsSlinky.angularCore.mod.Type
import typingsSlinky.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "NgComponentOutlet")
@js.native
class NgComponentOutlet protected ()
  extends OnChanges
     with OnDestroy {
  def this(_viewContainerRef: ViewContainerRef) = this()
  var _componentRef: js.Any = js.native
  var _moduleRef: js.Any = js.native
  var _viewContainerRef: js.Any = js.native
  var ngComponentOutlet: Type[_] = js.native
  var ngComponentOutletContent: js.Array[js.Array[_]] = js.native
  var ngComponentOutletInjector: Injector = js.native
  var ngComponentOutletNgModuleFactory: NgModuleFactory[_] = js.native
}

