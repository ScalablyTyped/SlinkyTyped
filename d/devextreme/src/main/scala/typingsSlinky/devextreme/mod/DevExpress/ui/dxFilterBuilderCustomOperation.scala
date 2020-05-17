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

@js.native
trait dxFilterBuilderCustomOperation extends js.Object {
  /** Specifies a function that returns a filter expression for this custom operation. */
  var calculateFilterExpression: js.UndefOr[
    js.Function2[
      /* filterValue */ js.Any, 
      /* field */ dxFilterBuilderField, 
      String | js.Array[_] | js.Function
    ]
  ] = js.native
  /** Specifies the operation's caption. */
  var caption: js.UndefOr[String] = js.native
  /** Customizes the field value's text representation. */
  var customizeText: js.UndefOr[js.Function1[/* fieldInfo */ Field, String]] = js.native
  /** Specifies for which data types the operation is available by default. */
  var dataTypes: js.UndefOr[js.Array[string_ | number | date | boolean_ | `object` | datetime]] = js.native
  /** Specifies a custom template for the widget used to edit the field value. */
  var editorTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* conditionInfo */ SetValue, /* container */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies whether the operation can have a value. If it can, the editor is displayed. */
  var hasValue: js.UndefOr[Boolean] = js.native
  /** Specifies the icon that should represent the filter operation. */
  var icon: js.UndefOr[String] = js.native
  /** Specifies the operation's identifier. */
  var name: js.UndefOr[String] = js.native
}

object dxFilterBuilderCustomOperation {
  @scala.inline
  def apply(): dxFilterBuilderCustomOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxFilterBuilderCustomOperation]
  }
  @scala.inline
  implicit class dxFilterBuilderCustomOperationOps[Self <: dxFilterBuilderCustomOperation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalculateFilterExpression(
      value: (/* filterValue */ js.Any, /* field */ dxFilterBuilderField) => String | js.Array[_] | js.Function
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
    def withCustomizeText(value: /* fieldInfo */ Field => String): Self = {
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
    def withDataTypes(value: js.Array[string_ | number | date | boolean_ | `object` | datetime]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withEditorTemplateFunction2(value: (/* conditionInfo */ SetValue, /* container */ dxElement) => String | Element | JQuery): Self = {
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
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* conditionInfo */ SetValue, /* container */ dxElement, String | Element | JQuery])
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
    def withHasValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHasValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hasValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(js.undefined)
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
  }
  
}

