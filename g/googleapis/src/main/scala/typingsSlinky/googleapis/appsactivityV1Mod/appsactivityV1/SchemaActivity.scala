package typingsSlinky.googleapis.appsactivityV1Mod.appsactivityV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An Activity resource is a combined view of multiple events. An activity has
  * a list of individual events and a combined view of the common fields among
  * all events.
  */
@js.native
trait SchemaActivity extends js.Object {
  /**
    * The fields common to all of the singleEvents that make up the Activity.
    */
  var combinedEvent: js.UndefOr[SchemaEvent] = js.native
  /**
    * A list of all the Events that make up the Activity.
    */
  var singleEvents: js.UndefOr[js.Array[SchemaEvent]] = js.native
}

object SchemaActivity {
  @scala.inline
  def apply(): SchemaActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaActivity]
  }
  @scala.inline
  implicit class SchemaActivityOps[Self <: SchemaActivity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCombinedEvent(value: SchemaEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedEvent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCombinedEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("combinedEvent")(js.undefined)
        ret
    }
    @scala.inline
    def withSingleEvents(value: js.Array[SchemaEvent]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSingleEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("singleEvents")(js.undefined)
        ret
    }
  }
  
}

