package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.ForeignObjectProps
import typingsSlinky.reactNativeSvg.mod.NumberProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ForeignObject {
  
  @JSImport("react-native-svg", "ForeignObject")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def height(value: NumberProp): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: NumberProp): this.type = set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def x(value: NumberProp): this.type = set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def y(value: NumberProp): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ForeignObjectProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ForeignObject.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
