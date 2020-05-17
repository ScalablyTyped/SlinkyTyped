package typingsSlinky.ionicCore.navInterfaceMod

import typingsSlinky.ionicCore.mod.ComponentRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.ionicCore.mod.ComponentRef
  - typingsSlinky.ionicCore.viewControllerMod.ViewController
*/
trait NavComponent extends js.Object

object NavComponent {
  @scala.inline
  implicit def apply(value: ComponentRef): NavComponent = value.asInstanceOf[NavComponent]
  @scala.inline
  implicit def apply(value: typingsSlinky.ionicCore.viewControllerMod.ViewController): NavComponent = value.asInstanceOf[NavComponent]
}

