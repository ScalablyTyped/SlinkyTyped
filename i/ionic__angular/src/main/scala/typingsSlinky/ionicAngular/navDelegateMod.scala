package typingsSlinky.ionicAngular

import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.ViewContainerRef
import typingsSlinky.ionicAngular.angularDelegateMod.AngularDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/nav-delegate", JSImport.Namespace)
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
  }
  
}

