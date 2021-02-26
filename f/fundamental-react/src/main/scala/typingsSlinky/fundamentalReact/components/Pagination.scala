package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.Next
import typingsSlinky.fundamentalReact.paginationMod.PaginationProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Pagination {
  
  @scala.inline
  def apply(itemsTotal: Double, onClick: /* repeated */ js.Any => js.Any): Builder = {
    val __props = js.Dynamic.literal(itemsTotal = itemsTotal.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Builder(js.Array(this.component, __props.asInstanceOf[PaginationProps]))
  }
  
  @JSImport("fundamental-react", "Pagination")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fundamentalReact.mod.Pagination] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayTotal(value: Boolean): this.type = set("displayTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayTotalProps(value: js.Any): this.type = set("displayTotalProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialPage(value: Double): this.type = set("initialPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsPerPage(value: Double): this.type = set("itemsPerPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def linkProps(value: js.Any): this.type = set("linkProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localizedText(value: Next): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def nextProps(value: js.Any): this.type = set("nextProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def prevProps(value: js.Any): this.type = set("prevProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def totalText(value: String): this.type = set("totalText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visiblePageTotal(value: Double): this.type = set("visiblePageTotal", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PaginationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
