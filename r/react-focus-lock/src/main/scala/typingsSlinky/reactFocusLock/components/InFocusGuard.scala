package typingsSlinky.reactFocusLock.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFocusLock.interfacesMod.InFocusGuardProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InFocusGuard {
  
  @JSImport("react-focus-lock", "InFocusGuard")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InFocusGuard.type): Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard] = new Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InFocusGuardProps): Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard] = new Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard](js.Array(this.component, p.asInstanceOf[js.Any]))
}
