package typingsSlinky.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLImgElement extends js.Object {
  @JSName("MSHTML.IHTMLImgElement_typekey")
  var MSHTMLDotIHTMLImgElement_typekey: IHTMLImgElement = js.native
  var align: String = js.native
  var alt: String = js.native
  var border: js.Any = js.native
  val complete: Boolean = js.native
  var dynsrc: String = js.native
  val fileCreatedDate: String = js.native
  val fileModifiedDate: String = js.native
  val fileSize: String = js.native
  val fileUpdatedDate: String = js.native
  var height: Double = js.native
  val href: String = js.native
  var hspace: Double = js.native
  var isMap: Boolean = js.native
  var loop: js.Any = js.native
  var lowsrc: String = js.native
  val mimeType: String = js.native
  var name: String = js.native
  val nameProp: String = js.native
  var onabort: js.Any = js.native
  var onerror: js.Any = js.native
  var onload: js.Any = js.native
  val protocol: String = js.native
  val readyState: String = js.native
  var src: String = js.native
  var start: String = js.native
  var useMap: String = js.native
  var vrml: String = js.native
  var vspace: Double = js.native
  var width: Double = js.native
}

object IHTMLImgElement {
  @scala.inline
  def apply(
    MSHTMLDotIHTMLImgElement_typekey: IHTMLImgElement,
    align: String,
    alt: String,
    border: js.Any,
    complete: Boolean,
    dynsrc: String,
    fileCreatedDate: String,
    fileModifiedDate: String,
    fileSize: String,
    fileUpdatedDate: String,
    height: Double,
    href: String,
    hspace: Double,
    isMap: Boolean,
    loop: js.Any,
    lowsrc: String,
    mimeType: String,
    name: String,
    nameProp: String,
    onabort: js.Any,
    onerror: js.Any,
    onload: js.Any,
    protocol: String,
    readyState: String,
    src: String,
    start: String,
    useMap: String,
    vrml: String,
    vspace: Double,
    width: Double
  ): IHTMLImgElement = {
    val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alt = alt.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], dynsrc = dynsrc.asInstanceOf[js.Any], fileCreatedDate = fileCreatedDate.asInstanceOf[js.Any], fileModifiedDate = fileModifiedDate.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any], fileUpdatedDate = fileUpdatedDate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], hspace = hspace.asInstanceOf[js.Any], isMap = isMap.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], lowsrc = lowsrc.asInstanceOf[js.Any], mimeType = mimeType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nameProp = nameProp.asInstanceOf[js.Any], onabort = onabort.asInstanceOf[js.Any], onerror = onerror.asInstanceOf[js.Any], onload = onload.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], useMap = useMap.asInstanceOf[js.Any], vrml = vrml.asInstanceOf[js.Any], vspace = vspace.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLImgElement_typekey")(MSHTMLDotIHTMLImgElement_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLImgElement]
  }
  @scala.inline
  implicit class IHTMLImgElementOps[Self <: IHTMLImgElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMSHTMLDotIHTMLImgElement_typekey(value: IHTMLImgElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MSHTML.IHTMLImgElement_typekey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBorder(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComplete(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynsrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileCreatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileCreatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileModifiedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileUpdatedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileUpdatedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHspace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoop(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLowsrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lowsrc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMimeType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNameProp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nameProp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnabort(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onabort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnerror(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnload(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReadyState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readyState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUseMap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVrml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vrml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVspace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

