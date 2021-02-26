package typingsSlinky.reactStickynode.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactStickynode.mod.Props
import typingsSlinky.reactStickynode.mod.Status
import typingsSlinky.reactStickynode.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactStickynode {
  
  @JSImport("react-stickynode", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def activeClass(value: String): this.type = set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bottomBoundary(value: Double | String): this.type = set("bottomBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def children(value: ReactElement | (js.Function1[/* status */ Status, ReactElement])): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenFunction1(value: /* status */ Status => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enableTransforms(value: Boolean): this.type = set("enableTransforms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enabled(value: Boolean): this.type = set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerClass(value: String): this.type = set("innerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def innerZ(value: Double | String): this.type = set("innerZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onStateChange(value: /* status */ Status => Unit): this.type = set("onStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def releasedClass(value: String): this.type = set("releasedClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shouldFreeze(value: () => Boolean): this.type = set("shouldFreeze", js.Any.fromFunction0(value))
    
    @scala.inline
    def top(value: Double | String): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactStickynode.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
