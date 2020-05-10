package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadBlobOptions extends GetBlobPropertiesOptions {
  var disableContentMD5Validation: js.UndefOr[Boolean] = js.native
  var rangeEnd: js.UndefOr[String] = js.native
  var rangeStart: js.UndefOr[String] = js.native
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}

object ReadBlobOptions {
  @scala.inline
  def apply(): ReadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBlobOptions]
  }
  @scala.inline
  implicit class ReadBlobOptionsOps[Self <: ReadBlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisableContentMD5Validation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContentMD5Validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableContentMD5Validation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableContentMD5Validation")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeStart")(js.undefined)
        ret
    }
    @scala.inline
    def withUseTransactionalMD5(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransactionalMD5")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseTransactionalMD5: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useTransactionalMD5")(js.undefined)
        ret
    }
  }
  
}

