package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Field
import typingsSlinky.devextreme.anon.SetValue
import typingsSlinky.devextreme.devextremeStrings.`object`
import typingsSlinky.devextreme.devextremeStrings.boolean_
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.number
import typingsSlinky.devextreme.devextremeStrings.string_
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxFilterBuilderCustomOperation extends js.Object {
  /** @name dxFilterBuilderCustomOperation.calculateFilterExpression */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* field */ dxFilterBuilderField, 
      String | js.Array[_] | js.Function
    ]
  ] = js.undefined
  /** @name dxFilterBuilderCustomOperation.caption */
  var caption: js.UndefOr[String] = js.undefined
  /** @name dxFilterBuilderCustomOperation.customizeText */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Field, String]] = js.undefined
  /** @name dxFilterBuilderCustomOperation.dataTypes */
  var dataTypes: js.UndefOr[js.Array[string_ | number | date | boolean_ | `object` | datetime]] = js.undefined
  /** @name dxFilterBuilderCustomOperation.editorTemplate */
  var editorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* conditionInfo */ SetValue, /* container */ dxElement, String | Element | JQuery])
  ] = js.undefined
  /** @name dxFilterBuilderCustomOperation.hasValue */
  var hasValue: js.UndefOr[Boolean] = js.undefined
  /** @name dxFilterBuilderCustomOperation.icon */
  var icon: js.UndefOr[String] = js.undefined
  /** @name dxFilterBuilderCustomOperation.name */
  var name: js.UndefOr[String] = js.undefined
}

object dxFilterBuilderCustomOperation {
  @scala.inline
  def apply(
    calculateFilterExpression: (/* filterValue */ js.Any, /* field */ dxFilterBuilderField) => String | js.Array[_] | js.Function = null,
    caption: String = null,
    customizeText: /* fieldInfo */ Field => String = null,
    dataTypes: js.Array[string_ | number | date | boolean_ | `object` | datetime] = null,
    editorTemplate: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* conditionInfo */ SetValue, /* container */ dxElement, String | Element | JQuery]) = null,
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
    if (!js.isUndefined(hasValue)) __obj.updateDynamic("hasValue")(hasValue.get.asInstanceOf[js.Any])
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxFilterBuilderCustomOperation]
  }
}

