package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * the various modes of recursion when searching through a hierarchical object.
  * @see SearchInfo
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait SearchRecursion extends js.Object
object SearchRecursion {
  
  /** Searches through the complete hierarchy of all sub-objects. */
  @scala.inline
  def DEEP: `2` = 2.asInstanceOf[`2`]
  
  /** Does not search through any sub-objects. */
  @scala.inline
  def NONE: `0` = 0.asInstanceOf[`0`]
  
  /** Only searches through sub-objects of the first hierarchy level. */
  @scala.inline
  def ONE_LEVEL: `1` = 1.asInstanceOf[`1`]
}
