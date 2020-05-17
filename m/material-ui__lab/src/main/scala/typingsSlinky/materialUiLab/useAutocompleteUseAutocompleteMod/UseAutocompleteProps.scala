package typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteSingleProps[T]
  - typingsSlinky.materialUiLab.useAutocompleteUseAutocompleteMod.UseAutocompleteMultipleProps[T]
*/
trait UseAutocompleteProps[T] extends js.Object

object UseAutocompleteProps {
  @scala.inline
  implicit def apply[T](value: UseAutocompleteMultipleProps[T]): UseAutocompleteProps[T] = value.asInstanceOf[UseAutocompleteProps[T]]
  @scala.inline
  implicit def apply[T](value: UseAutocompleteSingleProps[T]): UseAutocompleteProps[T] = value.asInstanceOf[UseAutocompleteProps[T]]
}

