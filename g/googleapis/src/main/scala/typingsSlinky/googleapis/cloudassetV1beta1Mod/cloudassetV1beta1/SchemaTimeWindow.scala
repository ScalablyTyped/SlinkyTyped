package typingsSlinky.googleapis.cloudassetV1beta1Mod.cloudassetV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A time window of (start_time, end_time].
  */
@js.native
trait SchemaTimeWindow extends js.Object {
  /**
    * End time of the time window (inclusive). Current timestamp if not
    * specified.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start time of the time window (exclusive).
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeWindow {
  @scala.inline
  def apply(): SchemaTimeWindow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeWindow]
  }
  @scala.inline
  implicit class SchemaTimeWindowOps[Self <: SchemaTimeWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endTime")(js.undefined)
        ret
    }
    @scala.inline
    def withStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startTime")(js.undefined)
        ret
    }
  }
  
}

