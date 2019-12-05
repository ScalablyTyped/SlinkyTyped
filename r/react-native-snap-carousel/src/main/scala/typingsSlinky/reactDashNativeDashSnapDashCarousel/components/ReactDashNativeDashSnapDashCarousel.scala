package typingsSlinky.reactDashNativeDashSnapDashCarousel.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSnapDashCarousel.reactDashNativeDashSnapDashCarouselMod.CarouselProperties
import typingsSlinky.reactDashNativeDashSnapDashCarousel.reactDashNativeDashSnapDashCarouselMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashSnapDashCarousel), Name(reactDashNativeDashSnapDashCarouselMod), Name(CarouselProperties))) was not a @ScalaJSDefined trait */
object ReactDashNativeDashSnapDashCarousel
  extends ExternalComponentWithAttributesWithRefType[tag.type, default[js.Any]] {
  @JSImport("react-native-snap-carousel", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = CarouselProperties[js.Any]
}

