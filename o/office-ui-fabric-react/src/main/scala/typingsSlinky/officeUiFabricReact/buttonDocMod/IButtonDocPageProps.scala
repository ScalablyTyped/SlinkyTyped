package typingsSlinky.officeUiFabricReact.buttonDocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IButtonDocPageProps extends js.Object {
  var areButtonsChecked: Boolean = js.native
  var areButtonsDisabled: Boolean = js.native
}

object IButtonDocPageProps {
  @scala.inline
  def apply(areButtonsChecked: Boolean, areButtonsDisabled: Boolean): IButtonDocPageProps = {
    val __obj = js.Dynamic.literal(areButtonsChecked = areButtonsChecked.asInstanceOf[js.Any], areButtonsDisabled = areButtonsDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[IButtonDocPageProps]
  }
  @scala.inline
  implicit class IButtonDocPagePropsOps[Self <: IButtonDocPageProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAreButtonsChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areButtonsChecked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAreButtonsDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("areButtonsDisabled")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

