package typingsSlinky.expressFormidable.mod

import typingsSlinky.expressFormidable.expressFormidableStrings.md5
import typingsSlinky.expressFormidable.expressFormidableStrings.multipart
import typingsSlinky.expressFormidable.expressFormidableStrings.sha1
import typingsSlinky.expressFormidable.expressFormidableStrings.urlencoded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressFormidableOptions extends js.Object {
  var encoding: js.UndefOr[String] = js.native
  var hash: js.UndefOr[Boolean | sha1 | md5] = js.native
  var keepExtensions: js.UndefOr[Boolean] = js.native
  var maxFields: js.UndefOr[Double] = js.native
  var maxFieldsSize: js.UndefOr[Double] = js.native
  var maxFileSize: js.UndefOr[Double] = js.native
  var multiples: js.UndefOr[Boolean] = js.native
  var `type`: js.UndefOr[multipart | urlencoded] = js.native
  var uploadDir: js.UndefOr[String] = js.native
}

object ExpressFormidableOptions {
  @scala.inline
  def apply(): ExpressFormidableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressFormidableOptions]
  }
  @scala.inline
  implicit class ExpressFormidableOptionsOps[Self <: ExpressFormidableOptions] (val x: Self) extends AnyVal {
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
    def withHash(value: Boolean | sha1 | md5): Self = {
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
    def withMaxFields(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFields: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFields")(js.undefined)
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
    def withMaxFileSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxFileSize")(js.undefined)
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
    def withType(value: multipart | urlencoded): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
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

