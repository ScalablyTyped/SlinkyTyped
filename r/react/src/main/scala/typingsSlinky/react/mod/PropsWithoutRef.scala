package typingsSlinky.react.mod

import typingsSlinky.react.reactStrings.ref
import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Ensures that the props do not include ref at all */
/* Rewritten from type alias, can be one of: 
  - P
  - typingsSlinky.std.Pick[
P, 
typingsSlinky.std.Exclude[/ * keyof P * / java.lang.String, typingsSlinky.react.reactStrings.ref]]
*/
trait PropsWithoutRef[P] extends js.Object

object PropsWithoutRef {
  @scala.inline
  implicit def apply[P](value: P): PropsWithoutRef[P] = value.asInstanceOf[PropsWithoutRef[P]]
  @scala.inline
  implicit def apply[P](value: Pick[P, Exclude[/* keyof P */ String, ref]]): PropsWithoutRef[P] = value.asInstanceOf[PropsWithoutRef[P]]
}

