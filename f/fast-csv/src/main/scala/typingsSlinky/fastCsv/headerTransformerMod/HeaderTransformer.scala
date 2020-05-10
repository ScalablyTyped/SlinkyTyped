package typingsSlinky.fastCsv.headerTransformerMod

import typingsSlinky.fastCsv.parserTypesMod.RowArray
import typingsSlinky.fastCsv.parserTypesMod.RowValidatorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeaderTransformer extends js.Object {
  var headers: js.Any = js.native
  var headersLength: js.Any = js.native
  val headersTransform: js.UndefOr[js.Any] = js.native
  var mapHeaders: js.Any = js.native
  val parserOptions: js.Any = js.native
  var processRow: js.Any = js.native
  var processedFirstRow: js.Any = js.native
  var receivedHeaders: js.Any = js.native
  var setHeaders: js.Any = js.native
  var shouldMapRow: js.Any = js.native
  val shouldUseFirstRow: js.Any = js.native
  def transform(row: RowArray, cb: RowValidatorCallback): Unit = js.native
}

object HeaderTransformer {
  @scala.inline
  def apply(
    headers: js.Any,
    headersLength: js.Any,
    mapHeaders: js.Any,
    parserOptions: js.Any,
    processRow: js.Any,
    processedFirstRow: js.Any,
    receivedHeaders: js.Any,
    setHeaders: js.Any,
    shouldMapRow: js.Any,
    shouldUseFirstRow: js.Any,
    transform: (RowArray, RowValidatorCallback) => Unit
  ): HeaderTransformer = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], headersLength = headersLength.asInstanceOf[js.Any], mapHeaders = mapHeaders.asInstanceOf[js.Any], parserOptions = parserOptions.asInstanceOf[js.Any], processRow = processRow.asInstanceOf[js.Any], processedFirstRow = processedFirstRow.asInstanceOf[js.Any], receivedHeaders = receivedHeaders.asInstanceOf[js.Any], setHeaders = setHeaders.asInstanceOf[js.Any], shouldMapRow = shouldMapRow.asInstanceOf[js.Any], shouldUseFirstRow = shouldUseFirstRow.asInstanceOf[js.Any], transform = js.Any.fromFunction2(transform))
    __obj.asInstanceOf[HeaderTransformer]
  }
  @scala.inline
  implicit class HeaderTransformerOps[Self <: HeaderTransformer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeadersLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParserOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parserOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessedFirstRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processedFirstRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReceivedHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("receivedHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldMapRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldMapRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldUseFirstRow(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUseFirstRow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransform(value: (RowArray, RowValidatorCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeadersTransform(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersTransform")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadersTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headersTransform")(js.undefined)
        ret
    }
  }
  
}

