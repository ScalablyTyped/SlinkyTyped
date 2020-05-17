package typingsSlinky.officeUiFabricReact.anon

import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Persona/Persona.types.IPersonaProps, 'primaryText' | 'text' | 'initialsColor'> */
@js.native
trait PickIPersonaPropsprimaryT extends js.Object {
  var initialsColor: js.UndefOr[PersonaInitialsColor | String] = js.native
  var primaryText: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object PickIPersonaPropsprimaryT {
  @scala.inline
  def apply(): PickIPersonaPropsprimaryT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickIPersonaPropsprimaryT]
  }
  @scala.inline
  implicit class PickIPersonaPropsprimaryTOps[Self <: PickIPersonaPropsprimaryT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInitialsColor(value: PersonaInitialsColor | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialsColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialsColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialsColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

