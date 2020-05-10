package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOrderDirectionEnum extends js.Object {
  var ASCENDING: OrderDirection = js.native
  var DESCENDING: OrderDirection = js.native
  var DIRECTION_UNSPECIFIED: OrderDirection = js.native
  def values(): js.Array[OrderDirection] = js.native
}

object IOrderDirectionEnum {
  @scala.inline
  def apply(
    ASCENDING: OrderDirection,
    DESCENDING: OrderDirection,
    DIRECTION_UNSPECIFIED: OrderDirection,
    values: () => js.Array[OrderDirection]
  ): IOrderDirectionEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], DIRECTION_UNSPECIFIED = DIRECTION_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IOrderDirectionEnum]
  }
  @scala.inline
  implicit class IOrderDirectionEnumOps[Self <: IOrderDirectionEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withASCENDING(value: OrderDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASCENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESCENDING(value: OrderDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESCENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDIRECTION_UNSPECIFIED(value: OrderDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIRECTION_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[OrderDirection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

