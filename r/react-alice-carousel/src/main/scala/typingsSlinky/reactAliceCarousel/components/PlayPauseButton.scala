package typingsSlinky.reactAliceCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAliceCarousel.playPauseButtonMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PlayPauseButton {
  
  @scala.inline
  def apply(isPlaying: Boolean, onClick: js.Any => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(isPlaying = isPlaying.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "PlayPauseButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
