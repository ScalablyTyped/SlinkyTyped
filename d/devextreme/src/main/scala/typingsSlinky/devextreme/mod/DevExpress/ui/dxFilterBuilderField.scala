package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.DisplayExpr
import typingsSlinky.devextreme.anon.FilterOperation
import typingsSlinky.devextreme.anon.Value
import typingsSlinky.devextreme.devextremeStrings.Equalssign
import typingsSlinky.devextreme.devextremeStrings.Greaterthansign
import typingsSlinky.devextreme.devextremeStrings.GreaterthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.Lessthansign
import typingsSlinky.devextreme.devextremeStrings.LessthansignEqualssign
import typingsSlinky.devextreme.devextremeStrings.LessthansignGreaterthansign
import typingsSlinky.devextreme.devextremeStrings.`object`
import typingsSlinky.devextreme.devextremeStrings.between
import typingsSlinky.devextreme.devextremeStrings.boolean_
import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.endswith
import typingsSlinky.devextreme.devextremeStrings.isblank
import typingsSlinky.devextreme.devextremeStrings.isnotblank
import typingsSlinky.devextreme.devextremeStrings.notcontains
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.startswith
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxFilterBuilderField extends js.Object {
  /** Specifies the field's custom filtering rules. */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.native
  /** Specifies the data field's caption. */
  var caption: js.UndefOr[String] = js.native
  /** Customizes the input value's display text. */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Value, String]] = js.native
  /** Specifies the name of a field to be filtered. */
  var dataField: js.UndefOr[String] = js.native
  /** Casts field values to a specific data type. */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.native
  /** Configures the widget used to edit the field value. */
  var editorOptions: js.UndefOr[js.Any] = js.native
  /** Specifies the editor's custom template. */
  var editorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ FilterOperation, 
      /* container */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies the false value text. Applies only if dataType is "boolean". */
  var falseText: js.UndefOr[String] = js.native
  /** Specifies a set of available filter operations. */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ]
  ] = js.native
  /** Formats a value before it is displayed. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.native
  /** Configures the lookup field. */
  var lookup: js.UndefOr[DisplayExpr] = js.native
  /** Specifies the field's name. Use it to distinguish the field from other fields when they have identical dataField values. */
  var name: js.UndefOr[String] = js.native
  /** Specifies the true value text. Applies only if dataType is "boolean". */
  var trueText: js.UndefOr[String] = js.native
}

object dxFilterBuilderField {
  @scala.inline
  def apply(): dxFilterBuilderField = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderField]
  }
  @scala.inline
  implicit class dxFilterBuilderFieldOps[Self <: dxFilterBuilderField] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateFilterExpression(
      value: (/* filterValue */ js.Any, /* selectedFilterOperation */ String) => String | js.Array[_] | js.Function
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateFilterExpression")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCalculateFilterExpression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calculateFilterExpression")(js.undefined)
        ret
    }
    @scala.inline
    def withCaption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("caption")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomizeText(value: /* fieldInfo */ Value => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCustomizeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customizeText")(js.undefined)
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
    def withDataType(value: string_ | number | date | boolean_ | `object` | datetime): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataType")(js.undefined)
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
    def withEditorTemplateFunction2(
      value: (/* conditionInfo */ FilterOperation, /* container */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorTemplate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEditorTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEditorTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* conditionInfo */ FilterOperation, 
          /* container */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditorTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editorTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withFalseText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFalseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("falseText")(js.undefined)
        ret
    }
    @scala.inline
    def withFilterOperations(
      value: js.Array[
          Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilterOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filterOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withLookup(value: DisplayExpr): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLookup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lookup")(js.undefined)
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
    def withTrueText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrueText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trueText")(js.undefined)
        ret
    }
  }
  
}

