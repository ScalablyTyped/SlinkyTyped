package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Collection.Metadata.ColumnsCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataCollection extends js.Object {
  var Columns: js.UndefOr[ColumnsCollection] = js.native
}

object MetadataCollection {
  @scala.inline
  def apply(): MetadataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataCollection]
  }
  @scala.inline
  implicit class MetadataCollectionOps[Self <: MetadataCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColumns(value: ColumnsCollection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Columns")(js.undefined)
        ret
    }
  }
  
}

