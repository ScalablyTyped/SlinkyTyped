package typingsSlinky.actionsDashOnDashGoogle

import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.ApiOptionItem
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperOptionMod extends js.Object {
  @js.native
  class Carousel protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @js.native
  class List protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionListMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}

