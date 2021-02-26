package typingsSlinky.reactFocusLock.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFocusLock.interfacesMod.FreeFocusProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FreeFocusInside {
  
  @JSImport("react-focus-lock", "FreeFocusInside")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactFocusLock.mod.FreeFocusInside] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FreeFocusInside.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FreeFocusProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
