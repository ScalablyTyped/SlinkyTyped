package typingsSlinky.googleapis.v1alpha2Mod.genomicsV1alpha2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Stores the list of events and times they occured for major events in job
  * execution.
  */
@js.native
trait SchemaTimestampEvent extends js.Object {
  /**
    * String indicating the type of event
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The time this event occured.
    */
  var timestamp: js.UndefOr[String] = js.native
}

object SchemaTimestampEvent {
  @scala.inline
  def apply(): SchemaTimestampEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampEvent]
  }
  @scala.inline
  implicit class SchemaTimestampEventOps[Self <: SchemaTimestampEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

