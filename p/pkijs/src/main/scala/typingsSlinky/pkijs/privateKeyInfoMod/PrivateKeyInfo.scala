package typingsSlinky.pkijs.privateKeyInfoMod

import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrivateKeyInfo extends js.Object {
  var attributes: js.UndefOr[js.Array[typingsSlinky.pkijs.attributeMod.default]] = js.native
  var parsedKey: js.UndefOr[
    typingsSlinky.pkijs.ecprivatekeyMod.default | typingsSlinky.pkijs.rsaprivatekeyMod.default
  ] = js.native
  var privateKey: OctetString = js.native
  var privateKeyAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default = js.native
  var version: Double = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object PrivateKeyInfo {
  @scala.inline
  def apply(
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    privateKey: OctetString,
    privateKeyAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
  @scala.inline
  implicit class PrivateKeyInfoOps[Self <: PrivateKeyInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPrivateKey(value: OctetString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateKeyAlgorithm(value: typingsSlinky.pkijs.algorithmIdentifierMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateKeyAlgorithm")(value.asInstanceOf[js.Any])
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
    def withVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAttributes(value: js.Array[typingsSlinky.pkijs.attributeMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withParsedKey(value: typingsSlinky.pkijs.ecprivatekeyMod.default | typingsSlinky.pkijs.rsaprivatekeyMod.default): Self = {
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

