package typingsSlinky.reactDashOwlDashCarousel.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashOwlDashCarousel.reactDashOwlDashCarouselMod.OwlCarouselProps
import typingsSlinky.reactDashOwlDashCarousel.reactDashOwlDashCarouselMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashOwlDashCarousel), Name(reactDashOwlDashCarouselMod), Name(OwlCarouselProps))) was not a @ScalaJSDefined trait */
object ReactDashOwlDashCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("react-owl-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = OwlCarouselProps
}

