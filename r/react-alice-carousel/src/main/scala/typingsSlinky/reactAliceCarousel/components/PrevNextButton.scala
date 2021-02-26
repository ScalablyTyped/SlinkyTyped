package typingsSlinky.reactAliceCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAliceCarousel.prevNextButtonMod.Props
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.next
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.prev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrevNextButton {
  
  @scala.inline
  def apply(disabled: Boolean, name: prev | next, onClick: js.Any => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-alice-carousel/lib/views", "PrevNextButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
