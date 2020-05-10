package typingsSlinky.officeUiFabricReact.facepileBasicExampleMod

import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepileBasicExampleState extends js.Object {
  var imagesFadeIn: Boolean = js.native
  var numberOfFaces: js.Any = js.native
  var personaSize: PersonaSize = js.native
}

object IFacepileBasicExampleState {
  @scala.inline
  def apply(imagesFadeIn: Boolean, numberOfFaces: js.Any, personaSize: PersonaSize): IFacepileBasicExampleState = {
    val __obj = js.Dynamic.literal(imagesFadeIn = imagesFadeIn.asInstanceOf[js.Any], numberOfFaces = numberOfFaces.asInstanceOf[js.Any], personaSize = personaSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileBasicExampleState]
  }
  @scala.inline
  implicit class IFacepileBasicExampleStateOps[Self <: IFacepileBasicExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withImagesFadeIn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imagesFadeIn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberOfFaces(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberOfFaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersonaSize(value: PersonaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaSize")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

