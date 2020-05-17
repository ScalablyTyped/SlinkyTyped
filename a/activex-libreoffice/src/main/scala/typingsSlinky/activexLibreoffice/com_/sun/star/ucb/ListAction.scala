package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This struct contains information needed in the notifications of a {@link XDynamicResultSet} .
  * @see ListEvent
  */
@js.native
trait ListAction extends js.Object {
  /**
    * depending on the content of {@link ListAction.ListActionType} the {@link ListAction.ActionInfo} could contain additional information about the changes
    * happened (see table above).
    */
  var ActionInfo: js.Any = js.native
  /** The count of involved rows. */
  var Count: Double = js.native
  /**
    * specifies the kind of modification happened to all assigned rows.
    *
    * The value of the other members of this struct depend on the value of this member:
    *
    * {{table here, see documentation}}
    */
  var ListActionType: Double = js.native
  /**
    * The position where something has happened (index begins with `1` as usual with JDBC ).
    *
    * Its value does not necessary indicate the new position in the new {@link com.sun.star.sdbc.XResultSet} , but a position while doing the changes step
    * by step beginning with the old {@link com.sun.star.sdbc.XResultSet} .
    */
  var Position: Double = js.native
}

object ListAction {
  @scala.inline
  def apply(ActionInfo: js.Any, Count: Double, ListActionType: Double, Position: Double): ListAction = {
    val __obj = js.Dynamic.literal(ActionInfo = ActionInfo.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ListActionType = ListActionType.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAction]
  }
  @scala.inline
  implicit class ListActionOps[Self <: ListAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionInfo(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ActionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withListActionType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ListActionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPosition(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Position")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

