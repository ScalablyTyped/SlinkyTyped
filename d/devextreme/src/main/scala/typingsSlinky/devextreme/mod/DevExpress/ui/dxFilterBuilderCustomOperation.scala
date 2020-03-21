package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.AnonField
import typingsSlinky.devextreme.AnonSetValue
import typingsSlinky.devextreme.devextremeStrings.`object`
import typingsSlinky.devextreme.devextremeStrings.boolean_
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFilterBuilderCustomOperation extends js.Object {
  /** Specifies a function that returns a filter expression for this custom operation. */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* field */ dxFilterBuilderField, 
      String | js.Array[_] | js.Function
    ]
  ] = js.undefined
  /** Specifies the operation's caption. */
  var caption: js.UndefOr[String] = js.undefined
  /** Customizes the field value's text representation. */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ AnonField, String]] = js.undefined
  /** Specifies for which data types the operation is available by default. */
  var dataTypes: js.UndefOr[js.Array[string_ | number | date | boolean_ | `object` | datetime]] = js.undefined
  /** Specifies a custom template for the widget used to edit the field value. */
  var editorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ AnonSetValue, 
      /* container */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies whether the operation can have a value. If it can, the editor is displayed. */
  var hasValue: js.UndefOr[Boolean] = js.undefined
  /** Specifies the icon that should represent the filter operation. */
  var icon: js.UndefOr[String] = js.undefined
  /** Specifies the operation's identifier. */
  var name: js.UndefOr[String] = js.undefined
}

object dxFilterBuilderCustomOperation {
  @scala.inline
  def apply(
    calculateFilterExpression: (/* filterValue */ js.Any, /* field */ dxFilterBuilderField) => String | js.Array[_] | js.Function = null,
    caption: String = null,
    customizeText: /* fieldInfo */ AnonField => String = null,
    dataTypes: js.Array[string_ | number | date | boolean_ | `object` | datetime] = null,
    editorTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* conditionInfo */ AnonSetValue, 
      /* container */ dxElement, 
      String | Element | JQuery
    ]) = null,
    hasValue: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    name: String = null
  ): dxFilterBuilderCustomOperation = {
    val __obj = js.Dynamic.literal()
    if (calculateFilterExpression != null) __obj.updateDynamic("calculateFilterExpression")(js.Any.fromFunction2(calculateFilterExpression))
    if (caption != null) __obj.updateDynamic("caption")(caption.asInstanceOf[js.Any])
    if (customizeText != null) __obj.updateDynamic("customizeText")(js.Any.fromFunction1(customizeText))
    if (dataTypes != null) __obj.updateDynamic("dataTypes")(dataTypes.asInstanceOf[js.Any])
    if (editorTemplate != null) __obj.updateDynamic("editorTemplate")(editorTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(hasValue)) __obj.updateDynamic("hasValue")(hasValue.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderCustomOperation]
  }
}

