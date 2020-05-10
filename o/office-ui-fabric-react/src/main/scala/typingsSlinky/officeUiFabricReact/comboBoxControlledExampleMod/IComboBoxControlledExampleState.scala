package typingsSlinky.officeUiFabricReact.comboBoxControlledExampleMod

import typingsSlinky.officeUiFabricReact.comboBoxTypesMod.IComboBoxOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IComboBoxControlledExampleState extends js.Object {
  /**
    * Initial display value for the single-select example.
    * This will be cleared after the options are resolved for the first time.
    */
  var initialDisplayValue: js.UndefOr[String] = js.native
  /**
    * Initial display value for the multi-select example.
    * This will be cleared after the options are resolved for the first time.
    */
  var initialDisplayValueMulti: js.UndefOr[String] = js.native
  /** Current options for the single-select example */
  var options: js.Array[IComboBoxOption] = js.native
  /** Current options for the multi-select example */
  var optionsMulti: js.Array[IComboBoxOption] = js.native
  /** Current selected option for the single-select example */
  var selectedOptionKey: js.UndefOr[String | Double] = js.native
  /** Current selected options for the multi-select example */
  var selectedOptionKeys: js.UndefOr[js.Array[String]] = js.native
}

object IComboBoxControlledExampleState {
  @scala.inline
  def apply(options: js.Array[IComboBoxOption], optionsMulti: js.Array[IComboBoxOption]): IComboBoxControlledExampleState = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], optionsMulti = optionsMulti.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComboBoxControlledExampleState]
  }
  @scala.inline
  implicit class IComboBoxControlledExampleStateOps[Self <: IComboBoxControlledExampleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[IComboBoxOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptionsMulti(value: js.Array[IComboBoxOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionsMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialDisplayValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDisplayValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDisplayValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDisplayValue")(js.undefined)
        ret
    }
    @scala.inline
    def withInitialDisplayValueMulti(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDisplayValueMulti")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDisplayValueMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDisplayValueMulti")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOptionKey(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedOptionKeys(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedOptionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedOptionKeys")(js.undefined)
        ret
    }
  }
  
}

