package typingsSlinky.reactNativeSnapCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Carousel[T] = slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.CarouselProperties[T]]
  type CarouselProperties[T] = typingsSlinky.reactNative.mod.ScrollViewProps with typingsSlinky.reactNativeSnapCarousel.mod.CarouselProps[T] with typingsSlinky.react.mod.Props[typingsSlinky.reactNativeSnapCarousel.mod.CarouselStatic[T]]
  type PaginationProperties = typingsSlinky.reactNativeSnapCarousel.mod.PaginationProps with (typingsSlinky.react.mod.Props[
    slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.PaginationProps]
  ])
  type PaginationStatic = slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.PaginationProps]
  type ParallaxImageProperties = typingsSlinky.reactNativeSnapCarousel.mod.ParallaxImageProps with (typingsSlinky.react.mod.Props[
    slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.ParallaxImageProps]
  ])
  type ParallaxImageStatic = slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.ParallaxImageProps]
}
