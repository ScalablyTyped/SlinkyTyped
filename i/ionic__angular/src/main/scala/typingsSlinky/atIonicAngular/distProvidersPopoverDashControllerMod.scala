package typingsSlinky.atIonicAngular

import typingsSlinky.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate
import typingsSlinky.atIonicAngular.distUtilOverlayMod.OverlayBaseController
import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentRef
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonPopoverElement
import typingsSlinky.atIonicCore.distTypesComponentsPopoverPopoverDashInterfaceMod.PopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/popover-controller", JSImport.Namespace)
@js.native
object distProvidersPopoverDashControllerMod extends js.Object {
  @js.native
  class PopoverController protected () extends OverlayBaseController[PopoverOptions[ComponentRef], HTMLIonPopoverElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    var angularDelegate: js.Any = js.native
    var injector: js.Any = js.native
    var resolver: js.Any = js.native
  }
  
}

