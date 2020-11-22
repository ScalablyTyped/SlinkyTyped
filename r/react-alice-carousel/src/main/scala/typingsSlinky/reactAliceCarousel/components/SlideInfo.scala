package typingsSlinky.reactAliceCarousel.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactAliceCarousel.anon.SlidesLength
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideInfo {
  
  @JSImport("react-alice-carousel/lib/views", "SlideInfo")
  @js.native
  object component extends js.Object
  
  def withProps(p: SlidesLength): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(activeIndex: js.Any, slidesLength: js.Any): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], slidesLength = slidesLength.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[SlidesLength]))
  }
}
