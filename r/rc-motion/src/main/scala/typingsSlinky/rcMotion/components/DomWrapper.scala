package typingsSlinky.rcMotion.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.rcMotion.domWrapperMod.DomWrapperProps
import typingsSlinky.rcMotion.domWrapperMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DomWrapper {
  
  @JSImport("rc-motion/es/DomWrapper", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DomWrapper.type): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DomWrapperProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
