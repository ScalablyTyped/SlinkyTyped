package typingsSlinky.reactThemeableTs.hocMod

import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.react.mod.SFC[P]
  - typingsSlinky.react.mod.ComponentClass[P, typingsSlinky.react.mod.ComponentState]
*/
trait TDecComponent[P] extends js.Object

object TDecComponent {
  @scala.inline
  implicit def apply[P](value: ComponentClass[P, js.Object]): TDecComponent[P] = value.asInstanceOf[TDecComponent[P]]
  @scala.inline
  implicit def apply[P](value: SFC[P]): TDecComponent[P] = value.asInstanceOf[TDecComponent[P]]
}

