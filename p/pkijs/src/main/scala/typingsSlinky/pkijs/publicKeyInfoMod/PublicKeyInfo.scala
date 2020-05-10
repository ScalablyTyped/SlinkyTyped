package typingsSlinky.pkijs.publicKeyInfoMod

import org.scalajs.dom.crypto.CryptoKey
import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKeyInfo extends js.Object {
  var algorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var parsedKey: js.UndefOr[
    typingsSlinky.pkijs.ecpublickeyMod.default | typingsSlinky.pkijs.rsapublickeyMod.default
  ] = js.native
  var subjectPublicKey: BitString = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def importKey(publicKey: CryptoKey): js.Thenable[Unit] = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PublicKeyInfo {
  @scala.inline
  def apply(
    algorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    importKey: CryptoKey => js.Thenable[Unit],
    subjectPublicKey: BitString,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): PublicKeyInfo = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), importKey = js.Any.fromFunction1(importKey), subjectPublicKey = subjectPublicKey.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[PublicKeyInfo]
  }
  @scala.inline
  implicit class PublicKeyInfoOps[Self <: PublicKeyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromJSON(value: JsonWebKey => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromJSON")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFromSchema(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromSchema")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withImportKey(value: CryptoKey => js.Thenable[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSubjectPublicKey(value: BitString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subjectPublicKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToJSON(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toJSON")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withToSchema(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toSchema")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withParsedKey(value: typingsSlinky.pkijs.ecpublickeyMod.default | typingsSlinky.pkijs.rsapublickeyMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParsedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsedKey")(js.undefined)
        ret
    }
  }
  
}

