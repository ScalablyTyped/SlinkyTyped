package typingsSlinky.atIonicAngular

import typingsSlinky.atAngularCore.atAngularCoreMod.ComponentFactoryResolver
import typingsSlinky.atAngularCore.atAngularCoreMod.ElementRef
import typingsSlinky.atAngularCore.atAngularCoreMod.Injector
import typingsSlinky.atAngularCore.atAngularCoreMod.ViewContainerRef
import typingsSlinky.atIonicAngular.distProvidersAngularDashDelegateMod.AngularDelegate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular/dist/directives/navigation/nav-delegate", JSImport.Namespace)
@js.native
object distDirectivesNavigationNavDashDelegateMod extends js.Object {
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

