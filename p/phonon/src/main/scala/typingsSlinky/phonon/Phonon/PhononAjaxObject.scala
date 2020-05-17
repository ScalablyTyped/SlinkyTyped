package typingsSlinky.phonon.Phonon

import org.scalajs.dom.raw.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhononAjaxObject extends js.Object {
  var contentType: js.UndefOr[String] = js.native
  var crossDomain: js.UndefOr[Boolean] = js.native
  var data: js.UndefOr[js.Any] = js.native
  var dataType: String = js.native
  var error: js.UndefOr[
    js.Function3[/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
  var headers: js.UndefOr[js.Any] = js.native
  var method: String = js.native
  var timeout: js.UndefOr[Double] = js.native
  var url: String = js.native
  def success(res: js.Any, xhr: XMLHttpRequest): Unit = js.native
}

object PhononAjaxObject {
  @scala.inline
  def apply(dataType: String, method: String, success: (js.Any, XMLHttpRequest) => Unit, url: String): PhononAjaxObject = {
    val __obj = js.Dynamic.literal(dataType = dataType.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], success = js.Any.fromFunction2(success), url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhononAjaxObject]
  }
  @scala.inline
  implicit class PhononAjaxObjectOps[Self <: PhononAjaxObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccess(value: (js.Any, XMLHttpRequest) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withCrossDomain(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCrossDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("crossDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withError(value: (/* res */ js.Any, /* flagError */ PhononAjaxErrorFlag, /* xhr */ XMLHttpRequest) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaders(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headers")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeout")(js.undefined)
        ret
    }
  }
  
}

