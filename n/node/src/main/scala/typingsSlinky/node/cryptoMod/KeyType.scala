package typingsSlinky.node.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.node.nodeStrings.rsa
  - typingsSlinky.node.nodeStrings.dsa
  - typingsSlinky.node.nodeStrings.ec
  - typingsSlinky.node.nodeStrings.ed25519
*/
trait KeyType extends js.Object
object KeyType {
  
  @scala.inline
  def dsa: typingsSlinky.node.nodeStrings.dsa = "dsa".asInstanceOf[typingsSlinky.node.nodeStrings.dsa]
  
  @scala.inline
  def ec: typingsSlinky.node.nodeStrings.ec = "ec".asInstanceOf[typingsSlinky.node.nodeStrings.ec]
  
  @scala.inline
  def ed25519: typingsSlinky.node.nodeStrings.ed25519 = "ed25519".asInstanceOf[typingsSlinky.node.nodeStrings.ed25519]
  
  @scala.inline
  def rsa: typingsSlinky.node.nodeStrings.rsa = "rsa".asInstanceOf[typingsSlinky.node.nodeStrings.rsa]
}
