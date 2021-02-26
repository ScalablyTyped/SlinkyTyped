package typingsSlinky.activexLibreoffice.com_.sun.star.script

import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
import typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * values used to specify the response for a scripting engine interrupt.
  * @deprecated Deprecated
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`3`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`0`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`2`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`1`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`4`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`6`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`5`
  - typingsSlinky.activexLibreoffice.activexLibreofficeNumbers.`7`
*/
trait InterruptReason extends StObject
object InterruptReason {
  
  /** script stopped at a breakpoint. */
  @scala.inline
  def BreakPoint: `3` = 3.asInstanceOf[`3`]
  
  /**
    * script in the engine was cancelled.
    *
    * script execution was cancelled.
    */
  @scala.inline
  def Cancel: `0` = 0.asInstanceOf[`0`]
  
  /** script has invalid syntax. */
  @scala.inline
  def CompileError: `2` = 2.asInstanceOf[`2`]
  
  /** runtime error occurred during script execution. */
  @scala.inline
  def RuntimeError: `1` = 1.asInstanceOf[`1`]
  
  /** script stops because only one scripting engine command was executed. */
  @scala.inline
  def Step: `4` = 4.asInstanceOf[`4`]
  
  /** script stops because it leaves a function. */
  @scala.inline
  def StepOut: `6` = 6.asInstanceOf[`6`]
  
  /** script stops because one step was executed. */
  @scala.inline
  def StepOver: `5` = 5.asInstanceOf[`5`]
  
  /** script stop because one step was executed. */
  @scala.inline
  def StepStatement: `7` = 7.asInstanceOf[`7`]
}
