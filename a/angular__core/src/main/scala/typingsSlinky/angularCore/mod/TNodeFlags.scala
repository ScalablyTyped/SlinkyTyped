package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreNumbers.`128`
import typingsSlinky.angularCore.angularCoreNumbers.`16`
import typingsSlinky.angularCore.angularCoreNumbers.`1`
import typingsSlinky.angularCore.angularCoreNumbers.`2`
import typingsSlinky.angularCore.angularCoreNumbers.`32`
import typingsSlinky.angularCore.angularCoreNumbers.`4`
import typingsSlinky.angularCore.angularCoreNumbers.`64`
import typingsSlinky.angularCore.angularCoreNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the TNode.flags property.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreNumbers.`1`
  - typingsSlinky.angularCore.angularCoreNumbers.`2`
  - typingsSlinky.angularCore.angularCoreNumbers.`4`
  - typingsSlinky.angularCore.angularCoreNumbers.`8`
  - typingsSlinky.angularCore.angularCoreNumbers.`16`
  - typingsSlinky.angularCore.angularCoreNumbers.`32`
  - typingsSlinky.angularCore.angularCoreNumbers.`64`
  - typingsSlinky.angularCore.angularCoreNumbers.`128`
*/
trait TNodeFlags extends StObject
object TNodeFlags {
  
  /** Bit #5 - This bit is set if the node has any "class" inputs */
  @scala.inline
  def hasClassInput: `16` = 16.asInstanceOf[`16`]
  
  /** Bit #4 - This bit is set if any directive on this node has content queries */
  @scala.inline
  def hasContentQuery: `8` = 8.asInstanceOf[`8`]
  
  /**
    * Bit #8 - This bit is set if the node has directives with host bindings.
    *
    * This flags allows us to guard host-binding logic and invoke it only on nodes
    * that actually have directives with host bindings.
    */
  @scala.inline
  def hasHostBindings: `128` = 128.asInstanceOf[`128`]
  
  /** Bit #6 - This bit is set if the node has any "style" inputs */
  @scala.inline
  def hasStyleInput: `32` = 32.asInstanceOf[`32`]
  
  /**
    * Bit #2 - This bit is set if the node is a host for a component.
    *
    * Setting this bit implies that the `isDirectiveHost` bit is set as well.
    * */
  @scala.inline
  def isComponentHost: `2` = 2.asInstanceOf[`2`]
  
  /** Bit #7 This bit is set if the node has been detached by i18n */
  @scala.inline
  def isDetached: `64` = 64.asInstanceOf[`64`]
  
  /** Bit #1 - This bit is set if the node is a host for any directive (including a component) */
  @scala.inline
  def isDirectiveHost: `1` = 1.asInstanceOf[`1`]
  
  /** Bit #3 - This bit is set if the node has been projected */
  @scala.inline
  def isProjected: `4` = 4.asInstanceOf[`4`]
}
