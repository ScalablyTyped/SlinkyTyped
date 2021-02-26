package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.Color
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.StopCls
import typingsSlinky.reactNativeSvg.mod.StopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stop {
  
  @JSImport("react-native-svg", "Stop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, StopCls] {
    
    @scala.inline
    def offset(value: NumberProp): this.type = set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopColor(value: Color): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopColorVarargs(value: Double*): this.type = set("stopColor", js.Array(value :_*))
    
    @scala.inline
    def stopOpacity(value: NumberProp): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stop.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
