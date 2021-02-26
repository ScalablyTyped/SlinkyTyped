package typingsSlinky.node.cryptoMod

import typingsSlinky.node.Buffer
import typingsSlinky.node.nodeStrings.der
import typingsSlinky.node.nodeStrings.pem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("crypto", "KeyObject")
@js.native
class KeyObject protected () extends _KeyLike {
  
  /**
    * For asymmetric keys, this property represents the size of the embedded key in
    * bytes. This property is `undefined` for symmetric keys.
    */
  var asymmetricKeySize: js.UndefOr[Double] = js.native
  
  var asymmetricKeyType: js.UndefOr[KeyType] = js.native
  
  def export(): Buffer = js.native
  @JSName("export")
  def export_der(options: KeyExportOptions[der]): Buffer = js.native
  @JSName("export")
  def export_pem(options: KeyExportOptions[pem]): String | Buffer = js.native
  
  var symmetricKeySize: js.UndefOr[Double] = js.native
  
  var `type`: KeyObjectType = js.native
}
