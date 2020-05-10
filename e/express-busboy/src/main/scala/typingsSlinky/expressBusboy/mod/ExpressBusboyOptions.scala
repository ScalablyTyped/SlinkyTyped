package typingsSlinky.expressBusboy.mod

import typingsSlinky.connectBusboy.mod.ConnectBusboyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressBusboyOptions extends ConnectBusboyOptions {
  var allowedPath: js.UndefOr[String | js.RegExp | (js.Function1[/* url */ String, Boolean])] = js.native
  var mimeTypeLimit: js.UndefOr[String | js.Array[String]] = js.native
  var path: js.UndefOr[String] = js.native
  var restrictMultiple: js.UndefOr[Boolean] = js.native
  var upload: js.UndefOr[Boolean] = js.native
}

object ExpressBusboyOptions {
  @scala.inline
  def apply(): ExpressBusboyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressBusboyOptions]
  }
  @scala.inline
  implicit class ExpressBusboyOptionsOps[Self <: ExpressBusboyOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPathFunction1(value: /* url */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAllowedPathRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedPath(value: String | js.RegExp | (js.Function1[/* url */ String, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedPath")(js.undefined)
        ret
    }
    @scala.inline
    def withMimeTypeLimit(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMimeTypeLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mimeTypeLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withRestrictMultiple(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMultiple")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictMultiple: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMultiple")(js.undefined)
        ret
    }
    @scala.inline
    def withUpload(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.undefined)
        ret
    }
  }
  
}

