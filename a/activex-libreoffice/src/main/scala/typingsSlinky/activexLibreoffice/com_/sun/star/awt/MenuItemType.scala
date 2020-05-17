package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the type of a menu item, as returned by {@link com.sun.star.awt.XMenu.getItemType()} . */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait MenuItemType extends js.Object

object MenuItemType {
  /**
    * specifies a font with an unknown slant.
    *
    * specifies that the menu item type is unknown.
    */
  @scala.inline
  def DONTKNOW: `0` = 0.asInstanceOf[`0`]
  /** specifies that the menu item has an image. */
  @scala.inline
  def IMAGE: `2` = 2.asInstanceOf[`2`]
  /** specifies that the menu item is a separator. */
  @scala.inline
  def SEPARATOR: `4` = 4.asInstanceOf[`4`]
  /** specifies that the menu item has a text. */
  @scala.inline
  def STRING: `1` = 1.asInstanceOf[`1`]
  /** specifies that the menu item has a text **and** an image. */
  @scala.inline
  def STRINGIMAGE: `3` = 3.asInstanceOf[`3`]
}

