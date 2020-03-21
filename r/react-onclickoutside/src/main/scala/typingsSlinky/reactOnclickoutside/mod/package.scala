package typingsSlinky.reactOnclickoutside

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ComponentConstructor[P] = slinky.core.ReactComponentClass[P]
  type OnClickOutProps[P] = typingsSlinky.reactOnclickoutside.mod.WithoutInjectedClickOutProps[P] with typingsSlinky.reactOnclickoutside.mod.AdditionalProps
  type PropsOf[T] = js.Any
  type WithoutInjectedClickOutProps[P] = typingsSlinky.std.Pick[P, typingsSlinky.std.Exclude[java.lang.String, java.lang.String]]
}
