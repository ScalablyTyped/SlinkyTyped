package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.scaleInChildMod.ScaleInChildProps
import typingsSlinky.materialUi.scaleInChildMod.default
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScaleInChild {
  
  @JSImport("material-ui/internal/ScaleInChild", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxScale(value: Double): this.type = set("maxScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def minScale(value: Double): this.type = set("minScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ScaleInChild.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ScaleInChildProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
