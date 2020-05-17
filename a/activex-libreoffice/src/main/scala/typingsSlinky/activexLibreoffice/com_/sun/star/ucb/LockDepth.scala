package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * defines a depth for a lock.
  * @see Lock
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait LockDepth extends js.Object

object LockDepth {
  /** Infinity (includes children and children's children and ...). */
  @scala.inline
  def INFINITY: `2` = 2.asInstanceOf[`2`]
  /** One (includes children). */
  @scala.inline
  def ONE: `1` = 1.asInstanceOf[`1`]
  /** Zero (includes no children). */
  @scala.inline
  def ZERO: `0` = 0.asInstanceOf[`0`]
}

