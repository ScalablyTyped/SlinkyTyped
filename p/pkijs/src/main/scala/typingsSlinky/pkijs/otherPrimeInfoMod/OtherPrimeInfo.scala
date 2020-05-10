package typingsSlinky.pkijs.otherPrimeInfoMod

import typingsSlinky.asn1js.mod.Integer
import typingsSlinky.pkijs.JsonOtherPrimeInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OtherPrimeInfo extends js.Object {
  var coefficient: Integer = js.native
  var exponent: Integer = js.native
  var prime: Integer = js.native
  /**
    * Convert JSON value into current object
    * @param {JsonOtherPrimeInfo} json
    */
  def fromJSON(json: JsonOtherPrimeInfo): Unit = js.native
  def fromSchema(schema: js.Any): Unit = js.native
  def toJSON(): js.Any = js.native
  def toSchema(): js.Any = js.native
}

object OtherPrimeInfo {
  @scala.inline
  def apply(
    coefficient: Integer,
    exponent: Integer,
    fromJSON: JsonOtherPrimeInfo => Unit,
    fromSchema: js.Any => Unit,
    prime: Integer,
    toJSON: () => js.Any,
    toSchema: () => js.Any
  ): OtherPrimeInfo = {
    val __obj = js.Dynamic.literal(coefficient = coefficient.asInstanceOf[js.Any], exponent = exponent.asInstanceOf[js.Any], fromJSON = js.Any.fromFunction1(fromJSON), fromSchema = js.Any.fromFunction1(fromSchema), prime = prime.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), toSchema = js.Any.fromFunction0(toSchema))
    __obj.asInstanceOf[OtherPrimeInfo]
  }
  @scala.inline
  implicit class OtherPrimeInfoOps[Self <: OtherPrimeInfo] (val x: Self) extends AnyVal {
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
    def withExponent(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exponent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFromJSON(value: JsonOtherPrimeInfo => Unit): Self = {
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
    def withPrime(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prime")(value.asInstanceOf[js.Any])
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
  }
  
}

