package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonEditorOptions
import typingsSlinky.devextreme.AnonLocation
import typingsSlinky.devextreme.devextremeStrings.button
import typingsSlinky.devextreme.devextremeStrings.empty
import typingsSlinky.devextreme.devextremeStrings.group
import typingsSlinky.devextreme.devextremeStrings.simple
import typingsSlinky.devextreme.devextremeStrings.tabbed
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFormSimpleItem extends js.Object {
  /** Specifies the number of columns spanned by the item. */
  var colSpan: js.UndefOr[Double] = js.native
  /** Specifies a CSS class to be applied to the form item. */
  var cssClass: js.UndefOr[String] = js.native
  /** Specifies the path to the formData object field bound to the current form item. */
  var dataField: js.UndefOr[String] = js.native
  /** Configures the form item's editor. */
  var editorOptions: js.UndefOr[js.Any] = js.native
  /** Specifies which editor widget is used to display and edit the form item value. */
  var editorType: js.UndefOr[
    typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxCalendar | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxColorBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxDropDownBox | typingsSlinky.devextreme.devextremeStrings.dxHtmlEditor | typingsSlinky.devextreme.devextremeStrings.dxLookup | typingsSlinky.devextreme.devextremeStrings.dxNumberBox | typingsSlinky.devextreme.devextremeStrings.dxRadioGroup | typingsSlinky.devextreme.devextremeStrings.dxRangeSlider | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxSlider | typingsSlinky.devextreme.devextremeStrings.dxSwitch | typingsSlinky.devextreme.devextremeStrings.dxTagBox | typingsSlinky.devextreme.devextremeStrings.dxTextArea | typingsSlinky.devextreme.devextremeStrings.dxTextBox
  ] = js.native
  /** Specifies the help text displayed for the current form item. */
  var helpText: js.UndefOr[String] = js.native
  /** Specifies whether the current form item is required. */
  var isRequired: js.UndefOr[Boolean] = js.native
  /** Specifies the item's type. Set it to "simple" to create a simple item. */
  var itemType: js.UndefOr[empty | group | simple | tabbed | button] = js.native
  /** Specifies options for the form item label. */
  var label: js.UndefOr[AnonLocation] = js.native
  /** Specifies a name that identifies the form item. */
  var name: js.UndefOr[String] = js.native
  /** A template to be used for rendering the form item. */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonEditorOptions, /* itemElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** An array of validation rules to be checked for the form item editor. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** Specifies whether or not the current form item is visible. */
  var visible: js.UndefOr[Boolean] = js.native
  /** Specifies the sequence number of the item in a form, group or tab. */
  var visibleIndex: js.UndefOr[Double] = js.native
}

object dxFormSimpleItem {
  @scala.inline
  def apply(): dxFormSimpleItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFormSimpleItem]
  }
  @scala.inline
  implicit class dxFormSimpleItemOps[Self <: dxFormSimpleItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColSpan(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColSpan: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colSpan")(js.undefined)
        ret
    }
    @scala.inline
    def withCssClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCssClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cssClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDataField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataField")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorType(
      value: typingsSlinky.devextreme.devextremeStrings.dxAutocomplete | typingsSlinky.devextreme.devextremeStrings.dxCalendar | typingsSlinky.devextreme.devextremeStrings.dxCheckBox | typingsSlinky.devextreme.devextremeStrings.dxColorBox | typingsSlinky.devextreme.devextremeStrings.dxDateBox | typingsSlinky.devextreme.devextremeStrings.dxDropDownBox | typingsSlinky.devextreme.devextremeStrings.dxHtmlEditor | typingsSlinky.devextreme.devextremeStrings.dxLookup | typingsSlinky.devextreme.devextremeStrings.dxNumberBox | typingsSlinky.devextreme.devextremeStrings.dxRadioGroup | typingsSlinky.devextreme.devextremeStrings.dxRangeSlider | typingsSlinky.devextreme.devextremeStrings.dxSelectBox | typingsSlinky.devextreme.devextremeStrings.dxSlider | typingsSlinky.devextreme.devextremeStrings.dxSwitch | typingsSlinky.devextreme.devextremeStrings.dxTagBox | typingsSlinky.devextreme.devextremeStrings.dxTextArea | typingsSlinky.devextreme.devextremeStrings.dxTextBox
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorType")(js.undefined)
        ret
    }
    @scala.inline
    def withHelpText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHelpText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("helpText")(js.undefined)
        ret
    }
    @scala.inline
    def withIsRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withItemType(value: empty | group | simple | tabbed | button): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemType")(js.undefined)
        ret
    }
    @scala.inline
    def withLabel(value: AnonLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(value: (/* data */ AnonEditorOptions, /* itemElement */ dxElement) => String | Element | JQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* data */ AnonEditorOptions, /* itemElement */ dxElement, String | Element | JQuery])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidationRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validationRules")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleIndex")(js.undefined)
        ret
    }
  }
  
}

