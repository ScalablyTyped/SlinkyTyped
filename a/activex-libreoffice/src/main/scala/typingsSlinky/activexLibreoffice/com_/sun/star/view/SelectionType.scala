package typingsSlinky.activexLibreoffice.com_.sun.star.view

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies a selection type for a view that supports a selection model. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait SelectionType extends js.Object

object SelectionType {
  /** The selection can contain zero or more objects. */
  @scala.inline
  def MULTI: `2` = 2.asInstanceOf[`2`]
  /**
    * No selection is possible.
    *
    * The selection is always empty.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  /**
    * The selection can contain zero or more objects.
    *
    * all selected objects must be part of a continues range
    */
  @scala.inline
  def RANGE: `3` = 3.asInstanceOf[`3`]
  /** The selection can only contain one or zero objects. */
  @scala.inline
  def SINGLE: `1` = 1.asInstanceOf[`1`]
}

