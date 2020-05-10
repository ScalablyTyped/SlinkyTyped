package typingsSlinky.officeUiFabricReact.peoplePickerItemTypesMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaCoinStyleProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaStyleProps
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPeoplePickerItemSelectedSubComponentStyles extends js.Object {
  /** Refers to the Persona rendered within the PeoplePickerItemSelected */
  var persona: IStyleFunctionOrObject[IPersonaStyleProps, _] = js.native
  /** Refers to the PersonaCoin in the Persona rendered within the PeoplePickerItemSelected */
  var personaCoin: js.UndefOr[IStyleFunctionOrObject[IPersonaCoinStyleProps, _]] = js.native
}

object IPeoplePickerItemSelectedSubComponentStyles {
  @scala.inline
  def apply(persona: IStyleFunctionOrObject[IPersonaStyleProps, _]): IPeoplePickerItemSelectedSubComponentStyles = {
    val __obj = js.Dynamic.literal(persona = persona.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPeoplePickerItemSelectedSubComponentStyles]
  }
  @scala.inline
  implicit class IPeoplePickerItemSelectedSubComponentStylesOps[Self <: IPeoplePickerItemSelectedSubComponentStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonaFunction1(value: IPersonaStyleProps => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persona")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPersona(value: IStyleFunctionOrObject[IPersonaStyleProps, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persona")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonaCoinFunction1(value: IPersonaCoinStyleProps => Partial[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaCoin")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPersonaCoin(value: IStyleFunctionOrObject[IPersonaCoinStyleProps, _]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaCoin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonaCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaCoin")(js.undefined)
        ret
    }
  }
  
}

