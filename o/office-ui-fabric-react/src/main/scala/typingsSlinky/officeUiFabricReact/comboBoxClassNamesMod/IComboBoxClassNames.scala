package typingsSlinky.officeUiFabricReact.comboBoxClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxClassNames extends js.Object {
  var callout: String = js.native
  var container: String = js.native
  var divider: String = js.native
  var errorMessage: String = js.native
  var header: String = js.native
  var input: String = js.native
  var label: String = js.native
  var optionsContainer: String = js.native
  var optionsContainerWrapper: String = js.native
  var root: String = js.native
  var screenReaderText: String = js.native
}

object IComboBoxClassNames {
  @scala.inline
  def apply(
    callout: String,
    container: String,
    divider: String,
    errorMessage: String,
    header: String,
    input: String,
    label: String,
    optionsContainer: String,
    optionsContainerWrapper: String,
    root: String,
    screenReaderText: String
  ): IComboBoxClassNames = {
    val __obj = js.Dynamic.literal(callout = callout.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], optionsContainer = optionsContainer.asInstanceOf[js.Any], optionsContainerWrapper = optionsContainerWrapper.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], screenReaderText = screenReaderText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxClassNames]
  }
  @scala.inline
  implicit class IComboBoxClassNamesOps[Self <: IComboBoxClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCallout(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("header")(value.asInstanceOf[js.Any])
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
    def withOptionsContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsContainerWrapper(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsContainerWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenReaderText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

