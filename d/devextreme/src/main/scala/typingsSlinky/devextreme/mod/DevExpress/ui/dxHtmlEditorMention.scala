package typingsSlinky.devextreme.mod.DevExpress.ui

import org.scalajs.dom.raw.Element
import typingsSlinky.devextreme.anon.Id
import typingsSlinky.devextreme.mod.DevExpress.core.dxElement
import typingsSlinky.devextreme.mod.DevExpress.data.DataSource
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsSlinky.devextreme.mod.global.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxHtmlEditorMention extends js.Object {
  
  /** @name dxHtmlEditorMention.dataSource */
  var dataSource: js.UndefOr[js.Array[String] | DataSource | DataSourceOptions] = js.native
  
  /** @name dxHtmlEditorMention.displayExpr */
  var displayExpr: js.UndefOr[String | (js.Function1[/* item */ js.Any, String])] = js.native
  
  /** @name dxHtmlEditorMention.itemTemplate */
  var itemTemplate: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.native
  
  /** @name dxHtmlEditorMention.marker */
  var marker: js.UndefOr[String] = js.native
  
  /** @name dxHtmlEditorMention.minSearchLength */
  var minSearchLength: js.UndefOr[Double] = js.native
  
  /** @name dxHtmlEditorMention.searchExpr */
  var searchExpr: js.UndefOr[String | js.Function | (js.Array[String | js.Function])] = js.native
  
  /** @name dxHtmlEditorMention.searchTimeout */
  var searchTimeout: js.UndefOr[Double] = js.native
  
  /** @name dxHtmlEditorMention.template */
  var template: js.UndefOr[
    typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ Id, /* contentElement */ dxElement, String | Element | JQuery])
  ] = js.native
  
  /** @name dxHtmlEditorMention.valueExpr */
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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataSourceVarargs(value: String*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[String] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDisplayExprFunction1(value: /* item */ js.Any => String): Self = this.set("displayExpr", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDisplayExpr(value: String | (js.Function1[/* item */ js.Any, String])): Self = this.set("displayExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayExpr: Self = this.set("displayExpr", js.undefined)
    
    @scala.inline
    def setItemTemplateElement(value: Element): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemTemplateFunction3(
      value: (/* itemData */ js.Any, /* itemIndex */ Double, /* itemElement */ dxElement) => String | Element | JQuery
    ): Self = this.set("itemTemplate", js.Any.fromFunction3(value))
    
    @scala.inline
    def setItemTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function3[
          /* itemData */ js.Any, 
          /* itemIndex */ Double, 
          /* itemElement */ dxElement, 
          String | Element | JQuery
        ])
    ): Self = this.set("itemTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemTemplate: Self = this.set("itemTemplate", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = this.set("marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarker: Self = this.set("marker", js.undefined)
    
    @scala.inline
    def setMinSearchLength(value: Double): Self = this.set("minSearchLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSearchLength: Self = this.set("minSearchLength", js.undefined)
    
    @scala.inline
    def setSearchExprVarargs(value: (String | js.Function)*): Self = this.set("searchExpr", js.Array(value :_*))
    
    @scala.inline
    def setSearchExpr(value: String | js.Function | (js.Array[String | js.Function])): Self = this.set("searchExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchExpr: Self = this.set("searchExpr", js.undefined)
    
    @scala.inline
    def setSearchTimeout(value: Double): Self = this.set("searchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchTimeout: Self = this.set("searchTimeout", js.undefined)
    
    @scala.inline
    def setTemplateFunction2(value: (/* mentionData */ Id, /* contentElement */ dxElement) => String | Element | JQuery): Self = this.set("template", js.Any.fromFunction2(value))
    
    @scala.inline
    def setTemplateElement(value: Element): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplate(
      value: typingsSlinky.devextreme.mod.DevExpress.core.template | (js.Function2[/* mentionData */ Id, /* contentElement */ dxElement, String | Element | JQuery])
    ): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setValueExpr(value: String | js.Function): Self = this.set("valueExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueExpr: Self = this.set("valueExpr", js.undefined)
  }
}
