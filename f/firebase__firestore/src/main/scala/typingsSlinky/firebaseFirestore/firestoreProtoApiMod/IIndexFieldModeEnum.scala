package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexFieldModeEnum extends js.Object {
  var ASCENDING: IndexFieldMode = js.native
  var DESCENDING: IndexFieldMode = js.native
  var MODE_UNSPECIFIED: IndexFieldMode = js.native
  def values(): js.Array[IndexFieldMode] = js.native
}

object IIndexFieldModeEnum {
  @scala.inline
  def apply(
    ASCENDING: IndexFieldMode,
    DESCENDING: IndexFieldMode,
    MODE_UNSPECIFIED: IndexFieldMode,
    values: () => js.Array[IndexFieldMode]
  ): IIndexFieldModeEnum = {
    val __obj = js.Dynamic.literal(ASCENDING = ASCENDING.asInstanceOf[js.Any], DESCENDING = DESCENDING.asInstanceOf[js.Any], MODE_UNSPECIFIED = MODE_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IIndexFieldModeEnum]
  }
  @scala.inline
  implicit class IIndexFieldModeEnumOps[Self <: IIndexFieldModeEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withASCENDING(value: IndexFieldMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ASCENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDESCENDING(value: IndexFieldMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DESCENDING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMODE_UNSPECIFIED(value: IndexFieldMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MODE_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[IndexFieldMode]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

