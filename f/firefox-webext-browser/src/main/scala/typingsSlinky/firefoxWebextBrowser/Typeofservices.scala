package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofservices extends js.Object {
  /* privacy.services properties */
  /**
    * If enabled, the password manager will ask if you want to save passwords. This preference's value is a boolean,
    * defaulting to `true`.
    */
  val passwordSavingEnabled: Setting = js.native
}

object Typeofservices {
  @scala.inline
  def apply(passwordSavingEnabled: Setting): Typeofservices = {
    val __obj = js.Dynamic.literal(passwordSavingEnabled = passwordSavingEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofservices]
  }
  @scala.inline
  implicit class TypeofservicesOps[Self <: Typeofservices] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPasswordSavingEnabled(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passwordSavingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

