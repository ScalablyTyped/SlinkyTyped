package typingsSlinky.cadesplugin.CAdESCOM

import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import typingsSlinky.cadesplugin.CADESCommon.VarDate
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CPSigner extends js.Object {
  
  var Certificate: typingsSlinky.cadesplugin.CAPICOM.Certificate = js.native
  
  var CheckCertificate: Boolean = js.native
  
  def Display(): Unit = js.native
  def Display(hwndParent: js.UndefOr[scala.Nothing], title: String): Unit = js.native
  def Display(hwndParent: Double): Unit = js.native
  def Display(hwndParent: Double, title: String): Unit = js.native
  
  var KeyPin: String = js.native
  
  def Load(fileName: String): Unit = js.native
  def Load(fileName: String, password: String): Unit = js.native
  
  var Options: ValuesOf[CAPICOM_CERTIFICATE_INCLUDE_OPTION] = js.native
  
  val SignatureTimeStampTime: VarDate = js.native
  
  val SigningTime: VarDate = js.native
  
  var TSAAddress: String = js.native
}
