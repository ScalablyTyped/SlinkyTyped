package typingsSlinky.activexMsxml2.MSXML2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** structure for reporting parser errors */
@js.native
trait IXMLDOMParseError extends js.Object {
  @JSName("MSXML2.IXMLDOMParseError_typekey")
  var MSXML2DotIXMLDOMParseError_typekey: IXMLDOMParseError = js.native
  /** the error code */
  val errorCode: Double = js.native
  /** the absolute file position in the XML document containing the error */
  val filepos: Double = js.native
  /** the line number in the XML document where the error occurred */
  val line: Double = js.native
  /** the character position in the line containing the error */
  val linepos: Double = js.native
  /** the cause of the error */
  val reason: String = js.native
  /** the data where the error occurred */
  val srcText: String = js.native
  /** the URL of the XML document containing the error */
  val url: String = js.native
}

object IXMLDOMParseError {
  @scala.inline
  def apply(
    MSXML2DotIXMLDOMParseError_typekey: IXMLDOMParseError,
    errorCode: Double,
    filepos: Double,
    line: Double,
    linepos: Double,
    reason: String,
    srcText: String,
    url: String
  ): IXMLDOMParseError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], filepos = filepos.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], linepos = linepos.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], srcText = srcText.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("MSXML2.IXMLDOMParseError_typekey")(MSXML2DotIXMLDOMParseError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IXMLDOMParseError]
  }
  @scala.inline
  implicit class IXMLDOMParseErrorOps[Self <: IXMLDOMParseError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSXML2DotIXMLDOMParseError_typekey(value: IXMLDOMParseError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSXML2.IXMLDOMParseError_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilepos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLine(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("line")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinepos(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linepos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReason(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrcText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

