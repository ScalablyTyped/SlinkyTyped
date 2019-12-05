package typingsSlinky.reactDashNativeDashSnapDashCarousel.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSnapDashCarousel.reactDashNativeDashSnapDashCarouselMod.ParallaxImageProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashSnapDashCarousel), Name(reactDashNativeDashSnapDashCarouselMod), Name(ParallaxImageProperties))) was not a @ScalaJSDefined trait */
object ParallaxImage
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashSnapDashCarousel.reactDashNativeDashSnapDashCarouselMod.ParallaxImage
    ] {
  @JSImport("react-native-snap-carousel", "ParallaxImage")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = ParallaxImageProperties
}

