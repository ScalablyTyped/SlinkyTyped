package typingsSlinky.officeUiFabricReact.comboBoxComboBoxMod

import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxState extends js.Object {
  /** The options currently available for the callout */
  var currentOptions: js.Array[IComboBoxOption] = js.native
  /** When taking input, this will store the actual text that is being entered */
  var currentPendingValue: js.UndefOr[String] = js.native
  /**
    * When taking input, this will store the index that the options input matches
    * (-1 if no input or match)
    */
  var currentPendingValueValidIndex: Double = js.native
  /**
    * Stores the hovered over value in the dropdown
    * (used for styling the options without updating the input)
    */
  var currentPendingValueValidIndexOnHover: Double = js.native
  /** The focused state of the comboBox */
  var focused: js.UndefOr[Boolean] = js.native
  /** The open state */
  var isOpen: js.UndefOr[Boolean] = js.native
  /** The currently selected indices */
  var selectedIndices: js.UndefOr[js.Array[Double]] = js.native
  /** This value is used for the autocomplete hint value */
  var suggestedDisplayValue: js.UndefOr[String] = js.native
}

object IComboBoxState {
  @scala.inline
  def apply(
    currentOptions: js.Array[IComboBoxOption],
    currentPendingValueValidIndex: Double,
    currentPendingValueValidIndexOnHover: Double
  ): IComboBoxState = {
    val __obj = js.Dynamic.literal(currentOptions = currentOptions.asInstanceOf[js.Any], currentPendingValueValidIndex = currentPendingValueValidIndex.asInstanceOf[js.Any], currentPendingValueValidIndexOnHover = currentPendingValueValidIndexOnHover.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxState]
  }
  @scala.inline
  implicit class IComboBoxStateOps[Self <: IComboBoxState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentOptions(value: js.Array[IComboBoxOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPendingValueValidIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPendingValueValidIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPendingValueValidIndexOnHover(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPendingValueValidIndexOnHover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentPendingValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPendingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentPendingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentPendingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withFocused(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFocused: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("focused")(js.undefined)
        ret
    }
    @scala.inline
    def withIsOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOpen")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedIndices(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedIndices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedIndices")(js.undefined)
        ret
    }
    @scala.inline
    def withSuggestedDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuggestedDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suggestedDisplayValue")(js.undefined)
        ret
    }
  }
  
}

