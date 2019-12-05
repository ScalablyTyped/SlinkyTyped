package typingsSlinky.reactDashOnclickoutside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashOnclickoutsideMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Pick

  type ComponentConstructor[P] = ReactComponentClass[P]
  type OnClickOutProps[P] = WithoutInjectedClickOutProps[P] with AdditionalProps
  type PropsOf[T] = js.Any
  type WithoutInjectedClickOutProps[P] = Pick[P, Exclude[String, String]]
}
