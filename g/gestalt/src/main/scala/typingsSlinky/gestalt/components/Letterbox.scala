package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.gestalt.mod.LetterboxProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Letterbox {
  
  @scala.inline
  def apply(contentAspectRatio: Double, height: Double, width: Double): Default[tag.type, typingsSlinky.gestalt.mod.Letterbox] = {
    val __props = js.Dynamic.literal(contentAspectRatio = contentAspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.gestalt.mod.Letterbox](js.Array(this.component, __props.asInstanceOf[LetterboxProps]))
  }
  
  @JSImport("gestalt", "Letterbox")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LetterboxProps): Default[tag.type, typingsSlinky.gestalt.mod.Letterbox] = new Default[tag.type, typingsSlinky.gestalt.mod.Letterbox](js.Array(this.component, p.asInstanceOf[js.Any]))
}
