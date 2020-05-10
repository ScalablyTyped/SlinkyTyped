package typingsSlinky.firebaseFirestore.firestoreProtoApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIndexStateEnum extends js.Object {
  var CREATING: IndexState = js.native
  var ERROR: IndexState = js.native
  var READY: IndexState = js.native
  var STATE_UNSPECIFIED: IndexState = js.native
  def values(): js.Array[IndexState] = js.native
}

object IIndexStateEnum {
  @scala.inline
  def apply(
    CREATING: IndexState,
    ERROR: IndexState,
    READY: IndexState,
    STATE_UNSPECIFIED: IndexState,
    values: () => js.Array[IndexState]
  ): IIndexStateEnum = {
    val __obj = js.Dynamic.literal(CREATING = CREATING.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], READY = READY.asInstanceOf[js.Any], STATE_UNSPECIFIED = STATE_UNSPECIFIED.asInstanceOf[js.Any], values = js.Any.fromFunction0(values))
    __obj.asInstanceOf[IIndexStateEnum]
  }
  @scala.inline
  implicit class IIndexStateEnumOps[Self <: IIndexStateEnum] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCREATING(value: IndexState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CREATING")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withERROR(value: IndexState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withREADY(value: IndexState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("READY")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSTATE_UNSPECIFIED(value: IndexState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("STATE_UNSPECIFIED")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValues(value: () => js.Array[IndexState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("values")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

