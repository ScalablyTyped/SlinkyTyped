package typingsSlinky.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileUploadArguments extends js.Object {
  var fileLocale: js.UndefOr[String] = js.native
  var moneyInMicros: js.UndefOr[Boolean] = js.native
  var timeZone: js.UndefOr[String] = js.native
}

object FileUploadArguments {
  @scala.inline
  def apply(): FileUploadArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileUploadArguments]
  }
  @scala.inline
  implicit class FileUploadArgumentsOps[Self <: FileUploadArguments] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileLocale")(js.undefined)
        ret
    }
    @scala.inline
    def withMoneyInMicros(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyInMicros")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMoneyInMicros: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("moneyInMicros")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeZone")(js.undefined)
        ret
    }
  }
  
}

