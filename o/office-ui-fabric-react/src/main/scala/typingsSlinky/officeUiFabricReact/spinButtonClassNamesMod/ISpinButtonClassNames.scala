package typingsSlinky.officeUiFabricReact.spinButtonClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISpinButtonClassNames extends js.Object {
  var arrowBox: String = js.native
  var icon: String = js.native
  var input: String = js.native
  var label: String = js.native
  var labelWrapper: String = js.native
  var root: String = js.native
  var spinButtonWrapper: String = js.native
}

object ISpinButtonClassNames {
  @scala.inline
  def apply(
    arrowBox: String,
    icon: String,
    input: String,
    label: String,
    labelWrapper: String,
    root: String,
    spinButtonWrapper: String
  ): ISpinButtonClassNames = {
    val __obj = js.Dynamic.literal(arrowBox = arrowBox.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelWrapper = labelWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], spinButtonWrapper = spinButtonWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpinButtonClassNames]
  }
  @scala.inline
  implicit class ISpinButtonClassNamesOps[Self <: ISpinButtonClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowBox(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInput(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("input")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabelWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpinButtonWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinButtonWrapper")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

