package typingsSlinky.koaXmlBody

import typingsSlinky.koa.mod.Context
import typingsSlinky.xml2js.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonEncoding extends js.Object {
  // requested encoding. Default is utf8. If not set, the lib will retrive it from content-type(such as content-type:application/xml;charset=gb2312).
  var encoding: js.UndefOr[String] = js.native
  // length of the body. When content-length is found, it will be overwritten automatically.
  var length: js.UndefOr[Double] = js.native
  // limit of the body. If the body ends up being larger than this limit, a 413 error code is returned. Default is 1mb.
  var limit: js.UndefOr[Double] = js.native
  // error handler. Default is a noop function. It means it will eat the error silently. You can config it to customize the response.
  var onerror: js.UndefOr[js.Function2[/* err */ js.Error, /* ctx */ Context, Unit]] = js.native
  // options which will be used to parse xml. Default is {}. See xml2js Options for details.
  var xmlOptions: js.UndefOr[Options] = js.native
}

object AnonEncoding {
  @scala.inline
  def apply(): AnonEncoding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonEncoding]
  }
  @scala.inline
  implicit class AnonEncodingOps[Self <: AnonEncoding] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("length")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withOnerror(value: (/* err */ js.Error, /* ctx */ Context) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnerror: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onerror")(js.undefined)
        ret
    }
    @scala.inline
    def withXmlOptions(value: Options): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXmlOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xmlOptions")(js.undefined)
        ret
    }
  }
  
}

