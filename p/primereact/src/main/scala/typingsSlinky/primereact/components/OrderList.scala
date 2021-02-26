package typingsSlinky.primereact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.orderListMod.OrderListProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrderList {
  
  @JSImport("primereact/orderlist", "OrderList")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactOrderlistMod.OrderList] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragdrop(value: Boolean): this.type = set("dragdrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemTemplate(value: /* item */ js.Any => js.UndefOr[ReactElement]): this.type = set("itemTemplate", js.Any.fromFunction1(value))
    
    @scala.inline
    def listStyle(value: js.Object): this.type = set("listStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* e */ Value => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tabIndex(value: String): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Array[_]): this.type = set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def valueVarargs(value: js.Any*): this.type = set("value", js.Array(value :_*))
  }
  
  implicit def make(companion: OrderList.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: OrderListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
