package typingsSlinky.reactScrollspy.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactScrollspy.mod.ScrollspyProps
import typingsSlinky.reactScrollspy.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactScrollspy {
  
  @scala.inline
  def apply(currentClassName: String, items: js.Array[String]): Builder = {
    val __props = js.Dynamic.literal(currentClassName = currentClassName.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollspyProps]))
  }
  
  @JSImport("react-scrollspy", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentTag(value: String | ReactComponentClass[js.Object]): this.type = set("componentTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentTagComponentClass(value: ReactComponentClass[js.Object]): this.type = set("componentTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def componentTagFunctionComponent(value: ReactComponentClass[js.Object]): this.type = set("componentTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onUpdate(value: /* item */ HTMLElement => Unit): this.type = set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def rootEl(value: String): this.type = set("rootEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def scrolledPastClassName(value: String): this.type = set("scrolledPastClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollspyProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
