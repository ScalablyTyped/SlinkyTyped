package typingsSlinky.reactPdf.pageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PDFPageItem extends js.Object {
  var _transport: js.Object = js.native
  var commonObjs: js.Object = js.native
  def getAnnotations(args: js.Any*): js.Any = js.native
  def getTextContent(args: js.Any*): js.Any = js.native
  def getViewport(args: js.Any*): js.Any = js.native
  def render(args: js.Any*): js.Any = js.native
}

object PDFPageItem {
  @scala.inline
  def apply(
    _transport: js.Object,
    commonObjs: js.Object,
    getAnnotations: /* repeated */ js.Any => js.Any,
    getTextContent: /* repeated */ js.Any => js.Any,
    getViewport: /* repeated */ js.Any => js.Any,
    render: /* repeated */ js.Any => js.Any
  ): PDFPageItem = {
    val __obj = js.Dynamic.literal(_transport = _transport.asInstanceOf[js.Any], commonObjs = commonObjs.asInstanceOf[js.Any], getAnnotations = js.Any.fromFunction1(getAnnotations), getTextContent = js.Any.fromFunction1(getTextContent), getViewport = js.Any.fromFunction1(getViewport), render = js.Any.fromFunction1(render))
    __obj.asInstanceOf[PDFPageItem]
  }
  @scala.inline
  implicit class PDFPageItemOps[Self <: PDFPageItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_transport(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_transport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommonObjs(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("commonObjs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAnnotations(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAnnotations")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetTextContent(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTextContent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetViewport(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getViewport")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRender(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

