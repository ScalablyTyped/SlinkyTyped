package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Id
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxHtmlEditorMention extends js.Object {
  /** Provides data for the suggestion list. */
  var dataSource: js.UndefOr[js.Array[String] | DataSource | DataSourceOptions] = js.native
  /** Specifies the data field whose values should be displayed in the suggestion list. */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  /** Specifies a custom template for suggestion list items. */
  var itemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  /** Specifies the prefix that a user enters to activate mentions. You can use different prefixes with different dataSources. */
  var marker: js.UndefOr[String] = js.native
  /** Specifies the minimum number of characters that a user should type to trigger the search. */
  var minSearchLength: js.UndefOr[Double] = js.native
  /** Specifies one or several data fields to search. */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  /** Specifies the delay between when a user stops typing and when the search is executed. */
  var searchTimeout: js.UndefOr[Double] = js.native
  /** Specifies a custom template for mentions. */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ Id, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  /** Specifies which data field provides unique values to the template's `id` parameter. */
  var valueExpr: js.UndefOr[String | js.Function] = js.native
}

object dxHtmlEditorMention {
  @scala.inline
  def apply(): dxHtmlEditorMention = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxHtmlEditorMention]
  }
  @scala.inline
  implicit class dxHtmlEditorMentionOps[Self <: dxHtmlEditorMention] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataSource(value: js.Array[String] | DataSource | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayExprFunction1(value: /* item */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplateElement(value: Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("marker")(js.undefined)
        ret
    }
    @scala.inline
    def withMinSearchLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSearchLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinSearchLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minSearchLength")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchExpr")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchTimeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchTimeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchTimeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateFunction2(value: (/* mentionData */ Id, /* contentElement */ dxElement) => String | Element | JQuery): Self = {
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
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ Id, /* contentElement */ dxElement, String | Element | JQuery])
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
    def withValueExpr(value: String | js.Function): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueExpr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueExpr")(js.undefined)
        ret
    }
  }
  
}

