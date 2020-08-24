package typingsSlinky.ionicAngular.mod

import typingsSlinky.angularCore.mod.ComponentFactoryResolver
import typingsSlinky.angularCore.mod.ElementRef
import typingsSlinky.angularCore.mod.Injector
import typingsSlinky.angularCore.mod.ViewContainerRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/angular", "NavDelegate")
@js.native
class NavDelegate protected ()
  extends typingsSlinky.ionicAngular.navDelegateMod.NavDelegate {
  def this(
    ref: ElementRef[_],
    resolver: ComponentFactoryResolver,
    injector: Injector,
    angularDelegate: typingsSlinky.ionicAngular.angularDelegateMod.AngularDelegate,
    location: ViewContainerRef
  ) = this()
}

