package typingsSlinky.googleapis.v4Mod.analyticsreportingV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Header for the metrics.
  */
@js.native
trait SchemaMetricHeaderEntry extends js.Object {
  /**
    * The name of the header.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The type of the metric, for example `INTEGER`.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaMetricHeaderEntry {
  @scala.inline
  def apply(): SchemaMetricHeaderEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMetricHeaderEntry]
  }
  @scala.inline
  implicit class SchemaMetricHeaderEntryOps[Self <: SchemaMetricHeaderEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

