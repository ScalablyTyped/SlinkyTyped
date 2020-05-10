package typingsSlinky.googleapis.genomicsV1Mod.genomicsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated after a worker VM has been assigned to run the pipeline.
  */
@js.native
trait SchemaWorkerAssignedEvent extends js.Object {
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The zone the worker is running in.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaWorkerAssignedEvent {
  @scala.inline
  def apply(): SchemaWorkerAssignedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerAssignedEvent]
  }
  @scala.inline
  implicit class SchemaWorkerAssignedEventOps[Self <: SchemaWorkerAssignedEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zone")(js.undefined)
        ret
    }
  }
  
}

