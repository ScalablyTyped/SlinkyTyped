package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * contains the response for a scripting engine termination.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
*/
trait FinishReason extends js.Object
object FinishReason {
  
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @scala.inline
  def Cancel: `1` = 1.asInstanceOf[`1`]
  
  /** error occurred during script execution or compiling. */
  @scala.inline
  def Error: `2` = 2.asInstanceOf[`2`]
  
  /** script in the engine terminated normally. */
  @scala.inline
  def OK: `0` = 0.asInstanceOf[`0`]
}
