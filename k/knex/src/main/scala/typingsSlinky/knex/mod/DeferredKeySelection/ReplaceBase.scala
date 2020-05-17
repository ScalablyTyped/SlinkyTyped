package typingsSlinky.knex.mod.DeferredKeySelection

import typingsSlinky.knex.mod.ArrayIfAlready
import typingsSlinky.knex.mod.UnwrapArrayMember
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// If TSelection is already a deferred selection, then replace the base with TBase
// If unknown, create a new deferred selection with TBase as the base
// Else, retain original
//
// For practical reasons applicable to current context, we always return arrays of
// deferred selections. So, this particular operator may not be useful in generic contexts.
/* Rewritten from type alias, can be one of: 
  - TSelection
  - typingsSlinky.knex.mod.ArrayIfAlready[
TSelection, 
typingsSlinky.knex.mod.DeferredKeySelection.SetBase[js.Any | typingsSlinky.knex.mod.UnwrapArrayMember[TSelection], TBase]]
*/
trait ReplaceBase[TSelection, TBase] extends js.Object

object ReplaceBase {
  @scala.inline
  implicit def apply[TSelection, TBase](value: ArrayIfAlready[TSelection, SetBase[js.Any | UnwrapArrayMember[TSelection], TBase]]): ReplaceBase[TSelection, TBase] = value.asInstanceOf[ReplaceBase[TSelection, TBase]]
  @scala.inline
  implicit def apply[TSelection, TBase](value: TSelection): ReplaceBase[TSelection, TBase] = value.asInstanceOf[ReplaceBase[TSelection, TBase]]
}

