package typingsSlinky.angularCore.mod

import typingsSlinky.angularCore.angularCoreNumbers.`1048575`
import typingsSlinky.angularCore.angularCoreNumbers.`1048576`
import typingsSlinky.angularCore.angularCoreNumbers.`20`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Corresponds to the TNode.providerIndexes property.
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.angularCore.angularCoreNumbers.`1048575`
  - typingsSlinky.angularCore.angularCoreNumbers.`20`
  - typingsSlinky.angularCore.angularCoreNumbers.`1048576`
*/
trait TNodeProviderIndexes extends js.Object
object TNodeProviderIndexes {
  
  /**
    * The count of view providers from the component on this node is
    * encoded on the 20 most significant bits.
    */
  @scala.inline
  def CptViewProvidersCountShift: `20` = 20.asInstanceOf[`20`]
  
  @scala.inline
  def CptViewProvidersCountShifter: `1048576` = 1048576.asInstanceOf[`1048576`]
  
  /** The index of the first provider on this node is encoded on the least significant bits. */
  @scala.inline
  def ProvidersStartIndexMask: `1048575` = 1048575.asInstanceOf[`1048575`]
}
