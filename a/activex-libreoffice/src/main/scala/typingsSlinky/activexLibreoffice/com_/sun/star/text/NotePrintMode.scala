package typingsSlinky.activexLibreoffice.com_.sun.star.text

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** enumeration values are used to define the printing of notes in a document. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
*/
trait NotePrintMode extends js.Object
object NotePrintMode {
  
  /** Notes are collected at the end of the document. */
  @scala.inline
  def DOC_END: `2` = 2.asInstanceOf[`2`]
  
  /** Notes are not printed. */
  @scala.inline
  def NOT: `0` = 0.asInstanceOf[`0`]
  
  /** Only notes are printed. */
  @scala.inline
  def ONLY: `1` = 1.asInstanceOf[`1`]
  
  /** Notes are collected at the end of a page and printed on an inserted page. */
  @scala.inline
  def PAGE_END: `3` = 3.asInstanceOf[`3`]
}
