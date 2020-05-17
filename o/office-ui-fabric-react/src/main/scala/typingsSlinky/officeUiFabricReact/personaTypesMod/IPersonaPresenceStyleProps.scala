package typingsSlinky.officeUiFabricReact.personaTypesMod

import typingsSlinky.officeUiFabricReact.anon.Available
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaSharedProps, 'presence' | 'isOutOfOffice' | 'size' | 'presenceColors'> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'className'> */
@js.native
trait IPersonaPresenceStyleProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var isOutOfOffice: js.UndefOr[Boolean] = js.native
  var presence: js.UndefOr[PersonaPresence] = js.native
  var presenceColors: js.UndefOr[Available] = js.native
  var size: js.UndefOr[PersonaSize] = js.native
  var theme: ITheme = js.native
}

object IPersonaPresenceStyleProps {
  @scala.inline
  def apply(theme: ITheme): IPersonaPresenceStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyleProps]
  }
  @scala.inline
  implicit class IPersonaPresenceStylePropsOps[Self <: IPersonaPresenceStyleProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOutOfOffice(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfOffice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOutOfOffice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOutOfOffice")(js.undefined)
        ret
    }
    @scala.inline
    def withPresence(value: PersonaPresence): Self = {
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
    def withPresenceColors(value: Available): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceColors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresenceColors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presenceColors")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: PersonaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

