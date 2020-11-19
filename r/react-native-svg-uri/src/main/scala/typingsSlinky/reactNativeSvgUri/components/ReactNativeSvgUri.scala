package typingsSlinky.reactNativeSvgUri.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNative.mod.ImageURISource
import typingsSlinky.reactNativeSvgUri.mod.SvgUriProps
import typingsSlinky.reactNativeSvgUri.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSvgUri {
  
  @JSImport("react-native-svg-uri", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def fill(value: String): this.type = set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double | String): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def source(value: ImageURISource): this.type = set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def svgXmlData(value: String): this.type = set("svgXmlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: Double | String): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SvgUriProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeSvgUri.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
