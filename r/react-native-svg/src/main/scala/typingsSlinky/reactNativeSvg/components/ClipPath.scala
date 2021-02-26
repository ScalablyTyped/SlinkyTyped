package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.ClipPathCls
import typingsSlinky.reactNativeSvg.mod.ClipPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClipPath {
  
  @JSImport("react-native-svg", "ClipPath")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ClipPathCls] {
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ClipPath.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ClipPathProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
