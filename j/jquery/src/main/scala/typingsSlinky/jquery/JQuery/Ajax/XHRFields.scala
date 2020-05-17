package typingsSlinky.jquery.JQuery.Ajax

import org.scalajs.dom.raw.Event
import typingsSlinky.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// Writable properties on XMLHttpRequest
/* Inlined parent std.Partial<std.Pick<std.XMLHttpRequest, 'onreadystatechange' | 'responseType' | 'timeout' | 'withCredentials'>> */
@js.native
trait XHRFields extends js.Object {
  var msCaching: js.UndefOr[String] = js.native
  var onreadystatechange: js.UndefOr[js.ThisFunction1[/* this */ this.type, /* ev */ Event, _]] = js.native
  var responseType: js.UndefOr[XMLHttpRequestResponseType] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object XHRFields {
  @scala.inline
  def apply(): XHRFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XHRFields]
  }
  @scala.inline
  implicit class XHRFieldsOps[Self <: XHRFields] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMsCaching(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msCaching")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMsCaching: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("msCaching")(js.undefined)
        ret
    }
    @scala.inline
    def withOnreadystatechange(value: js.ThisFunction1[XHRFields, /* ev */ Event, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnreadystatechange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onreadystatechange")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseType(value: XMLHttpRequestResponseType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(js.undefined)
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
  }
  
}

