package typingsSlinky.pkijs.privateKeyInfoMod

import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateKeyInfo extends js.Object {
  var attributes: js.UndefOr[js.Array[typingsSlinky.pkijs.attributeMod.default]] = js.undefined
  var parsedKey: js.UndefOr[
    typingsSlinky.pkijs.ecprivatekeyMod.default | typingsSlinky.pkijs.rsaprivatekeyMod.default
  ] = js.undefined
  var privateKey: OctetString
  var privateKeyAlgorithm: typingsSlinky.pkijs.algorithmIdentifierMod.default
  var version: Double
  /**
    * Convert JSON value into current object
    * @param {JsonWebKey} json
    */
  def fromJSON(json: JsonWebKey): Unit
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
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
    version: Double,
    attributes: js.Array[typingsSlinky.pkijs.attributeMod.default] = null,
    parsedKey: typingsSlinky.pkijs.ecprivatekeyMod.default | typingsSlinky.pkijs.rsaprivatekeyMod.default = null
  ): PrivateKeyInfo = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (parsedKey != null) __obj.updateDynamic("parsedKey")(parsedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKeyInfo]
  }
}

