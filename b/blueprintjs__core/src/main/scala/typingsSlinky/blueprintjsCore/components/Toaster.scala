package typingsSlinky.blueprintjsCore.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.toasterMod.IToasterProps
import typingsSlinky.blueprintjsCore.toasterMod.ToasterPosition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Toaster {
  
  @JSImport("@blueprintjs/core", "Toaster")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Toaster] {
    
    @scala.inline
    def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def canEscapeKeyClear(value: Boolean): this.type = set("canEscapeKeyClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def maxToasts(value: Double): this.type = set("maxToasts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def position(value: ToasterPosition): this.type = set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def usePortal(value: Boolean): this.type = set("usePortal", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Toaster.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: IToasterProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
