package typingsSlinky.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Check if provided keys (expressed as a single or union type) are members of TBase
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.knex.knexBooleans.`false`
  - typingsSlinky.knex.knexBooleans.`true`
*/
trait AreKeysOf[TBase, TKeys] extends js.Object

object AreKeysOf {
  @scala.inline
  def `false`[TBase, TKeys]: typingsSlinky.knex.knexBooleans.`false` = false.asInstanceOf[typingsSlinky.knex.knexBooleans.`false`]
  @scala.inline
  def `true`[TBase, TKeys]: typingsSlinky.knex.knexBooleans.`true` = true.asInstanceOf[typingsSlinky.knex.knexBooleans.`true`]
}

