package typingsSlinky.activexAccess.Access

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalVar extends js.Object {
  @JSName("Access.LocalVar_typekey")
  var AccessDotLocalVar_typekey: LocalVar = js.native
  val Name: String = js.native
  var Value: js.Any = js.native
  var _Value: js.Any = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
}

object LocalVar {
  @scala.inline
  def apply(
    AccessDotLocalVar_typekey: LocalVar,
    IsMemberSafe: Double => Boolean,
    Name: String,
    Value: js.Any,
    _Value: js.Any
  ): LocalVar = {
    val __obj = js.Dynamic.literal(IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any], _Value = _Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.LocalVar_typekey")(AccessDotLocalVar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalVar]
  }
  @scala.inline
  implicit class LocalVarOps[Self <: LocalVar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessDotLocalVar_typekey(value: LocalVar): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Access.LocalVar_typekey")(value.asInstanceOf[js.Any])
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
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_Value(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_Value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

