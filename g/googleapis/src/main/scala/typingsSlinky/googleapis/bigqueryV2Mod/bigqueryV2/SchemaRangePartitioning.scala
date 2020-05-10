package typingsSlinky.googleapis.bigqueryV2Mod.bigqueryV2

import typingsSlinky.googleapis.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRangePartitioning extends js.Object {
  /**
    * [TrustedTester] [Required] The table is partitioned by this field. The
    * field must be a top-level NULLABLE/REQUIRED field. The only supported
    * type is INTEGER/INT64.
    */
  var field: js.UndefOr[String] = js.native
  /**
    * [TrustedTester] [Required] Defines the ranges for range partitioning.
    */
  var range: js.UndefOr[AnonEnd] = js.native
}

object SchemaRangePartitioning {
  @scala.inline
  def apply(): SchemaRangePartitioning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRangePartitioning]
  }
  @scala.inline
  implicit class SchemaRangePartitioningOps[Self <: SchemaRangePartitioning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: AnonEnd): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
  }
  
}

