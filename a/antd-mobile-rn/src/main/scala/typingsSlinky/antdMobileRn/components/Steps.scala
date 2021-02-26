package typingsSlinky.antdMobileRn.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.horizontal
import typingsSlinky.antdMobileRn.antdMobileRnStrings.vertical
import typingsSlinky.antdMobileRn.stepsIndexNativeMod.StepsNativeProps
import typingsSlinky.antdMobileRn.stepsStyleIndexNativeMod.IStepsStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Steps {
  
  @scala.inline
  def apply(children: js.Array[ReactElement]): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StepsNativeProps]))
  }
  
  @JSImport("antd-mobile-rn", "Steps")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Steps] {
    
    @scala.inline
    def current(value: Double): this.type = set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: vertical | horizontal): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def finishIcon(value: String): this.type = set("finishIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: String): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def styles(value: IStepsStyle): this.type = set("styles", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StepsNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
