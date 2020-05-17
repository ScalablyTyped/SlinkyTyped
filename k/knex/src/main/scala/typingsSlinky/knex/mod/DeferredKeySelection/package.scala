package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DeferredKeySelection {
  type AddAliases[TSelection, T] = typingsSlinky.knex.mod.DeferredKeySelection[
    js.Any, 
    js.Any | scala.Nothing, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    (js.Any with T) | T, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  type AddKey[TSelection, TKey /* <: java.lang.String */] = typingsSlinky.knex.mod.DeferredKeySelection[
    js.Any, 
    js.Any | TKey, 
    typingsSlinky.knex.knexBooleans.`true`, 
    js.Any | js.Object, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  type AddUnionMember[TSelection, T] = typingsSlinky.knex.mod.DeferredKeySelection[
    js.Any | TSelection, 
    js.Any | scala.Nothing, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    js.Any | js.Object, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | T
  ]
  type Any = typingsSlinky.knex.mod.DeferredKeySelection[js.Any, js.Any, js.Any, js.Any, js.Any, js.Any, js.Any]
  // Convenience utility to set base, keys and aliases in a single type
  // application
  type Augment[T, TBase, TKey /* <: java.lang.String */, TAliasMapping] = typingsSlinky.knex.mod.DeferredKeySelection.AddAliases[
    typingsSlinky.knex.mod.DeferredKeySelection.AddKey[typingsSlinky.knex.mod.DeferredKeySelection.SetBase[T, TBase], TKey], 
    TAliasMapping
  ]
  // Replace the Base if already a deferred selection.
  // If not, create a new deferred selection with specified base.
  type SetBase[TSelection, TBase] = typingsSlinky.knex.mod.DeferredKeySelection[
    TBase, 
    js.Any | scala.Nothing, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    js.Any | js.Object, 
    typingsSlinky.knex.knexBooleans.`false` | js.Any, 
    js.Any | js.Object, 
    js.Any | scala.Nothing
  ]
  // Type operators to substitute individual type parameters:
  type SetSingle[TSelection, TSingle /* <: scala.Boolean */] = typingsSlinky.knex.mod.DeferredKeySelection[js.Any, js.Any, js.Any, js.Any, TSingle, js.Any, js.Any]
}
