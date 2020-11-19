package typingsSlinky.activexLibreoffice.com_.sun.star.style

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These enumeration values are used to specify if and how a page or column break is applied. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
*/
trait BreakType extends js.Object
object BreakType {
  
  /**
    * A column break is applied after the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the last
    *
    * in its column.</p>
    */
  @scala.inline
  def COLUMN_AFTER: `2` = 2.asInstanceOf[`2`]
  
  /**
    * A column break is applied before the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the
    *
    * first in its column.</p>
    */
  @scala.inline
  def COLUMN_BEFORE: `1` = 1.asInstanceOf[`1`]
  
  /**
    * A column break is applied before and after the object to which it belongs.
    *
    * <p>This implies that this object is the only one in its column.</p>
    */
  @scala.inline
  def COLUMN_BOTH: `3` = 3.asInstanceOf[`3`]
  
  /**
    * No column or page break is applied.
    *
    * This value specifies that a location is not yet assigned.
    */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /**
    * A page break is applied after the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the last
    *
    * on its page.</p>
    */
  @scala.inline
  def PAGE_AFTER: `5` = 5.asInstanceOf[`5`]
  
  /**
    * A page break is applied before the object to which it belongs.
    *
    * <p>This implies that the object to which it belongs is the
    *
    * first on its page.      </p>
    */
  @scala.inline
  def PAGE_BEFORE: `4` = 4.asInstanceOf[`4`]
  
  /**
    * A page break is applied before and after the object to which it belongs.
    *
    * <p>This implies that this object is the only one on its page.</p>
    */
  @scala.inline
  def PAGE_BOTH: `6` = 6.asInstanceOf[`6`]
}
