package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the execution of a container results in a non-zero
  * exit status that was not otherwise ignored. Execution will continue, but
  * only actions that are flagged as `ALWAYS_RUN` will be executed. Other
  * actions will be skipped.
  */
@js.native
trait SchemaUnexpectedExitStatusEvent extends js.Object {
  /**
    * The numeric ID of the action that started the container.
    */
  var actionId: js.UndefOr[Double] = js.native
  /**
    * The exit status of the container.
    */
  var exitStatus: js.UndefOr[Double] = js.native
}

object SchemaUnexpectedExitStatusEvent {
  @scala.inline
  def apply(): SchemaUnexpectedExitStatusEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUnexpectedExitStatusEvent]
  }
  @scala.inline
  implicit class SchemaUnexpectedExitStatusEventOps[Self <: SchemaUnexpectedExitStatusEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionId")(js.undefined)
        ret
    }
    @scala.inline
    def withExitStatus(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExitStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitStatus")(js.undefined)
        ret
    }
  }
  
}

