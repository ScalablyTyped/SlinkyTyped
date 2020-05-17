package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TempVar extends js.Object {
  @JSName("Access.TempVar_typekey")
  var AccessDotTempVar_typekey: TempVar = js.native
  val Name: String = js.native
  var Value: Double | String | Boolean = js.native
  var _Value: Double | String | Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object TempVar {
  @scala.inline
  def apply(
    AccessDotTempVar_typekey: TempVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: Double | String | Boolean,
    _Value: Double | String | Boolean
  ): TempVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.TempVar_typekey")(AccessDotTempVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TempVar]
  }
  @scala.inline
  implicit class TempVarOps[Self <: TempVar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotTempVar_typekey(value: TempVar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.TempVar_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMemberSafe(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsMemberSafe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Double | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Value(value: Double | String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

