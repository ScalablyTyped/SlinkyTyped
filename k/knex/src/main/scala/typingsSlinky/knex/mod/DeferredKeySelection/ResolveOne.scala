package typingsSlinky.knex.mod.DeferredKeySelection

import typingsSlinky.knex.mod.AugmentParams
import typingsSlinky.knex.mod.MappedAliasType
import typingsSlinky.knex.mod.PartialOrAny
import typingsSlinky.knex.mod.UnknownToAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Core resolution logic -- Refer to docs for DeferredKeySelection for specifics
/* Rewritten from type alias, can be one of: 
  - TSelection
  - typingsSlinky.knex.mod.UnknownToAny[
(// ^ We convert final result to any if it is unknown for backward compatibility.
//   Historically knex typings have been liberal with returning any and changing
//   default return type to unknown would be a major breaking change for users.
//
//   So we compromise on type safety here and return any.
typingsSlinky.knex.mod.AugmentParams[
  js.Any | (typingsSlinky.knex.mod.AugmentParams[
  typingsSlinky.knex.mod.PartialOrAny[js.Any, js.Any], 
  typingsSlinky.knex.mod.MappedAliasType[js.Any, js.Any]
  ]), 
  js.Any
]) | js.Any]
*/
trait ResolveOne[TSelection] extends Resolve[TSelection]

object ResolveOne {
  @scala.inline
  implicit def apply[TSelection](value: TSelection): ResolveOne[TSelection] = value.asInstanceOf[ResolveOne[TSelection]]
  @scala.inline
  implicit def apply[TSelection](
    value: UnknownToAny[
      (// ^ We convert final result to any if it is unknown for backward compatibility.
  //   Historically knex typings have been liberal with returning any and changing
  //   default return type to unknown would be a major breaking change for users.
  //
  //   So we compromise on type safety here and return any.
  AugmentParams[
        js.Any | (AugmentParams[PartialOrAny[js.Any, js.Any], MappedAliasType[js.Any, js.Any]]), 
        js.Any
      ]) | js.Any
    ]
  ): ResolveOne[TSelection] = value.asInstanceOf[ResolveOne[TSelection]]
}

