package typingsSlinky.knex.knexMod

import typingsSlinky.knex.knexMod.DeferredKeySelection.AddKey
import typingsSlinky.knex.knexMod.DeferredKeySelection.SetBase
import typingsSlinky.knex.knexMod.DeferredKeySelection.SetSingle
import typingsSlinky.knex.knexNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "DeferredIndex")
@js.native
object DeferredIndex extends js.Object {
  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = SetSingle[AddKey[SetBase[T, TBase], TKey], `true`]
}

