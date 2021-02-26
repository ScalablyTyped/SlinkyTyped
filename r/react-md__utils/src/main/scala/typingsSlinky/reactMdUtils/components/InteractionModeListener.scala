package typingsSlinky.reactMdUtils.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactMdUtils.interactionModeMod.InteractionModeListenerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InteractionModeListener {
  
  @JSImport("@react-md/utils", "InteractionModeListener")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: InteractionModeListener.type): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InteractionModeListenerProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
