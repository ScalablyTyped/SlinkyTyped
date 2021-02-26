package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.carouselMod.CarouselOptions
import typingsSlinky.actionsOnGoogle.listMod.ListOptions
import typingsSlinky.actionsOnGoogle.optionOptionMod.ApiOptionItem
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItem
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "Carousel")
  @js.native
  class Carousel protected ()
    extends typingsSlinky.actionsOnGoogle.carouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "List")
  @js.native
  class List protected ()
    extends typingsSlinky.actionsOnGoogle.listMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "convert")
  @js.native
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}
