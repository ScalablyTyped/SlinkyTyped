package typingsSlinky.devextreme

import typingsSlinky.devextreme.devextremeStrings.asc
import typingsSlinky.devextreme.devextremeStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGroupColumn extends js.Object {
  var groupColumn: js.UndefOr[String] = js.native
  var sortOrder: js.UndefOr[asc | desc] = js.native
  var summaryItem: js.UndefOr[String | Double] = js.native
}

object AnonGroupColumn {
  @scala.inline
  def apply(): AnonGroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonGroupColumn]
  }
  @scala.inline
  implicit class AnonGroupColumnOps[Self <: AnonGroupColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupColumn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupColumn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupColumn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupColumn")(js.undefined)
        ret
    }
    @scala.inline
    def withSortOrder(value: asc | desc): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withSummaryItem(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSummaryItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("summaryItem")(js.undefined)
        ret
    }
  }
  
}

