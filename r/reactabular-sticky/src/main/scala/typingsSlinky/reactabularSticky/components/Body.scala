package typingsSlinky.reactabularSticky.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactabularSticky.anon.PartialUIEvent
import typingsSlinky.reactabularSticky.mod.StickyBodyProps
import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.anon.RowIndexNumber
import typingsSlinky.reactabularTable.mod.BodyProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Body {
  
  @JSImport("reactabular-sticky", "Body")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactabularSticky.mod.Body] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRow(value: (/* row */ js.Any, /* props */ RowIndexNumber) => _): this.type = set("onRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def onScroll(value: /* e */ PartialUIEvent => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeader(value: HTMLElement): this.type = set("tableHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableHeaderNull: this.type = set("tableHeader", null)
  }
  
  def withProps(p: StickyBodyProps with BodyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(rowKey: String, rows: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(rowKey = rowKey.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StickyBodyProps with BodyProps]))
  }
}
