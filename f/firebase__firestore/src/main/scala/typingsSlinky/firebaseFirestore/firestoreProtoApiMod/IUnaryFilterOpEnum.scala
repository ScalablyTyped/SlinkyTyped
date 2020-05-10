package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUnaryFilterOpEnum extends js.Object {
  var IS_NAN: UnaryFilterOp = js.native
  var IS_NULL: UnaryFilterOp = js.native
  var OPERATOR_UNSPECIFIED: UnaryFilterOp = js.native
  def values(): js.Array[UnaryFilterOp] = js.native
}

object IUnaryFilterOpEnum {
  @scala.inline
  def apply(
    IS_NAN: UnaryFilterOp,
    IS_NULL: UnaryFilterOp,
    OPERATOR_UNSPECIFIED: UnaryFilterOp,
    values: () => js.Array[UnaryFilterOp]
  ): IUnaryFilterOpEnum = {
    val __obj = js.Dynamic.literal(IS_NAN = IS_NAN.asInstanceOf[js.Any], IS_NULL = IS_NULL.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IUnaryFilterOpEnum]
  }
  @scala.inline
  implicit class IUnaryFilterOpEnumOps[Self <: IUnaryFilterOpEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIS_NAN(value: UnaryFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_NAN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIS_NULL(value: UnaryFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_NULL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPERATOR_UNSPECIFIED(value: UnaryFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPERATOR_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[UnaryFilterOp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

