package typingsSlinky.cadesplugin

import typingsSlinky.cadesplugin.CADESCommon.ValuesOf
import typingsSlinky.cadesplugin.CADES_Plugin.EncodingType
import typingsSlinky.cadesplugin.CADES_Plugin.LogLevel
import typingsSlinky.cadesplugin.CADES_Plugin.SignedXmlUrls
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_ATTRIBUTE
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_FIND_TYPE
import typingsSlinky.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import typingsSlinky.cadesplugin.CAPICOM.CertIntoTypePlugin
import typingsSlinky.cadesplugin.CAPICOM.EKUPlugin
import typingsSlinky.cadesplugin.CAPICOM.KeyUsagePlugin
import typingsSlinky.cadesplugin.CAPICOM.OIDPlugin
import typingsSlinky.cadesplugin.CAPICOM.PropIDPlugin
import typingsSlinky.cadesplugin.CAPICOM.StoreLocationPlugin
import typingsSlinky.cadesplugin.CAPICOM.StoreNamePlugin
import typingsSlinky.cadesplugin.CAPICOM.StoreOpenModePlugin
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOMInstallResponseRestrictionFlags
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_ENCRYPTION_ALGORITHM
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM
import typingsSlinky.cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginBase
  extends js.Promise[scala.Nothing]
     with StoreLocationPlugin
     with typingsSlinky.cadesplugin.CAdESCOM.StoreLocationPlugin
     with StoreNamePlugin
     with StoreOpenModePlugin
     with CAPICOM_CERTIFICATE_FIND_TYPE
     with LogLevel
     with CADESCOM_XML_SIGNATURE_TYPE
     with SignedXmlUrls
     with CADESCOM_CADES_TYPE
     with EncodingType
     with CAPICOM_CERTIFICATE_INCLUDE_OPTION
     with CertIntoTypePlugin
     with KeyUsagePlugin
     with PropIDPlugin
     with OIDPlugin
     with EKUPlugin
     with CAPICOM_ATTRIBUTE
     with CADESCOM_ATTRIBUTE
     with CADESCOM_CONTENT_ENCODING_TYPE
     with CADESCOM_DISPLAY_DATA
     with CADESCOM_ENCRYPTION_ALGORITHM
     with CADESCOM_HASH_ALGORITHM
     with CADESCOMInstallResponseRestrictionFlags {
  
  val JSModuleVersion: String = js.native
  
  def async_spawn[T](generatorFun: js.Function1[/* repeated */ js.Any, js.Iterator[T]]): T = js.native
  
  val current_log_level: Double = js.native
  
  def getLastError(exception: js.Error): String = js.native
  
  def is_capilite_enabled(): Boolean = js.native
  
  def set(obj: CADESPluginBase): Unit = js.native
  
  def set_log_level(level: ValuesOf[LogLevel]): Unit = js.native
}
