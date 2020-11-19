package typingsSlinky.reactAriaLive.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LiveAnnouncer {
  
  @JSImport("react-aria-live", "LiveAnnouncer")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.reactAriaLive.mod.LiveAnnouncer] = new Default[tag.type, typingsSlinky.reactAriaLive.mod.LiveAnnouncer](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LiveAnnouncer.type): Default[tag.type, typingsSlinky.reactAriaLive.mod.LiveAnnouncer] = new Default[tag.type, typingsSlinky.reactAriaLive.mod.LiveAnnouncer](js.Array(this.component, js.Dictionary.empty))()
}
