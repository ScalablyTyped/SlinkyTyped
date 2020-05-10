package typingsSlinky.googleapis.v13Mod.adexchangebuyerV13

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The configuration data for an Ad Exchange performance report list.
  */
@js.native
trait SchemaPerformanceReportList extends js.Object {
  /**
    * Resource type.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * A list of performance reports relevant for the account.
    */
  var performanceReport: js.UndefOr[js.Array[SchemaPerformanceReport]] = js.native
}

object SchemaPerformanceReportList {
  @scala.inline
  def apply(): SchemaPerformanceReportList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPerformanceReportList]
  }
  @scala.inline
  implicit class SchemaPerformanceReportListOps[Self <: SchemaPerformanceReportList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withPerformanceReport(value: js.Array[SchemaPerformanceReport]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceReport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPerformanceReport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("performanceReport")(js.undefined)
        ret
    }
  }
  
}

