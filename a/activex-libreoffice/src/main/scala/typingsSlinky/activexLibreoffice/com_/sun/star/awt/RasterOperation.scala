package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** These values are used to specify the binary pixel-operation applied when pixels are written to the device. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
*/
trait RasterOperation extends js.Object
object RasterOperation {
  
  /** All bits which are affected by this operation are set to 1. */
  @scala.inline
  def ALLBITS: `3` = 3.asInstanceOf[`3`]
  
  /** All bits which are affected by this operation are inverted. */
  @scala.inline
  def INVERT: `4` = 4.asInstanceOf[`4`]
  
  /** sets all pixel as written in the output operation. */
  @scala.inline
  def OVERPAINT: `0` = 0.asInstanceOf[`0`]
  
  /** uses the pixel written as one and the current pixel as the other operator of an exclusive or-operation. */
  @scala.inline
  def XOR: `1` = 1.asInstanceOf[`1`]
  
  /** All bits which are affected by this operation are set to 0. */
  @scala.inline
  def ZEROBITS: `2` = 2.asInstanceOf[`2`]
}
