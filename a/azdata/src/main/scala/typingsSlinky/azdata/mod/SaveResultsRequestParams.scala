package typingsSlinky.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SaveResultsRequestParams extends js.Object {
  var batchIndex: Double = js.native
  var columnEndIndex: Double = js.native
  var columnStartIndex: Double = js.native
  var delimiter: js.UndefOr[String] = js.native
  var encoding: js.UndefOr[String] = js.native
  var filePath: String = js.native
  var formatted: js.UndefOr[Boolean] = js.native
  var includeHeaders: js.UndefOr[Boolean] = js.native
  var lineSeperator: js.UndefOr[String] = js.native
  var ownerUri: String = js.native
  /**
  		 * 'csv', 'json', 'excel', 'xml'
  		 */
  var resultFormat: String = js.native
  var resultSetIndex: Double = js.native
  var rowEndIndex: Double = js.native
  var rowStartIndex: Double = js.native
  var textIdentifier: js.UndefOr[String] = js.native
}

object SaveResultsRequestParams {
  @scala.inline
  def apply(
    batchIndex: Double,
    columnEndIndex: Double,
    columnStartIndex: Double,
    filePath: String,
    ownerUri: String,
    resultFormat: String,
    resultSetIndex: Double,
    rowEndIndex: Double,
    rowStartIndex: Double
  ): SaveResultsRequestParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], columnEndIndex = columnEndIndex.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultFormat = resultFormat.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowEndIndex = rowEndIndex.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResultsRequestParams]
  }
  @scala.inline
  implicit class SaveResultsRequestParamsOps[Self <: SaveResultsRequestParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("batchIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnEndIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColumnStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultSetIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resultSetIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowEndIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowEndIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRowStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowStartIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelimiter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatted")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withLineSeperator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeperator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineSeperator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineSeperator")(js.undefined)
        ret
    }
    @scala.inline
    def withTextIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textIdentifier")(js.undefined)
        ret
    }
  }
  
}

