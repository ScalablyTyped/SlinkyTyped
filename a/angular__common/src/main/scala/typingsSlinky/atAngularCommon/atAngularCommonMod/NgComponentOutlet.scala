package typingsSlinky.atAngularCommon.atAngularCommonMod

import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atAngularCore.atAngularCoreMod.NgModuleFactory
import typingsSlinky.atAngularCore.atAngularCoreMod.OnChanges
import typingsSlinky.atAngularCore.atAngularCoreMod.OnDestroy
import typingsSlinky.atAngularCore.atAngularCoreMod.SimpleChanges
import typingsSlinky.atAngularCore.atAngularCoreMod.Type
import typingsSlinky.atAngularCore.atAngularCoreMod.ViewContainerRef
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
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  /**
    * A callback method that performs custom clean-up, invoked immediately
    * after a directive, pipe, or service instance is destroyed.
    */
  /* CompleteClass */
  override def ngOnDestroy(): Unit = js.native
}

