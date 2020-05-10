package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITargetChangeTargetChangeTypeEnum extends js.Object {
  var ADD: TargetChangeTargetChangeType = js.native
  var CURRENT: TargetChangeTargetChangeType = js.native
  var NO_CHANGE: TargetChangeTargetChangeType = js.native
  var REMOVE: TargetChangeTargetChangeType = js.native
  var RESET: TargetChangeTargetChangeType = js.native
  def values(): js.Array[TargetChangeTargetChangeType] = js.native
}

object ITargetChangeTargetChangeTypeEnum {
  @scala.inline
  def apply(
    ADD: TargetChangeTargetChangeType,
    CURRENT: TargetChangeTargetChangeType,
    NO_CHANGE: TargetChangeTargetChangeType,
    REMOVE: TargetChangeTargetChangeType,
    RESET: TargetChangeTargetChangeType,
    values: () => js.Array[TargetChangeTargetChangeType]
  ): ITargetChangeTargetChangeTypeEnum = {
    val __obj = js.Dynamic.literal(ADD = ADD.asInstanceOf[js.Any], CURRENT = CURRENT.asInstanceOf[js.Any], NO_CHANGE = NO_CHANGE.asInstanceOf[js.Any], REMOVE = REMOVE.asInstanceOf[js.Any], RESET = RESET.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[ITargetChangeTargetChangeTypeEnum]
  }
  @scala.inline
  implicit class ITargetChangeTargetChangeTypeEnumOps[Self <: ITargetChangeTargetChangeTypeEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withADD(value: TargetChangeTargetChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ADD")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCURRENT(value: TargetChangeTargetChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CURRENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNO_CHANGE(value: TargetChangeTargetChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NO_CHANGE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREMOVE(value: TargetChangeTargetChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REMOVE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRESET(value: TargetChangeTargetChangeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RESET")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[TargetChangeTargetChangeType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

