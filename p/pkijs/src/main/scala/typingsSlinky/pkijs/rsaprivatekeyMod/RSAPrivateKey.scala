package typingsSlinky.pkijs.rsaprivatekeyMod

import org.scalajs.dom.crypto.JsonWebKey
import typingsSlinky.asn1js.mod.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSAPrivateKey extends js.Object {
  var coefficient: Integer = js.native
  var exponent1: Integer = js.native
  var exponent2: Integer = js.native
  var modulus: Integer = js.native
  var otherPrimeInfos: js.UndefOr[js.Array[typingsSlinky.pkijs.otherPrimeInfoMod.default]] = js.native
  var prime1: Integer = js.native
  var prime2: Integer = js.native
  var privateExponent: Integer = js.native
  var publicExponent: Integer = js.native
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

object RSAPrivateKey {
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent1: Integer,
    exponent2: Integer,
    fromJSON: JsonWebKey => Unit,
    fromSchema: js.Any => Unit,
    modulus: Integer,
    prime1: Integer,
    prime2: Integer,
    privateExponent: Integer,
    publicExponent: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any,
    version: Double
  ): RSAPrivateKey = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent1 = exponent1.asInstanceOf[js.Any], exponent2 = exponent2.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), modulus = modulus.asInstanceOf[js.Any], prime1 = prime1.asInstanceOf[js.Any], prime2 = prime2.asInstanceOf[js.Any], privateExponent = privateExponent.asInstanceOf[js.Any], publicExponent = publicExponent.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema), version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAPrivateKey]
  }
  @scala.inline
  implicit class RSAPrivateKeyOps[Self <: RSAPrivateKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoefficient(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coefficient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponent1(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExponent2(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent2")(value.asInstanceOf[js.Any])
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
    def withModulus(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modulus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrime1(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prime1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrime2(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prime2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateExponent(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateExponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicExponent(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicExponent")(value.asInstanceOf[js.Any])
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
    def withOtherPrimeInfos(value: js.Array[typingsSlinky.pkijs.otherPrimeInfoMod.default]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherPrimeInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherPrimeInfos: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherPrimeInfos")(js.undefined)
        ret
    }
  }
  
}

