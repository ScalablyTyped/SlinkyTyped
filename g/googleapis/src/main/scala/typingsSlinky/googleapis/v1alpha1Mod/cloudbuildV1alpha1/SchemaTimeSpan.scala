package typingsSlinky.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Start and end times for a build execution phase.
  */
@js.native
trait SchemaTimeSpan extends js.Object {
  /**
    * End of time span.
    */
  var endTime: js.UndefOr[String] = js.native
  /**
    * Start of time span.
    */
  var startTime: js.UndefOr[String] = js.native
}

object SchemaTimeSpan {
  @scala.inline
  def apply(): SchemaTimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimeSpan]
  }
  @scala.inline
  implicit class SchemaTimeSpanOps[Self <: SchemaTimeSpan] (val x: Self) extends AnyVal {
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

