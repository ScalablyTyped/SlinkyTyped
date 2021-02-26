package typingsSlinky.reactabularTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.anon.RowIndexNumber
import typingsSlinky.reactabularTable.mod.BodyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  @scala.inline
  def apply(rowKey: String, rows: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BodyProps]))
  }
  
  @JSImport("reactabular-table", "Body")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactabularTable.mod.Body] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRow(value: (/* row */ js.Any, /* props */ RowIndexNumber) => _): this.type = set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
