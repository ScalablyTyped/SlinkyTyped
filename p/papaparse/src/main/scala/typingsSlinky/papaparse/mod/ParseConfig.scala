package typingsSlinky.papaparse.mod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.File
import typingsSlinky.papaparse.papaparseStrings.greedy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseConfig extends js.Object {
   // default: undefined
  var beforeFirstChunk: js.UndefOr[js.Function1[/* chunk */ String, String | Unit]] = js.native
   // default: undefined
  var chunk: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.native
   // default: false
  var comments: js.UndefOr[Boolean | String] = js.native
   // default: undefined
  var complete: js.UndefOr[js.Function2[/* results */ ParseResult, /* file */ js.UndefOr[File], Unit]] = js.native
  var delimiter: js.UndefOr[String] = js.native
   // default: undefined
  var delimitersToGuess: js.UndefOr[js.Array[GuessableDelimiters]] = js.native
   // default: false
  var download: js.UndefOr[Boolean] = js.native
   // default: false
  var downloadRequestHeaders: js.UndefOr[StringDictionary[String]] = js.native
   // default: false
  var dynamicTyping: js.UndefOr[
    Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
  ] = js.native
   // default: 0
  var encoding: js.UndefOr[String] = js.native
   // default: undefined
  var error: js.UndefOr[js.Function2[/* error */ ParseError, /* file */ js.UndefOr[File], Unit]] = js.native
   // default: '"'
  var escapeChar: js.UndefOr[String] = js.native
   // default: false
  var fastMode: js.UndefOr[Boolean] = js.native
   // default: '"'
  var header: js.UndefOr[Boolean] = js.native
   // default: ","
  var newline: js.UndefOr[String] = js.native
   // default: false
  var preview: js.UndefOr[Double] = js.native
   // default: "\r\n"
  var quoteChar: js.UndefOr[String] = js.native
   // default: undefined
  var skipEmptyLines: js.UndefOr[Boolean | greedy] = js.native
   // default: [',', '\t', '|', ';', Papa.RECORD_SEP, Papa.UNIT_SEP]
  // Callbacks
  var step: js.UndefOr[js.Function2[/* results */ ParseResult, /* parser */ Parser, Unit]] = js.native
   // default: undefined
  var transform: js.UndefOr[js.Function2[/* value */ String, /* field */ String | Double, _]] = js.native
   // default: undefined
  var transformHeader: js.UndefOr[js.Function1[/* header */ String, String]] = js.native
   // default: false
  var trimHeaders: js.UndefOr[Boolean] = js.native
   // default: undefined
  var withCredentials: js.UndefOr[Boolean] = js.native
   // default: ""
  var worker: js.UndefOr[Boolean] = js.native
}

object ParseConfig {
  @scala.inline
  def apply(): ParseConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseConfig]
  }
  @scala.inline
  implicit class ParseConfigOps[Self <: ParseConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeforeFirstChunk(value: /* chunk */ String => String | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFirstChunk")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeFirstChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeFirstChunk")(js.undefined)
        ret
    }
    @scala.inline
    def withChunk(value: (/* results */ ParseResult, /* parser */ Parser) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutChunk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunk")(js.undefined)
        ret
    }
    @scala.inline
    def withComments(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("comments")(js.undefined)
        ret
    }
    @scala.inline
    def withComplete(value: (/* results */ ParseResult, /* file */ js.UndefOr[File]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(js.undefined)
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
    def withDelimitersToGuess(value: js.Array[GuessableDelimiters]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimitersToGuess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelimitersToGuess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delimitersToGuess")(js.undefined)
        ret
    }
    @scala.inline
    def withDownload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("download")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadRequestHeaders(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadRequestHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadRequestHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadRequestHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicTypingFunction1(value: /* field */ String | Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTyping")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDynamicTyping(
      value: Boolean | (StringDictionary[Boolean] with NumberDictionary[Boolean]) | (js.Function1[/* field */ String | Double, Boolean])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTyping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicTyping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicTyping")(js.undefined)
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
    def withError(value: (/* error */ ParseError, /* file */ js.UndefOr[File]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withEscapeChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscapeChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escapeChar")(js.undefined)
        ret
    }
    @scala.inline
    def withFastMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fastMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(js.undefined)
        ret
    }
    @scala.inline
    def withNewline(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newline")(js.undefined)
        ret
    }
    @scala.inline
    def withPreview(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preview")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteChar")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipEmptyLines(value: Boolean | greedy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipEmptyLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipEmptyLines")(js.undefined)
        ret
    }
    @scala.inline
    def withStep(value: (/* results */ ParseResult, /* parser */ Parser) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("step")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* value */ String, /* field */ String | Double) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTransformHeader(value: /* header */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformHeader")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransformHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transformHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withTrimHeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimHeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrimHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trimHeaders")(js.undefined)
        ret
    }
    @scala.inline
    def withWithCredentials(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithCredentials: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withCredentials")(js.undefined)
        ret
    }
    @scala.inline
    def withWorker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(js.undefined)
        ret
    }
  }
  
}

