package typingsSlinky.chrome.global.chrome

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.SubtleCrypto
import typingsSlinky.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typingsSlinky.chrome.chrome.platformKeys.Match
import typingsSlinky.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typingsSlinky.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Platform Keys
////////////////////
/**
  * Use the chrome.platformKeys API to access client certificates managed by the platform. If the user or policy grants the permission, an extension can use such a certficate in its custom authentication protocol. E.g. this allows usage of platform managed certificates in third party VPNs (see chrome.vpnProvider).
  * Permissions:  "platformKeys"
  * Important: This API works only on Chrome OS.
  * @since Chrome 45.
  */
object platformKeys {
  
  @JSGlobal("chrome.platformKeys.getKeyPair")
  @js.native
  def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.platformKeys.getKeyPairBySpki")
  @js.native
  def getKeyPairBySpki(
    publicKeySpkiDer: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.platformKeys.selectClientCertificates")
  @js.native
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit = js.native
  
  @JSGlobal("chrome.platformKeys.subtleCrypto")
  @js.native
  def subtleCrypto(): SubtleCrypto = js.native
  
  @JSGlobal("chrome.platformKeys.verifyTLSServerCertificate")
  @js.native
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit = js.native
}
