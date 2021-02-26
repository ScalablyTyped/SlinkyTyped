package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.ionicAngular.angularDelegateMod.AngularDelegate
import typingsSlinky.ionicAngular.overlayMod.OverlayBaseController
import typingsSlinky.ionicCore.componentsMod.global.HTMLIonPopoverElement
import typingsSlinky.ionicCore.mod.ComponentRef
import typingsSlinky.ionicCore.popoverInterfaceMod.PopoverOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverControllerMod {
  
  @JSImport("@ionic/angular/providers/popover-controller", "PopoverController")
  @js.native
  class PopoverController protected () extends OverlayBaseController[PopoverOptions[ComponentRef], HTMLIonPopoverElement] {
    def this(angularDelegate: AngularDelegate, resolver: ComponentFactoryResolver, injector: Injector) = this()
    
    var angularDelegate: js.Any = js.native
    
    var injector: js.Any = js.native
    
    var resolver: js.Any = js.native
  }
}
