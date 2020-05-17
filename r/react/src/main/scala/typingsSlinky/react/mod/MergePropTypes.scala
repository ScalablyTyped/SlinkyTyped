package typingsSlinky.react.mod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Try to resolve ill-defined props like for JS users: props can be any, or sometimes objects with properties of type any
/* Rewritten from type alias, can be one of: 
  - (typingsSlinky.std.Pick[P, typingsSlinky.react.mod.NotExactlyAnyPropertyKeys[P]]) with (typingsSlinky.std.Pick[
T, 
typingsSlinky.std.Exclude[
  / * keyof T * / java.lang.String, 
  typingsSlinky.react.mod.NotExactlyAnyPropertyKeys[P]
]]) with (typingsSlinky.std.Pick[
P, 
typingsSlinky.std.Exclude[/ * keyof P * / java.lang.String, / * keyof T * / java.lang.String]])
  - P
  - T
*/
trait MergePropTypes[P, T]
  extends ReactManagedAttributes[js.Any, P]

object MergePropTypes {
  @scala.inline
  implicit def apply[P, T](
    value: (Pick[P, NotExactlyAnyPropertyKeys[P]]) with (Pick[T, Exclude[/* keyof T */ String, NotExactlyAnyPropertyKeys[P]]]) with (Pick[P, Exclude[/* keyof P */ String, /* keyof T */ String]])
  ): MergePropTypes[P, T] = value.asInstanceOf[MergePropTypes[P, T]]
  @scala.inline
  implicit def apply[P, T](value: P | T): MergePropTypes[P, T] = value.asInstanceOf[MergePropTypes[P, T]]
}

