package typingsSlinky.activexLibreoffice.com_.sun.star.table

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to determine the type of contents in a cell. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait CellContentType extends js.Object

object CellContentType {
  /** cell is empty. */
  @scala.inline
  def EMPTY: `0` = 0.asInstanceOf[`0`]
  /** cell contains a formula. */
  @scala.inline
  def FORMULA: `3` = 3.asInstanceOf[`3`]
  /** cell contains text. */
  @scala.inline
  def TEXT: `2` = 2.asInstanceOf[`2`]
  /** cell contains a constant value. */
  @scala.inline
  def VALUE: `1` = 1.asInstanceOf[`1`]
}

