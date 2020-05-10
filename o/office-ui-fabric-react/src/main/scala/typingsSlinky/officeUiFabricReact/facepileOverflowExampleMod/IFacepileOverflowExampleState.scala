package typingsSlinky.officeUiFabricReact.facepileOverflowExampleMod

import typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepileOverflowExampleState extends js.Object {
  var displayedPersonas: js.Any = js.native
  var overflowButtonType: OverflowButtonType = js.native
}

object IFacepileOverflowExampleState {
  @scala.inline
  def apply(displayedPersonas: js.Any, overflowButtonType: OverflowButtonType): IFacepileOverflowExampleState = {
    val __obj = js.Dynamic.literal(displayedPersonas = displayedPersonas.asInstanceOf[js.Any], overflowButtonType = overflowButtonType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFacepileOverflowExampleState]
  }
  @scala.inline
  implicit class IFacepileOverflowExampleStateOps[Self <: IFacepileOverflowExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisplayedPersonas(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayedPersonas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverflowButtonType(value: OverflowButtonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

