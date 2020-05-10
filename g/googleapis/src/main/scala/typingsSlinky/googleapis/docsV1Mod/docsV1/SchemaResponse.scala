package typingsSlinky.googleapis.docsV1Mod.docsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A single response from an update.
  */
@js.native
trait SchemaResponse extends js.Object {
  /**
    * The result of creating a named range.
    */
  var createNamedRange: js.UndefOr[SchemaCreateNamedRangeResponse] = js.native
  /**
    * The result of inserting an inline image.
    */
  var insertInlineImage: js.UndefOr[SchemaInsertInlineImageResponse] = js.native
  /**
    * The result of inserting an inline Google Sheets chart.
    */
  var insertInlineSheetsChart: js.UndefOr[SchemaInsertInlineSheetsChartResponse] = js.native
  /**
    * The result of replacing text.
    */
  var replaceAllText: js.UndefOr[SchemaReplaceAllTextResponse] = js.native
}

object SchemaResponse {
  @scala.inline
  def apply(): SchemaResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaResponse]
  }
  @scala.inline
  implicit class SchemaResponseOps[Self <: SchemaResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateNamedRange(value: SchemaCreateNamedRangeResponse): Self = {
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
    def withInsertInlineImage(value: SchemaInsertInlineImageResponse): Self = {
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
    def withInsertInlineSheetsChart(value: SchemaInsertInlineSheetsChartResponse): Self = {
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
    def withReplaceAllText(value: SchemaReplaceAllTextResponse): Self = {
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

