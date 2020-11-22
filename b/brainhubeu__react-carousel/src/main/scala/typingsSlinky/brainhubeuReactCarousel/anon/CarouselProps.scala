package typingsSlinky.brainhubeuReactCarousel.anon

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselProps extends js.Object {
  
  var carouselProps: typingsSlinky.brainhubeuReactCarousel.mod.CarouselProps = js.native
  
  var options: js.UndefOr[js.Any] = js.native
  
  var refs: Record[String, ReactRef[HTMLElement]] = js.native
}
object CarouselProps {
  
  @scala.inline
  def apply(
    carouselProps: typingsSlinky.brainhubeuReactCarousel.mod.CarouselProps,
    refs: Record[String, ReactRef[HTMLElement]]
  ): CarouselProps = {
    val __obj = js.Dynamic.literal(carouselProps = carouselProps.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any])
    __obj.asInstanceOf[CarouselProps]
  }
  
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCarouselProps(value: typingsSlinky.brainhubeuReactCarousel.mod.CarouselProps): Self = this.set("carouselProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(value: Record[String, ReactRef[HTMLElement]]): Self = this.set("refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
}
