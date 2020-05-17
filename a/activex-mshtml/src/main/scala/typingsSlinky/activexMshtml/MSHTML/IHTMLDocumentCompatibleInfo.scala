package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLDocumentCompatibleInfo extends js.Object {
  @JSName("MSHTML.IHTMLDocumentCompatibleInfo_typekey")
  var MSHTMLDotIHTMLDocumentCompatibleInfo_typekey: IHTMLDocumentCompatibleInfo = js.native
  val userAgent: String = js.native
  val version: String = js.native
}

object IHTMLDocumentCompatibleInfo {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLDocumentCompatibleInfo_typekey: IHTMLDocumentCompatibleInfo,
    userAgent: String,
    version: String
  ): IHTMLDocumentCompatibleInfo = {
    val __obj = js.Dynamic.literal(userAgent = userAgent.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocumentCompatibleInfo_typekey")(MSHTMLDotIHTMLDocumentCompatibleInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocumentCompatibleInfo]
  }
  @scala.inline
  implicit class IHTMLDocumentCompatibleInfoOps[Self <: IHTMLDocumentCompatibleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLDocumentCompatibleInfo_typekey(value: IHTMLDocumentCompatibleInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLDocumentCompatibleInfo_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserAgent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userAgent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

