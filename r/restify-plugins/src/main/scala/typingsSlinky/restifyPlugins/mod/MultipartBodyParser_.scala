package typingsSlinky.restifyPlugins.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartBodyParser_ extends js.Object {
  var hash: js.UndefOr[String] = js.native
  var keepExtensions: js.UndefOr[Boolean] = js.native
  var mapFiles: js.UndefOr[Boolean] = js.native
  var mapParams: js.UndefOr[Boolean] = js.native
  var maxFieldsSize: js.UndefOr[Double] = js.native
  var multipartFileHandler: js.UndefOr[js.Any] = js.native
  var multipartHandler: js.UndefOr[js.Any] = js.native
  var multiples: js.UndefOr[Boolean] = js.native
  var overrideParams: js.UndefOr[Boolean] = js.native
  var uploadDir: js.UndefOr[String] = js.native
}

object MultipartBodyParser_ {
  @scala.inline
  def apply(): MultipartBodyParser_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartBodyParser_]
  }
  @scala.inline
  implicit class MultipartBodyParser_Ops[Self <: MultipartBodyParser_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHash(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hash")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepExtensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepExtensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepExtensions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepExtensions")(js.undefined)
        ret
    }
    @scala.inline
    def withMapFiles(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFiles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapFiles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapFiles")(js.undefined)
        ret
    }
    @scala.inline
    def withMapParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMapParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapParams")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxFieldsSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFieldsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFieldsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartFileHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartFileHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipartFileHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartFileHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMultipartHandler(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartHandler")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultipartHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multipartHandler")(js.undefined)
        ret
    }
    @scala.inline
    def withMultiples(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiples")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultiples: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multiples")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrideParams(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrideParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrideParams")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadDir(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadDir")(js.undefined)
        ret
    }
  }
  
}

