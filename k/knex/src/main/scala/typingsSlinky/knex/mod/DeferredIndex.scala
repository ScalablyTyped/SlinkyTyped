package typingsSlinky.knex.mod

import typingsSlinky.knex.knexBooleans.`true`
import typingsSlinky.knex.mod.DeferredKeySelection.AddKey
import typingsSlinky.knex.mod.DeferredKeySelection.SetBase
import typingsSlinky.knex.mod.DeferredKeySelection.SetSingle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("knex", "DeferredIndex")
@js.native
object DeferredIndex extends js.Object {
  type Augment[T, TBase, TKey /* <: String */, TAliasMapping] = SetSingle[AddKey[SetBase[T, TBase], TKey], `true`]
}

