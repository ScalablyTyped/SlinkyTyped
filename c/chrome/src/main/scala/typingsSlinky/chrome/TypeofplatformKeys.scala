package typingsSlinky.chrome

import typingsSlinky.chrome.chrome.enterprise.platformKeys.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofplatformKeys extends js.Object {
  def getCertificates(
    tokenId: String,
    callback: js.Function1[/* certificates */ scala.scalajs.js.typedarray.ArrayBuffer, Unit]
  ): Unit = js.native
  def getToken(callback: js.Function1[/* tokens */ js.Array[Token], Unit]): Unit = js.native
  def importCertificate(tokenId: String, certificate: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  def importCertificate(
    tokenId: String,
    certificate: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function0[Unit]
  ): Unit = js.native
  def removeCertificate(tokenId: String, certificate: scala.scalajs.js.typedarray.ArrayBuffer): Unit = js.native
  def removeCertificate(
    tokenId: String,
    certificate: scala.scalajs.js.typedarray.ArrayBuffer,
    callback: js.Function0[Unit]
  ): Unit = js.native
}

