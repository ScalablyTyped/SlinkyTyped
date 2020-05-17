package typingsSlinky.formstate.formStateMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.formstate.typesMod.ComposibleValidatable
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - org.scalablytyped.runtime.StringDictionary[typingsSlinky.formstate.typesMod.ComposibleValidatable[js.Any]]
  - js.Array[typingsSlinky.formstate.typesMod.ComposibleValidatable[js.Any]]
  - typingsSlinky.std.Map[js.Any, typingsSlinky.formstate.typesMod.ComposibleValidatable[js.Any]]
*/
trait ValidatableMapOrArray extends js.Object

object ValidatableMapOrArray {
  @scala.inline
  implicit def apply(value: js.Array[ComposibleValidatable[js.Any]]): ValidatableMapOrArray = value.asInstanceOf[ValidatableMapOrArray]
  @scala.inline
  implicit def apply(value: Map[js.Any, ComposibleValidatable[js.Any]]): ValidatableMapOrArray = value.asInstanceOf[ValidatableMapOrArray]
  @scala.inline
  implicit def apply(value: StringDictionary[ComposibleValidatable[js.Any]]): ValidatableMapOrArray = value.asInstanceOf[ValidatableMapOrArray]
}

