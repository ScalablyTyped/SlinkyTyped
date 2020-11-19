package typingsSlinky.activexLibreoffice.com_.sun.star.reflection

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The parameter mode denotes the transfer between caller and callee of a method. */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
*/
trait ParamMode extends js.Object
object ParamMode {
  
  /** parameter serves as pure input for a called method */
  @scala.inline
  def IN: `0` = 0.asInstanceOf[`0`]
  
  /** parameter serves as input as well as output; data can transferred in both directions */
  @scala.inline
  def INOUT: `2` = 2.asInstanceOf[`2`]
  
  /** parameter serves as pure output for the callee (in addition to the return value) */
  @scala.inline
  def OUT: `1` = 1.asInstanceOf[`1`]
}
