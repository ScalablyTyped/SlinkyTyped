package typingsSlinky.reactCustomScroll.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCustomScroll.mod.CustomScrollProps
import typingsSlinky.reactCustomScroll.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCustomScroll {
  
  @JSImport("react-custom-scroll", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def addScrolledClass(value: Boolean): this.type = set("addScrolledClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def allowOuterScroll(value: Boolean): this.type = set("allowOuterScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def flex(value: Double | String): this.type = set("flex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def freezePosition(value: Boolean): this.type = set("freezePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def heightRelativeToParent(value: String): this.type = set("heightRelativeToParent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def keepAtBottom(value: Boolean): this.type = set("keepAtBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minScrollHandleHeight(value: Double): this.type = set("minScrollHandleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onScoll(value: /* e */ js.UndefOr[js.Any] => _): this.type = set("onScoll", js.Any.fromFunction1(value))
    
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrollTo(value: Double): this.type = set("scrollTo", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CustomScrollProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactCustomScroll.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
