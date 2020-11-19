package typingsSlinky.nodeRsa.mod

import typingsSlinky.nodeRsa.nodeRsaStrings.pkcs1
import typingsSlinky.nodeRsa.nodeRsaStrings.pss
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.nodeRsa.mod.AdvancedSigningSchemePSS
  - typingsSlinky.nodeRsa.mod.AdvancedSigningSchemePKCS1
*/
trait AdvancedSigningScheme extends js.Object
object AdvancedSigningScheme {
  
  @scala.inline
  def AdvancedSigningSchemePSS(hash: HashingAlgorithm, saltLength: Double, scheme: pss): AdvancedSigningScheme = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningScheme]
  }
  
  @scala.inline
  def AdvancedSigningSchemePKCS1(hash: HashingAlgorithm, scheme: pkcs1): AdvancedSigningScheme = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdvancedSigningScheme]
  }
}
