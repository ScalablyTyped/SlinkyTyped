package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonDisplayExpr
import typingsSlinky.devextreme.AnonFilterOperation
import typingsSlinky.devextreme.AnonValue
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
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFilterBuilderField extends js.Object {
  /** Specifies the field's custom filtering rules. */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* selectedFilterOperation */ String, 
      String | js.Array[_] | js.Function
    ]
  ] = js.undefined
  /** Specifies the data field's caption. */
  var caption: js.UndefOr[String] = js.undefined
  /** Customizes the input value's display text. */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ AnonValue, String]] = js.undefined
  /** Specifies the name of a field to be filtered. */
  var dataField: js.UndefOr[String] = js.undefined
  /** Casts field values to a specific data type. */
  var dataType: js.UndefOr[string_ | number | date | boolean_ | `object` | datetime] = js.undefined
  /** Configures the widget used to edit the field value. */
  var editorOptions: js.UndefOr[js.Any] = js.undefined
  /** Specifies the editor's custom template. */
  var editorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ AnonFilterOperation, 
      /* container */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies the false value text. Applies only if dataType is "boolean". */
  var falseText: js.UndefOr[String] = js.undefined
  /** Specifies a set of available filter operations. */
  var filterOperations: js.UndefOr[
    js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ]
  ] = js.undefined
  /** Formats a value before it is displayed. */
  var format: js.UndefOr[typingsSlinky.devextreme.mod.DevExpress.ui.format] = js.undefined
  /** Configures the lookup field. */
  var lookup: js.UndefOr[AnonDisplayExpr] = js.undefined
  /** Specifies the field's name. Use it to distinguish the field from other fields when they have identical dataField values. */
  var name: js.UndefOr[String] = js.undefined
  /** Specifies the true value text. Applies only if dataType is "boolean". */
  var trueText: js.UndefOr[String] = js.undefined
}

object dxFilterBuilderField {
  @scala.inline
  def apply(
    calculateFilterExpression: (/* filterValue */ js.Any, /* selectedFilterOperation */ String) => String | js.Array[_] | js.Function = null,
    caption: String = null,
    customizeText: /* fieldInfo */ AnonValue => String = null,
    dataField: String = null,
    dataType: string_ | number | date | boolean_ | `object` | datetime = null,
    editorOptions: js.Any = null,
    editorTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ AnonFilterOperation, 
      /* container */ dxElement, 
      String | Element | JQuery
    ]) = null,
    falseText: String = null,
    filterOperations: js.Array[
      Equalssign | LessthansignGreaterthansign | Lessthansign | LessthansignEqualssign | Greaterthansign | GreaterthansignEqualssign | contains | endswith | isblank | isnotblank | notcontains | startswith | between | String
    ] = null,
    format: format = null,
    lookup: AnonDisplayExpr = null,
    name: String = null,
    trueText: String = null
  ): dxFilterBuilderField = {
    val __obj = js.Dynamic.literal()
    if (calculateFilterExpression != null) __obj.updateDynamic("calculateFilterExpression")(js.Any.fromFunction2(calculateFilterExpression))
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataField != null) __obj.updateDynamic("dataField")(dataField.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (editorOptions != null) __obj.updateDynamic("editorOptions")(editorOptions.asInstanceOf[js.Any])
    if (editorTemplate != null) __obj.updateDynamic("editorTemplate")(editorTemplate.asInstanceOf[js.Any])
    if (falseText != null) __obj.updateDynamic("falseText")(falseText.asInstanceOf[js.Any])
    if (filterOperations != null) __obj.updateDynamic("filterOperations")(filterOperations.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (trueText != null) __obj.updateDynamic("trueText")(trueText.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderField]
  }
}

