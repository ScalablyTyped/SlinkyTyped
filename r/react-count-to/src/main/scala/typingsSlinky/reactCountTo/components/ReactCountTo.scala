package typingsSlinky.reactCountTo.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCountTo.mod.Props
import typingsSlinky.reactCountTo.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactCountTo {
  
  @scala.inline
  def apply(speed: Double, to: Double): Builder = {
    val __props = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-count-to", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def children(value: /* value */ Double => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def digits(value: Double): this.type = set("digits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def easing(value: /* progress */ Double => Double): this.type = set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def from(value: Double): this.type = set("from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onComplete(value: () => Unit): this.type = set("onComplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def tagName(value: String): this.type = set("tagName", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
