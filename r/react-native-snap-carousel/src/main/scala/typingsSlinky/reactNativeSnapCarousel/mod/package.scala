package typingsSlinky.reactNativeSnapCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CarouselProperties[T] = typingsSlinky.reactNative.mod.ScrollViewProps with typingsSlinky.reactNative.mod.FlatListProps[T] with typingsSlinky.reactNativeSnapCarousel.mod.CarouselProps[T]
  type PaginationProperties = typingsSlinky.reactNativeSnapCarousel.mod.PaginationProps with (typingsSlinky.react.mod.Props[
    slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.PaginationProps]
  ])
  type PaginationStatic = slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.PaginationProps]
  type ParallaxImageProperties = typingsSlinky.reactNativeSnapCarousel.mod.ParallaxImageProps with (typingsSlinky.react.mod.Props[
    slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.ParallaxImageProps]
  ])
  type ParallaxImageStatic = slinky.core.ReactComponentClass[typingsSlinky.reactNativeSnapCarousel.mod.ParallaxImageProps]
}
