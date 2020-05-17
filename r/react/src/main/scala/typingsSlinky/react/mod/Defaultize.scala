package typingsSlinky.react.mod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Extract
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Any prop that has a default prop becomes optional, but its type is unchanged
// Undeclared default props are augmented into the resulting allowable attributes
// If declared props have indexed properties, ignore default props entirely as keyof gets widened
// Wrap in an outer-level conditional type to allow distribution over props that are unions
/* Rewritten from type alias, can be one of: 
  - (typingsSlinky.std.Pick[
P, 
typingsSlinky.std.Exclude[/ * keyof P * / java.lang.String, / * keyof D * / java.lang.String]]) with (typingsSlinky.std.Partial[
typingsSlinky.std.Pick[
  P, 
  typingsSlinky.std.Extract[/ * keyof P * / java.lang.String, / * keyof D * / java.lang.String]
]]) with (typingsSlinky.std.Partial[
typingsSlinky.std.Pick[
  D, 
  typingsSlinky.std.Exclude[/ * keyof D * / java.lang.String, / * keyof P * / java.lang.String]
]])
  - P
*/
trait Defaultize[P, D]
  extends ReactManagedAttributes[js.Any, js.Any]

object Defaultize {
  @scala.inline
  implicit def apply[P, D](
    value: (Pick[P, Exclude[/* keyof P */ String, /* keyof D */ String]]) with (Partial[Pick[P, Extract[/* keyof P */ String, /* keyof D */ String]]]) with (Partial[Pick[D, Exclude[/* keyof D */ String, /* keyof P */ String]]])
  ): Defaultize[P, D] = value.asInstanceOf[Defaultize[P, D]]
  @scala.inline
  implicit def apply[P, D](value: P): Defaultize[P, D] = value.asInstanceOf[Defaultize[P, D]]
}

