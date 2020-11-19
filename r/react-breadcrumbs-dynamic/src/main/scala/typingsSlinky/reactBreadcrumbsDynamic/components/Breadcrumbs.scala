package typingsSlinky.reactBreadcrumbsDynamic.components

import org.scalajs.dom.raw.Element
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBreadcrumbsDynamic.mod.BreadcrumbsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Breadcrumbs {
  
  @JSImport("react-breadcrumbs-dynamic", "Breadcrumbs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBreadcrumbsDynamic.mod.Breadcrumbs] {
    
    @scala.inline
    def containerElement(value: Element): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def container(value: String | Element | js.Object): this.type = set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def containerProps(value: js.Object): this.type = set("containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duplicateProps(value: js.Object): this.type = set("duplicateProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def finalItemElement(value: Element): this.type = set("finalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def finalItem(value: String | Element | js.Object): this.type = set("finalItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def finalProps(value: js.Object): this.type = set("finalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemElement(value: Element): this.type = set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def item(value: String | Element | js.Object): this.type = set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def renameProps(value: js.Object): this.type = set("renameProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separatorElement(value: Element): this.type = set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def separator(value: String | Element | js.Object): this.type = set("separator", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BreadcrumbsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Breadcrumbs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
