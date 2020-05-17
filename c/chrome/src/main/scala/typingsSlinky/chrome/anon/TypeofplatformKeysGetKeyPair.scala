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

@js.native
trait TypeofplatformKeysGetKeyPair extends js.Object {
  def getKeyPair(
    certificate: js.typedarray.ArrayBuffer,
    parameters: js.Object,
    callback: js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]
  ): Unit = js.native
  def selectClientCertificates(
    details: ClientCertificateSelectDetails,
    callback: js.Function1[/* matches */ js.Array[Match], Unit]
  ): Unit = js.native
  def subtleCrypto(): SubtleCrypto = js.native
  def verifyTLSServerCertificate(
    details: ServerCertificateVerificationDetails,
    callback: js.Function1[/* result */ ServerCertificateVerificationResult, Unit]
  ): Unit = js.native
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
  @scala.inline
  implicit class TypeofplatformKeysGetKeyPairOps[Self <: TypeofplatformKeysGetKeyPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetKeyPair(
      value: (js.typedarray.ArrayBuffer, js.Object, js.Function2[/* publicKey */ CryptoKey, /* privateKey */ CryptoKey | Null, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getKeyPair")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withSelectClientCertificates(value: (ClientCertificateSelectDetails, js.Function1[/* matches */ js.Array[Match], Unit]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectClientCertificates")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSubtleCrypto(value: () => SubtleCrypto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtleCrypto")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withVerifyTLSServerCertificate(
      value: (ServerCertificateVerificationDetails, js.Function1[/* result */ ServerCertificateVerificationResult, Unit]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verifyTLSServerCertificate")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

