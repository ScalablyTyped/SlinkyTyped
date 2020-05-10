package typingsSlinky.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PivotGroupSortValueBucket extends js.Object {
  var buckets: js.UndefOr[js.Array[ExtendedValue]] = js.native
  var valuesIndex: js.UndefOr[Double] = js.native
}

object PivotGroupSortValueBucket {
  @scala.inline
  def apply(): PivotGroupSortValueBucket = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGroupSortValueBucket]
  }
  @scala.inline
  implicit class PivotGroupSortValueBucketOps[Self <: PivotGroupSortValueBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[ExtendedValue]): Self = {
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

