package typingsSlinky.nivoColors.mod

import typingsSlinky.nivoColors.anon.From
import typingsSlinky.nivoColors.anon.Theme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.nivoColors.anon.Theme
  - typingsSlinky.nivoColors.anon.From
  - typingsSlinky.nivoColors.mod.InheritedColorFunction[D]
*/
trait InheritedColorProp[D] extends js.Object

object InheritedColorProp {
  @scala.inline
  implicit def apply[D](value: From): InheritedColorProp[D] = value.asInstanceOf[InheritedColorProp[D]]
  @scala.inline
  implicit def apply[D](value: InheritedColorFunction[D]): InheritedColorProp[D] = value.asInstanceOf[InheritedColorProp[D]]
  @scala.inline
  implicit def apply[D](value: String): InheritedColorProp[D] = value.asInstanceOf[InheritedColorProp[D]]
  @scala.inline
  implicit def apply[D](value: Theme): InheritedColorProp[D] = value.asInstanceOf[InheritedColorProp[D]]
}

