package typingsSlinky.rax.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// naked 'any' type in a conditional type will short circuit and union both the then/else branches
// so boolean is only resolved for T = any
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rax.raxBooleans.`false`
  - typingsSlinky.rax.raxBooleans.`true`
*/
trait IsExactlyAny[T] extends js.Object

object IsExactlyAny {
  @scala.inline
  def `false`[T]: typingsSlinky.rax.raxBooleans.`false` = false.asInstanceOf[typingsSlinky.rax.raxBooleans.`false`]
  @scala.inline
  def `true`[T]: typingsSlinky.rax.raxBooleans.`true` = true.asInstanceOf[typingsSlinky.rax.raxBooleans.`true`]
}

