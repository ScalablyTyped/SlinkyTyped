package typingsSlinky.activexLibreoffice.com_.sun.star.sheet

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used to specify the type of {@link XSheetCondition} . */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`9`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`8`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait ConditionOperator extends js.Object

object ConditionOperator {
  /** the value has to be between the two specified values. */
  @scala.inline
  def BETWEEN: `7` = 7.asInstanceOf[`7`]
  /** value has to be equal to the specified value. */
  @scala.inline
  def EQUAL: `1` = 1.asInstanceOf[`1`]
  /** the specified formula has to give a non-zero result. */
  @scala.inline
  def FORMULA: `9` = 9.asInstanceOf[`9`]
  /**
    * the value has to be greater than the specified value.
    *
    * value has to be greater than the specified value.
    */
  @scala.inline
  def GREATER: `3` = 3.asInstanceOf[`3`]
  /**
    * the value has to be greater than or equal to the specified value.
    *
    * value has to be greater than or equal to the specified value.
    */
  @scala.inline
  def GREATER_EQUAL: `4` = 4.asInstanceOf[`4`]
  /**
    * the value has to be less than the specified value.
    *
    * value has to be less than the specified value.
    */
  @scala.inline
  def LESS: `5` = 5.asInstanceOf[`5`]
  /**
    * the value has to be less than or equal to the specified value.
    *
    * value has to be less than or equal to the specified value.
    */
  @scala.inline
  def LESS_EQUAL: `6` = 6.asInstanceOf[`6`]
  /**
    * no cells are moved.
    *
    * no condition is specified.
    *
    * nothing is imported.
    *
    * nothing is calculated.
    *
    * new values are used without changes.
    *
    * sheet is not linked.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  /** the value has to be outside of the two specified values. */
  @scala.inline
  def NOT_BETWEEN: `8` = 8.asInstanceOf[`8`]
  /**
    * the value must not be equal to the specified value.
    *
    * value must not be equal to the specified value.
    */
  @scala.inline
  def NOT_EQUAL: `2` = 2.asInstanceOf[`2`]
}

