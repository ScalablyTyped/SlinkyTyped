package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.ColumnsRendererContext
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.FooterRendererContext
import typingsSlinky.oracleOraclejet.ojtableMod.ojTable.HeaderRendererContext
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.auto
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.disabled
import typingsSlinky.oracleOraclejet.oracleOraclejetStrings.enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field[K, D] extends js.Object {
  var className: js.UndefOr[String | Null] = js.native
  var field: js.UndefOr[String | Null] = js.native
  var footerClassName: js.UndefOr[String | Null] = js.native
  var footerRenderer: js.UndefOr[(js.Function1[/* context */ FooterRendererContext[K, D], `1` | Unit]) | Null] = js.native
  var footerStyle: js.UndefOr[String | Null] = js.native
  var footerTemplate: js.UndefOr[ComponentElementElement] = js.native
  var headerClassName: js.UndefOr[String | Null] = js.native
  var headerRenderer: js.UndefOr[(js.Function1[/* context */ HeaderRendererContext[K, D], `1` | Unit]) | Null] = js.native
  var headerStyle: js.UndefOr[String | Null] = js.native
  var headerTemplate: js.UndefOr[ComponentElementData] = js.native
  var headerText: js.UndefOr[String | Null] = js.native
  var id: js.UndefOr[String | Null] = js.native
  var renderer: js.UndefOr[(js.Function1[/* context */ ColumnsRendererContext[K, D], `1` | Unit]) | Null] = js.native
  var resizable: js.UndefOr[enabled | disabled] = js.native
  var sortProperty: js.UndefOr[String | Null] = js.native
  var sortable: js.UndefOr[auto | enabled | disabled] = js.native
  var style: js.UndefOr[String | Null] = js.native
  var template: js.UndefOr[Mode] = js.native
  var width: js.UndefOr[Double | Null] = js.native
}

object Field {
  @scala.inline
  def apply[K, D](): Field[K, D] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Field[K, D]]
  }
  @scala.inline
  implicit class FieldOps[Self[k, d] <: Field[k, d], K, D] (val x: Self[K, D]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K, D] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K, D]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[K, D]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[K, D]) with Other]
    @scala.inline
    def withClassName(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClassNameNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(null)
        ret
    }
    @scala.inline
    def withField(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutField: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(js.undefined)
        ret
    }
    @scala.inline
    def withFieldNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("field")(null)
        ret
    }
    @scala.inline
    def withFooterClassName(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterClassName: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterClassNameNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerClassName")(null)
        ret
    }
    @scala.inline
    def withFooterRenderer(value: /* context */ FooterRendererContext[K, D] => `1` | Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFooterRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterRendererNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerRenderer")(null)
        ret
    }
    @scala.inline
    def withFooterStyle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterStyle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withFooterStyleNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerStyle")(null)
        ret
    }
    @scala.inline
    def withFooterTemplate(value: ComponentElementElement): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFooterTemplate: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("footerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassName(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderClassName: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderClassNameNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerClassName")(null)
        ret
    }
    @scala.inline
    def withHeaderRenderer(value: /* context */ HeaderRendererContext[K, D] => `1` | Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHeaderRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderRendererNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerRenderer")(null)
        ret
    }
    @scala.inline
    def withHeaderStyle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderStyle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderStyleNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerStyle")(null)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: ComponentElementData): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderText(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderText: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTextNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerText")(null)
        ret
    }
    @scala.inline
    def withId(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIdNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(null)
        ret
    }
    @scala.inline
    def withRenderer(value: /* context */ ColumnsRendererContext[K, D] => `1` | Unit): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutRenderer: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.undefined)
        ret
    }
    @scala.inline
    def withRendererNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(null)
        ret
    }
    @scala.inline
    def withResizable(value: enabled | disabled): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResizable: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizable")(js.undefined)
        ret
    }
    @scala.inline
    def withSortProperty(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperty")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortProperty: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withSortPropertyNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortProperty")(null)
        ret
    }
    @scala.inline
    def withSortable(value: auto | enabled | disabled): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSortable: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortable")(js.undefined)
        ret
    }
    @scala.inline
    def withStyle(value: String): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyle: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(js.undefined)
        ret
    }
    @scala.inline
    def withStyleNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(null)
        ret
    }
    @scala.inline
    def withTemplate(value: Mode): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withWidthNull: Self[K, D] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(null)
        ret
    }
  }
  
}

