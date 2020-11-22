package typingsSlinky.cadesplugin.CAPICOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signer extends js.Object {
  
  var Certificate: typingsSlinky.cadesplugin.CAPICOM.Certificate = js.native
  
  def Load(fileName: String): Unit = js.native
  def Load(fileName: String, password: String): Unit = js.native
  
  var Options: CAPICOM_CERTIFICATE_INCLUDE_OPTION = js.native
}
