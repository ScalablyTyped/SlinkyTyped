package typingsSlinky.reactabularTable.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactabularTable.anon.PartialCSSStyleDeclaratio
import typingsSlinky.reactabularTable.mod.Column
import typingsSlinky.reactabularTable.mod.HeaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Header {
  
  @JSImport("reactabular-table", "Header")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactabularTable.mod.Header] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def headerRowsVarargs(value: Column*): this.type = set("headerRows", js.Array(value :_*))
    
    @scala.inline
    def headerRows(value: js.Array[Column]): this.type = set("headerRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: PartialCSSStyleDeclaratio): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: HeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Header.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
