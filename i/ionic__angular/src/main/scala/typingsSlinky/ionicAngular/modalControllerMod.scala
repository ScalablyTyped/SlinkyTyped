package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.ionicAngular.angularDelegateMod.AngularDelegate
import typingsSlinky.ionicAngular.overlayMod.OverlayBaseController
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonModalElement
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.modalInterfaceMod.ModalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalControllerMod {
  
  @JSImport("@ionic/angular/providers/modal-controller", "ModalController")
  @js.native
  class ModalController protected () extends OverlayBaseController[ModalOptions[ComponentRef], HTMLIonModalElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    
    var angularDelegate: js.Any = js.native
    
    var injector: js.Any = js.native
    
    var resolver: js.Any = js.native
  }
}
