package typingsSlinky.officeUiFabricReact.coachmarkBasicExampleMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICoachmarkBasicExampleStyles extends js.Object {
  /**
    * The example button container
    */
  var buttonContainer: IStyle = js.native
  /**
    * The dropdown component container
    */
  var dropdownContainer: IStyle = js.native
  /**
    * Style for the root element in the default enabled/unchecked state.
    */
  var root: js.UndefOr[IStyle] = js.native
}

object ICoachmarkBasicExampleStyles {
  @scala.inline
  def apply(): ICoachmarkBasicExampleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICoachmarkBasicExampleStyles]
  }
  @scala.inline
  implicit class ICoachmarkBasicExampleStylesOps[Self <: ICoachmarkBasicExampleStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withButtonContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonContainer")(null)
        ret
    }
    @scala.inline
    def withDropdownContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdownContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withDropdownContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdownContainer")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
  }
  
}

