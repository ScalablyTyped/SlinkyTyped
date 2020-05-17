package typingsSlinky.activexLibreoffice.com_.sun.star.bridge.oleautomation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the UNO representation of the Automation type `DECIMAL` .
  * @since OOo 1.1.2
  */
@js.native
trait Decimal extends js.Object {
  /** corresponds to `DECIMAL.Hi32` . */
  var HighValue: Double = js.native
  /** corresponds to `DECIMAL.Lo32` . */
  var LowValue: Double = js.native
  /** corresponds to `DECIMAL.Mid32` . */
  var MiddleValue: Double = js.native
  /** corresponds to `DECIMAL.scale` . */
  var Scale: Double = js.native
  /** corresponds to `DECIMAL.sign` . */
  var Sign: Double = js.native
}

object Decimal {
  @scala.inline
  def apply(HighValue: Double, LowValue: Double, MiddleValue: Double, Scale: Double, Sign: Double): Decimal = {
    val __obj = js.Dynamic.literal(HighValue = HighValue.asInstanceOf[js.Any], LowValue = LowValue.asInstanceOf[js.Any], MiddleValue = MiddleValue.asInstanceOf[js.Any], Scale = Scale.asInstanceOf[js.Any], Sign = Sign.asInstanceOf[js.Any])
    __obj.asInstanceOf[Decimal]
  }
  @scala.inline
  implicit class DecimalOps[Self <: Decimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHighValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HighValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LowValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMiddleValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MiddleValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScale(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSign(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sign")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

