package typingsSlinky.reactMdForm.passwordMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigurableVisibilityIcon extends js.Object {
  /**
    * The icon to display while the password is currently invisible as the
    * password input.
    */
  var invisible: ReactElement = js.native
  /**
    * The icon to display while the password is currently visible as plain text.
    */
  var visible: ReactElement = js.native
}

object ConfigurableVisibilityIcon {
  @scala.inline
  def apply(): ConfigurableVisibilityIcon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurableVisibilityIcon]
  }
  @scala.inline
  implicit class ConfigurableVisibilityIconOps[Self <: ConfigurableVisibilityIcon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInvisible(value: ReactElement): Self = this.set("invisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvisible: Self = this.set("invisible", js.undefined)
    @scala.inline
    def setVisible(value: ReactElement): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

