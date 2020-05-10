package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when the worker VM that was assigned to the pipeline has
  * been released (deleted).
  */
@js.native
trait SchemaWorkerReleasedEvent extends js.Object {
  /**
    * The worker&#39;s instance name.
    */
  var instance: js.UndefOr[String] = js.native
  /**
    * The zone the worker was running in.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaWorkerReleasedEvent {
  @scala.inline
  def apply(): SchemaWorkerReleasedEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerReleasedEvent]
  }
  @scala.inline
  implicit class SchemaWorkerReleasedEventOps[Self <: SchemaWorkerReleasedEvent] (val x: Self) extends AnyVal {
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

