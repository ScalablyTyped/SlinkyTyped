package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreNumbers._4294901760
import typingsSlinky.angularCore.angularCoreNumbers.`16`
import typingsSlinky.angularCore.angularCoreNumbers.`65535`
import typingsSlinky.angularCore.angularCoreNumbers.`65536`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** More flags associated with an LView (saved in LView[PREORDER_HOOK_FLAGS]) */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreNumbers.`65535`
  - typingsSlinky.angularCore.angularCoreNumbers.`65536`
  - typingsSlinky.angularCore.angularCoreNumbers.`16`
  - typingsSlinky.angularCore.angularCoreNumbers._4294901760
*/
trait PreOrderHookFlags extends js.Object

object PreOrderHookFlags {
  /**
    The index of the next pre-order hook to be called in the hooks array, on the first 16
    bits
    */
  @scala.inline
  def IndexOfTheNextPreOrderHookMaskMask: `65535` = 65535.asInstanceOf[`65535`]
  /**
    * The number of init hooks that have already been called, on the last 16 bits
    */
  @scala.inline
  def NumberOfInitHooksCalledIncrementer: `65536` = 65536.asInstanceOf[`65536`]
  @scala.inline
  def NumberOfInitHooksCalledMask: _4294901760 = 4294901760.0.asInstanceOf[_4294901760]
  @scala.inline
  def NumberOfInitHooksCalledShift: `16` = 16.asInstanceOf[`16`]
}

