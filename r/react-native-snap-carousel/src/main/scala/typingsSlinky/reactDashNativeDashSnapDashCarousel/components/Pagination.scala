package typingsSlinky.reactDashNativeDashSnapDashCarousel.components

import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashNativeDashSnapDashCarousel.reactDashNativeDashSnapDashCarouselMod.PaginationProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(reactDashNativeDashSnapDashCarousel), Name(reactDashNativeDashSnapDashCarouselMod), Name(PaginationProperties))) was not a @ScalaJSDefined trait */
object Pagination
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashNativeDashSnapDashCarousel.reactDashNativeDashSnapDashCarouselMod.Pagination
    ] {
  @JSImport("react-native-snap-carousel", "Pagination")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  type Props = PaginationProperties
}

