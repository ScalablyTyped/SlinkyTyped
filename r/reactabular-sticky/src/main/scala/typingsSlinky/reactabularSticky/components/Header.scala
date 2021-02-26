package typingsSlinky.reactabularSticky.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactabularSticky.anon.PartialUIEvent
import typingsSlinky.reactabularSticky.mod.StickyHeaderProps
import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.mod.Column
import typingsSlinky.reactabularTable.mod.HeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("reactabular-sticky", "Header")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactabularSticky.mod.Header] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerRows(value: js.Array[Column]): this.type = set("headerRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerRowsVarargs(value: Column*): this.type = set("headerRows", js.Array(value :_*))
    
    @scala.inline
    def onScroll(value: /* e */ PartialUIEvent => Unit): this.type = set("onScroll", js.Any.fromFunction1(value))
    
    @scala.inline
    def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableBody(value: HTMLElement): this.type = set("tableBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tableBodyNull: this.type = set("tableBody", null)
  }
  
  implicit def make(companion: Header.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StickyHeaderProps with HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
