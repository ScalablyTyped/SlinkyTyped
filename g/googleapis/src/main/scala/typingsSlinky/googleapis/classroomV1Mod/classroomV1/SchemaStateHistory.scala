package typingsSlinky.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The history of each state this submission has been in.
  */
@js.native
trait SchemaStateHistory extends js.Object {
  /**
    * The teacher or student who made the change
    */
  var actorUserId: js.UndefOr[String] = js.native
  /**
    * The workflow pipeline stage.
    */
  var state: js.UndefOr[String] = js.native
  /**
    * When the submission entered this state.
    */
  var stateTimestamp: js.UndefOr[String] = js.native
}

object SchemaStateHistory {
  @scala.inline
  def apply(): SchemaStateHistory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaStateHistory]
  }
  @scala.inline
  implicit class SchemaStateHistoryOps[Self <: SchemaStateHistory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActorUserId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorUserId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActorUserId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actorUserId")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withStateTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStateTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stateTimestamp")(js.undefined)
        ret
    }
  }
  
}

