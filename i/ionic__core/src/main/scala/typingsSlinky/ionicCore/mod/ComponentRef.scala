package typingsSlinky.ionicCore.mod

import org.scalajs.dom.raw.HTMLElement
import typingsSlinky.ionicCore.navInterfaceMod.NavComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - js.Function
  - typingsSlinky.std.HTMLElement
  - java.lang.String
  - scala.Null
*/
trait ComponentRef extends NavComponent

object ComponentRef {
  @scala.inline
  implicit def apply(value: js.Function): ComponentRef = value.asInstanceOf[ComponentRef]
  @scala.inline
  implicit def apply(value: HTMLElement): ComponentRef = value.asInstanceOf[ComponentRef]
  @scala.inline
  implicit def apply(value: Null): ComponentRef = value.asInstanceOf[ComponentRef]
  @scala.inline
  implicit def apply(value: String): ComponentRef = value.asInstanceOf[ComponentRef]
}

