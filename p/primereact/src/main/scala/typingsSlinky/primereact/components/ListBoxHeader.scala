package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Value
import typingsSlinky.primereact.listBoxHeaderMod.ListBoxHeaderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ListBoxHeader {
  
  @JSImport("primereact/components/listbox/ListBoxHeader", "ListBoxHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.listBoxHeaderMod.ListBoxHeader] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def filter(value: String): this.type = set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onFilter(value: /* e */ Value => Unit): this.type = set("onFilter", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: ListBoxHeader.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListBoxHeaderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
