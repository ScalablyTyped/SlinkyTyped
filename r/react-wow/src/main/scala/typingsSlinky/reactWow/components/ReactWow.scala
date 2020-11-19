package typingsSlinky.reactWow.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactWow.mod.ReactWOWProps
import typingsSlinky.reactWow.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactWow {
  
  @JSImport("react-wow", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def animateClass(value: String): this.type = set("animateClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def callback(value: () => Unit): this.type = set("callback", js.Any.fromFunction0(value))
    
    @scala.inline
    def delay(value: String): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def duration(value: String): this.type = set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def iteration(value: String): this.type = set("iteration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offsetVarargs(value: Double*): this.type = set("offset", js.Array(value :_*))
    
    @scala.inline
    def offset(value: Double | js.Array[Double]): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overflow(value: Boolean): this.type = set("overflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resize(value: Boolean): this.type = set("resize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scroll(value: Boolean): this.type = set("scroll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactWOWProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(
    animation: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 76 */ js.Any,
    children: ReactElement
  ): Builder = {
    val __props = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactWOWProps]))
  }
}
