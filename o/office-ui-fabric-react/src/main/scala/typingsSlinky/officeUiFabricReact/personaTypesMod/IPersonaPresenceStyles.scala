package typingsSlinky.officeUiFabricReact.personaTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPersonaPresenceStyles extends js.Object {
  var presence: IStyle = js.native
  var presenceIcon: IStyle = js.native
}

object IPersonaPresenceStyles {
  @scala.inline
  def apply(): IPersonaPresenceStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPersonaPresenceStyles]
  }
  @scala.inline
  implicit class IPersonaPresenceStylesOps[Self <: IPersonaPresenceStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPresence(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(js.undefined)
        ret
    }
    @scala.inline
    def withPresenceNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presence")(null)
        ret
    }
    @scala.inline
    def withPresenceIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresenceIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withPresenceIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceIcon")(null)
        ret
    }
  }
  
}

