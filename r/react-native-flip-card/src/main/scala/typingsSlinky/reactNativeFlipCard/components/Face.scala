package typingsSlinky.reactNativeFlipCard.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactNativeFlipCard.mod.FaceProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Face {
  
  @scala.inline
  def apply(chilren: js.Array[ReactElement]): Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Face] = {
    val __props = js.Dynamic.literal(chilren = chilren.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Face](js.Array(this.component, __props.asInstanceOf[FaceProps]))
  }
  
  @JSImport("react-native-flip-card", "Face")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: FaceProps): Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Face] = new Default[tag.type, typingsSlinky.reactNativeFlipCard.mod.Face](js.Array(this.component, p.asInstanceOf[js.Any]))
}
