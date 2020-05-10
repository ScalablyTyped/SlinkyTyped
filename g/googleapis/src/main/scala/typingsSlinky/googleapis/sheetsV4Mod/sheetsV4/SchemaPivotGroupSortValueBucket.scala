package typingsSlinky.googleapis.sheetsV4Mod.sheetsV4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about which values in a pivot group should be used for sorting.
  */
@js.native
trait SchemaPivotGroupSortValueBucket extends js.Object {
  /**
    * Determines the bucket from which values are chosen to sort.  For example,
    * in a pivot table with one row group &amp; two column groups, the row
    * group can list up to two values. The first value corresponds to a value
    * within the first column group, and the second value corresponds to a
    * value in the second column group.  If no values are listed, this would
    * indicate that the row should be sorted according to the &quot;Grand
    * Total&quot; over the column groups. If a single value is listed, this
    * would correspond to using the &quot;Total&quot; of that bucket.
    */
  var buckets: js.UndefOr[js.Array[SchemaExtendedValue]] = js.native
  /**
    * The offset in the PivotTable.values list which the values in this
    * grouping should be sorted by.
    */
  var valuesIndex: js.UndefOr[Double] = js.native
}

object SchemaPivotGroupSortValueBucket {
  @scala.inline
  def apply(): SchemaPivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPivotGroupSortValueBucket]
  }
  @scala.inline
  implicit class SchemaPivotGroupSortValueBucketOps[Self <: SchemaPivotGroupSortValueBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[SchemaExtendedValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valuesIndex")(js.undefined)
        ret
    }
  }
  
}

