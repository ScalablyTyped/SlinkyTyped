package typingsSlinky.googleAppsScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Response extends js.Object {
  var createNamedRange: js.UndefOr[CreateNamedRangeResponse] = js.native
  var insertInlineImage: js.UndefOr[InsertInlineImageResponse] = js.native
  var insertInlineSheetsChart: js.UndefOr[InsertInlineSheetsChartResponse] = js.native
  var replaceAllText: js.UndefOr[ReplaceAllTextResponse] = js.native
}

object Response {
  @scala.inline
  def apply(): Response = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Response]
  }
  @scala.inline
  implicit class ResponseOps[Self <: Response] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateNamedRange(value: CreateNamedRangeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNamedRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateNamedRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createNamedRange")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertInlineImage(value: InsertInlineImageResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertInlineImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineImage")(js.undefined)
        ret
    }
    @scala.inline
    def withInsertInlineSheetsChart(value: InsertInlineSheetsChartResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineSheetsChart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsertInlineSheetsChart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insertInlineSheetsChart")(js.undefined)
        ret
    }
    @scala.inline
    def withReplaceAllText(value: ReplaceAllTextResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplaceAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceAllText")(js.undefined)
        ret
    }
  }
  
}

