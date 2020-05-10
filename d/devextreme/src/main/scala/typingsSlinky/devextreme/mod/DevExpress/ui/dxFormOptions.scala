package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.AnonComponentDataField
import typingsSlinky.devextreme.AnonDataFieldElement
import typingsSlinky.devextreme.devextremeStrings.auto
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFormOptions extends WidgetOptions[dxForm] {
  /** Specifies whether or not all root item labels are aligned. */
  var alignItemLabels: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not item labels in all groups are aligned. */
  var alignItemLabelsInAllGroups: js.UndefOr[Boolean] = js.native
  /** The count of columns in the form layout. */
  var colCount: js.UndefOr[Double | auto] = js.native
  /** Specifies dependency between the screen factor and the count of columns in the form layout. */
  var colCountByScreen: js.UndefOr[js.Any] = js.native
  /** Specifies a function that customizes a form item after it has been created. */
  var customizeItem: js.UndefOr[
    js.Function1[
      /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem, 
      _
    ]
  ] = js.native
  /** Provides the Form's data. Gets updated every time form fields change. */
  var formData: js.UndefOr[js.Any] = js.native
  /** Holds an array of form items. */
  var items: js.UndefOr[
    js.Array[
      dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
    ]
  ] = js.native
  /** Specifies the location of a label against the editor. */
  var labelLocation: js.UndefOr[left | right | top] = js.native
  /** The minimum column width used for calculating column count in the form layout. */
  var minColWidth: js.UndefOr[Double] = js.native
  /** A function that is executed when the Enter key has been pressed while an editor is focused. */
  var onEditorEnterKey: js.UndefOr[js.Function1[/* e */ AnonComponentDataField, _]] = js.native
  /** A function that is executed when the value of a formData object field is changed. */
  var onFieldDataChanged: js.UndefOr[js.Function1[/* e */ AnonDataFieldElement, _]] = js.native
  /** The text displayed for optional fields. */
  var optionalMark: js.UndefOr[String] = js.native
  /** Specifies whether all editors on the form are read-only. Applies only to non-templated items. */
  var readOnly: js.UndefOr[Boolean] = js.native
  /** The text displayed for required fields. */
  var requiredMark: js.UndefOr[String] = js.native
  /** Specifies the message that is shown for end-users if a required field value is not specified. */
  var requiredMessage: js.UndefOr[String] = js.native
  /** Specifies a function that categorizes screens by their width. */
  var screenByWidth: js.UndefOr[js.Function] = js.native
  /** A Boolean value specifying whether to enable or disable form scrolling. */
  var scrollingEnabled: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not a colon is displayed at the end of form labels. */
  var showColonAfterLabel: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the optional mark is displayed for optional fields. */
  var showOptionalMark: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the required mark is displayed for required fields. */
  var showRequiredMark: js.UndefOr[Boolean] = js.native
  /** Specifies whether or not the total validation summary is displayed on the form. */
  var showValidationSummary: js.UndefOr[Boolean] = js.native
  /** Gives a name to the internal validation group. */
  var validationGroup: js.UndefOr[String] = js.native
}

object dxFormOptions {
  @scala.inline
  def apply(): dxFormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormOptions]
  }
  @scala.inline
  implicit class dxFormOptionsOps[Self <: dxFormOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignItemLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItemLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItemLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItemLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withAlignItemLabelsInAllGroups(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItemLabelsInAllGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignItemLabelsInAllGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignItemLabelsInAllGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withColCount(value: Double | auto): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCount")(js.undefined)
        ret
    }
    @scala.inline
    def withColCountByScreen(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCountByScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColCountByScreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colCountByScreen")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeItem(
      value: /* item */ dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem => _
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeItem")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeItem")(js.undefined)
        ret
    }
    @scala.inline
    def withFormData(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formData")(js.undefined)
        ret
    }
    @scala.inline
    def withItems(
      value: js.Array[
          dxFormSimpleItem | dxFormGroupItem | dxFormTabbedItem | dxFormEmptyItem | dxFormButtonItem
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("items")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelLocation(value: left | right | top): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withMinColWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinColWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minColWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEditorEnterKey(value: /* e */ AnonComponentDataField => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorEnterKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnEditorEnterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEditorEnterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withOnFieldDataChanged(value: /* e */ AnonDataFieldElement => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldDataChanged")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnFieldDataChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFieldDataChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMark")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredMark(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredMark")(js.undefined)
        ret
    }
    @scala.inline
    def withRequiredMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequiredMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requiredMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenByWidth(value: js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenByWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenByWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenByWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withScrollingEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScrollingEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scrollingEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withShowColonAfterLabel(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColonAfterLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowColonAfterLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showColonAfterLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOptionalMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptionalMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOptionalMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptionalMark")(js.undefined)
        ret
    }
    @scala.inline
    def withShowRequiredMark(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRequiredMark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowRequiredMark: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showRequiredMark")(js.undefined)
        ret
    }
    @scala.inline
    def withShowValidationSummary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValidationSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowValidationSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showValidationSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationGroup")(js.undefined)
        ret
    }
  }
  
}

