package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAutomaticValue extends js.Object {
  var ANSIncrement: Double = js.native
  var ANVCode: String = js.native
  var CVSExpression: String = js.native
  var CVVCode: String = js.native
  var CalculationOrderNumber: Double = js.native
  def Clone(): IAutomaticValue = js.native
}

object IAutomaticValue {
  @scala.inline
  def apply(
    ANSIncrement: Double,
    ANVCode: String,
    CVSExpression: String,
    CVVCode: String,
    CalculationOrderNumber: Double,
    Clone: () => IAutomaticValue
  ): IAutomaticValue = {
    val __obj = js.Dynamic.literal(ANSIncrement = ANSIncrement.asInstanceOf[js.Any], ANVCode = ANVCode.asInstanceOf[js.Any], CVSExpression = CVSExpression.asInstanceOf[js.Any], CVVCode = CVVCode.asInstanceOf[js.Any], CalculationOrderNumber = CalculationOrderNumber.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone))
    __obj.asInstanceOf[IAutomaticValue]
  }
  @scala.inline
  implicit class IAutomaticValueOps[Self <: IAutomaticValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withANSIncrement(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANSIncrement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withANVCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ANVCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCVSExpression(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CVSExpression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCVVCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CVVCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCalculationOrderNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalculationOrderNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IAutomaticValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

