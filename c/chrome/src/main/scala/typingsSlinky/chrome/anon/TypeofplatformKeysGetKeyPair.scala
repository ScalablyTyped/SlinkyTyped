package typingsSlinky.chrome.anon

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.SubtleCrypto
import typingsSlinky.chrome.chrome.platformKeys.ClientCertificateSelectDetails
import typingsSlinky.chrome.chrome.platformKeys.Match
import typingsSlinky.chrome.chrome.platformKeys.ServerCertificateVerificationDetails
import typingsSlinky.chrome.chrome.platformKeys.ServerCertificateVerificationResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofplatformKeysGetKeyPair extends js.Object {
  def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit
  def subtleCrypto(): SubtleCrypto
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit
}

object TypeofplatformKeysGetKeyPair {
  @scala.inline
  def apply(
    getKeyPair: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit,
    selectClientCertificates: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit,
    subtleCrypto: () => SubtleCrypto,
    verifyTLSServerCertificate: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Unit
  ): TypeofplatformKeysGetKeyPair = {
    val __obj = js.Dynamic.literal(getKeyPair = js.Any.fromFunction3(getKeyPair), selectClientCertificates = js.Any.fromFunction2(selectClientCertificates), subtleCrypto = js.Any.fromFunction0(subtleCrypto), verifyTLSServerCertificate = js.Any.fromFunction2(verifyTLSServerCertificate))
    __obj.asInstanceOf[TypeofplatformKeysGetKeyPair]
  }
}

