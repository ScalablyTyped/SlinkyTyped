package typingsSlinky.fastCsv.rowFormatterMod

import typingsSlinky.fastCsv.typesMod.Row
import typingsSlinky.fastCsv.typesMod.RowTransformFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowFormatter extends js.Object {
  var _rowTransform: js.UndefOr[js.Any] = js.native
  var callTransformer: js.Any = js.native
  var checkHeaders: js.Any = js.native
  val fieldFormatter: js.Any = js.native
  var formatColumns: js.Any = js.native
  val formatterOptions: js.Any = js.native
  var gatherColumns: js.Any = js.native
  var hasWrittenHeaders: js.Any = js.native
  var headers: js.Any = js.native
  var rowCount: js.Any = js.native
  var shouldWriteHeaders: js.Any = js.native
  def finish(cb: RowFormatterCallback): Unit = js.native
  def format(row: Row, cb: RowFormatterCallback): Unit = js.native
  def rowTransform(transformFunction: RowTransformFunction): js.Any = js.native
}

object RowFormatter {
  @scala.inline
  def apply(
    callTransformer: js.Any,
    checkHeaders: js.Any,
    fieldFormatter: js.Any,
    finish: RowFormatterCallback => Unit,
    format: (Row, RowFormatterCallback) => Unit,
    formatColumns: js.Any,
    formatterOptions: js.Any,
    gatherColumns: js.Any,
    hasWrittenHeaders: js.Any,
    headers: js.Any,
    rowCount: js.Any,
    rowTransform: RowTransformFunction => js.Any,
    shouldWriteHeaders: js.Any
  ): RowFormatter = {
    val __obj = js.Dynamic.literal(callTransformer = callTransformer.asInstanceOf[js.Any], checkHeaders = checkHeaders.asInstanceOf[js.Any], fieldFormatter = fieldFormatter.asInstanceOf[js.Any], finish = js.Any.fromFunction1(finish), format = js.Any.fromFunction2(format), formatColumns = formatColumns.asInstanceOf[js.Any], formatterOptions = formatterOptions.asInstanceOf[js.Any], gatherColumns = gatherColumns.asInstanceOf[js.Any], hasWrittenHeaders = hasWrittenHeaders.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rowTransform = js.Any.fromFunction1(rowTransform), shouldWriteHeaders = shouldWriteHeaders.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowFormatter]
  }
  @scala.inline
  implicit class RowFormatterOps[Self <: RowFormatter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallTransformer(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callTransformer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCheckHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFieldFormatter(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldFormatter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFinish(value: RowFormatterCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finish")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: (Row, RowFormatterCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFormatColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormatterOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatterOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatherColumns(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatherColumns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHasWrittenHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasWrittenHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowTransform(value: RowTransformFunction => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowTransform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShouldWriteHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldWriteHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_rowTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rowTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_rowTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_rowTransform")(js.undefined)
        ret
    }
  }
  
}

