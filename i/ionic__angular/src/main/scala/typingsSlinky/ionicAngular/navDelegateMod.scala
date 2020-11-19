package typingsSlinky.ionicAngular

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.ViewContainerRef
import typingsSlinky.ionicAngular.angularDelegateMod.AngularDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/angular/directives/navigation/nav-delegate", JSImport.Namespace)
@js.native
object navDelegateMod extends js.Object {
  
  @js.native
  class NavDelegate protected () extends js.Object {
    def this(
      ref: ElementRef[_],
      resolver: ComponentFactoryResolver,
      injector: Injector,
      angularDelegate: AngularDelegate,
      location: ViewContainerRef
    ) = this()
    
    var el: HTMLElement = js.native
  }
}
