package typingsSlinky.nukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Carousel = slinky.core.ReactComponentClass[typingsSlinky.nukaCarousel.mod.CarouselProps]
  
  type CarouselRenderControl = js.Function1[
    /* props */ typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps, 
    slinky.core.facade.ReactElement
  ]
  
  type CarouselSlideWidthProp = java.lang.String | scala.Double
  
  type CarouselSlidesToScrollProp = scala.Double | typingsSlinky.nukaCarousel.nukaCarouselStrings.auto
  
  type NextButtonProps = typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps
  
  type PagingDotsProps = typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps
  
  type PreviousButtonProps = typingsSlinky.nukaCarousel.mod.CarouselSlideRenderControlProps
}
