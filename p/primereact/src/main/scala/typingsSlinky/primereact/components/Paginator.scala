package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.paginatorMod.PageState
import typingsSlinky.primereact.paginatorMod.PaginatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Paginator {
  
  @JSImport("primereact/paginator", "Paginator")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactPaginatorMod.Paginator] {
    
    @scala.inline
    def alwaysShow(value: Boolean): this.type = set("alwaysShow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def currentPageReportTemplate(value: String): this.type = set("currentPageReportTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dropdownAppendTo(value: js.Any): this.type = set("dropdownAppendTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def first(value: Double): this.type = set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def leftContent(value: ReactElement): this.type = set("leftContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onPageChange(value: /* event */ PageState => Unit): this.type = set("onPageChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def pageLinkSize(value: Double): this.type = set("pageLinkSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rightContent(value: ReactElement): this.type = set("rightContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def rowsPerPageOptionsVarargs(value: js.Any*): this.type = set("rowsPerPageOptions", js.Array(value :_*))
    
    @scala.inline
    def rowsPerPageOptions(value: js.Array[_]): this.type = set("rowsPerPageOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def template(value: String): this.type = set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalRecords(value: Double): this.type = set("totalRecords", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginatorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Paginator.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
