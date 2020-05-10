package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICompositeFilterOpEnum extends js.Object {
  var AND: CompositeFilterOp = js.native
  var OPERATOR_UNSPECIFIED: CompositeFilterOp = js.native
  def values(): js.Array[CompositeFilterOp] = js.native
}

object ICompositeFilterOpEnum {
  @scala.inline
  def apply(
    AND: CompositeFilterOp,
    OPERATOR_UNSPECIFIED: CompositeFilterOp,
    values: () => js.Array[CompositeFilterOp]
  ): ICompositeFilterOpEnum = {
    val __obj = js.Dynamic.literal(AND = AND.asInstanceOf[js.Any], OPERATOR_UNSPECIFIED = OPERATOR_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ICompositeFilterOpEnum]
  }
  @scala.inline
  implicit class ICompositeFilterOpEnumOps[Self <: ICompositeFilterOpEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAND(value: CompositeFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AND")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPERATOR_UNSPECIFIED(value: CompositeFilterOp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPERATOR_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[CompositeFilterOp]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

