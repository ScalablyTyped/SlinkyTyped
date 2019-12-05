package typingsSlinky.reactDashNativeDashSnapDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashNativeDashSnapDashCarouselMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.react.reactMod.Props
  import typingsSlinky.reactDashNative.reactDashNativeMod.ScrollViewProps

  type Carousel[T] = ReactComponentClass[CarouselProperties[T]]
  type CarouselProperties[T] = ScrollViewProps with CarouselProps[T] with Props[CarouselStatic[T]]
  type PaginationProperties = PaginationProps with Props[ReactComponentClass[PaginationProps]]
  type PaginationStatic = ReactComponentClass[PaginationProps]
  type ParallaxImageProperties = ParallaxImageProps with Props[ReactComponentClass[ParallaxImageProps]]
  type ParallaxImageStatic = ReactComponentClass[ParallaxImageProps]
}
