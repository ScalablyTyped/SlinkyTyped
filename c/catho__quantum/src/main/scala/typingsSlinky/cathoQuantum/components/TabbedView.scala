package typingsSlinky.cathoQuantum.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.cathoQuantum.anon.ComponentsSpacing
import typingsSlinky.cathoQuantum.cathoQuantumStrings.neutral
import typingsSlinky.cathoQuantum.cathoQuantumStrings.primary
import typingsSlinky.cathoQuantum.tabbedViewMod.TabbedViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabbedView {
  
  @JSImport("@catho/quantum/TabbedView", "TabbedView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.cathoQuantum.tabbedViewMod.TabbedView] {
    
    @scala.inline
    def activeTab(value: String): this.type = set("activeTab", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def fluid(value: Boolean): this.type = set("fluid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: () => Unit): this.type = set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def skin(value: neutral | primary): this.type = set("skin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: ComponentsSpacing): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TabbedView.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TabbedViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
