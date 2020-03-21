package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.carouselMod.CarouselOptions
import typingsSlinky.actionsOnGoogle.listMod.ListOptions
import typingsSlinky.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItem
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", JSImport.Namespace)
@js.native
object optionMod extends js.Object {
  @js.native
  class Carousel protected ()
    extends typingsSlinky.actionsOnGoogle.carouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @js.native
  class List protected ()
    extends typingsSlinky.actionsOnGoogle.listMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}

