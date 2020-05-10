package typingsSlinky.reactFocusLock.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactFocusLock.interfacesMod.InFocusGuardProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InFocusGuard {
  @JSImport("react-focus-lock", "InFocusGuard")
  @js.native
  object component extends js.Object
  
  def withProps(p: InFocusGuardProps): Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard] = new Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: InFocusGuard.type): Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard] = new Default[tag.type, typingsSlinky.reactFocusLock.mod.InFocusGuard](js.Array(this.component, js.Dictionary.empty))()
}

