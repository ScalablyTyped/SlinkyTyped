package typingsSlinky.protonNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.protonNative.anon.H
import typingsSlinky.protonNative.anon.X
import typingsSlinky.protonNative.mod.TabProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tab {
  
  @JSImport("proton-native", "Tab")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.protonNative.mod.Tab] {
    
    @scala.inline
    def align(value: H): this.type = set("align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def column(value: Double): this.type = set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def expand(value: H): this.type = set("expand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def row(value: Double): this.type = set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def span(value: X): this.type = set("span", value.asInstanceOf[js.Any])
    
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
