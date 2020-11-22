package typingsSlinky.reactAliceCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAliceCarousel.prevNextButtonMod.Props
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.next
import typingsSlinky.reactAliceCarousel.reactAliceCarouselStrings.prev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object PrevNextButton {
  
  @JSImport("react-alice-carousel/lib/views", "PrevNextButton")
  @js.native
  object component extends js.Object
  
  def withProps(p: Props): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(disabled: Boolean, name: prev | next, onClick: js.Any => Unit): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
