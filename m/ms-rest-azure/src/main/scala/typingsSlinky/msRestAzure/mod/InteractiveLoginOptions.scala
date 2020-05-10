package typingsSlinky.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractiveLoginOptions extends DeviceTokenCredentialsOptions {
  /**
    * The language code specifying how the message should be localized to. Default value 'en-us'.
    */
  var language: js.UndefOr[String] = js.native
}

object InteractiveLoginOptions {
  @scala.inline
  def apply(): InteractiveLoginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InteractiveLoginOptions]
  }
  @scala.inline
  implicit class InteractiveLoginOptionsOps[Self <: InteractiveLoginOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
  }
  
}

