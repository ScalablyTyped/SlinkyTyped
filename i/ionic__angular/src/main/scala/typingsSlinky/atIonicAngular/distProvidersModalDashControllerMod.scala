package typingsSlinky.atIonicAngular

import typingsSlinky.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate
import typingsSlinky.atIonicAngular.distUtilOverlayMod.OverlayBaseController
import typingsSlinky.atIonicCore.atIonicCoreMod.ComponentRef
import typingsSlinky.atIonicCore.distTypesComponentsMod._Global_.HTMLIonModalElement
import typingsSlinky.atIonicCore.distTypesComponentsModalModalDashInterfaceMod.ModalOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/providers/modal-controller", JSImport.Namespace)
@js.native
object distProvidersModalDashControllerMod extends js.Object {
  @js.native
  class ModalController protected () extends OverlayBaseController[ModalOptions[ComponentRef], HTMLIonModalElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    var angularDelegate: js.Any = js.native
    var injector: js.Any = js.native
    var resolver: js.Any = js.native
  }
  
}

