package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.basicMod.BasicCardOptions
import typingsSlinky.actionsOnGoogle.browseMod.BrowseCarouselItemOptions
import typingsSlinky.actionsOnGoogle.browseMod.BrowseCarouselOptions
import typingsSlinky.actionsOnGoogle.buttonMod.ButtonOptions
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.conversationConversationMod._Response
import typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typingsSlinky.actionsOnGoogle.imageMod.ImageOptions
import typingsSlinky.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObjectString
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import typingsSlinky.actionsOnGoogle.richMod.RichResponseItem
import typingsSlinky.actionsOnGoogle.richMod.RichResponseOptions
import typingsSlinky.actionsOnGoogle.simpleMod.SimpleResponseOptions
import typingsSlinky.actionsOnGoogle.tableMod.TableOptions
import typingsSlinky.actionsOnGoogle.urlMod.OpenUrlActionOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response", JSImport.Namespace)
@js.native
object responseMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typingsSlinky.actionsOnGoogle.cardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class BrowseCarousel protected ()
    extends typingsSlinky.actionsOnGoogle.browseMod.BrowseCarousel {
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: GoogleActionsV2UiElementsCarouselBrowseItem*) = this()
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]) = this()
    /**
      * @param options BrowseCarousel options
      * @public
      */
    def this(options: BrowseCarouselOptions) = this()
  }
  
  @js.native
  class BrowseCarouselItem protected ()
    extends typingsSlinky.actionsOnGoogle.browseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsSlinky.actionsOnGoogle.cardMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  class HtmlResponse[TData /* <: JsonObject */] ()
    extends typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponse[TData] {
    def this(options: HtmlResponseOptions[TData]) = this()
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  }
  
  @js.native
  class Image protected ()
    extends typingsSlinky.actionsOnGoogle.imageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @js.native
  class LinkOutSuggestion protected ()
    extends typingsSlinky.actionsOnGoogle.linkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @js.native
  class MediaObject protected ()
    extends typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObject
       with _Response {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @js.native
  class MediaResponse protected ()
    extends typingsSlinky.actionsOnGoogle.responseMediaMod.MediaResponse {
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: MediaObjectString*) = this()
    /**
      * @param objects MediaObjects
      * @public
      */
    def this(objects: js.Array[MediaObjectString]) = this()
    /**
      * @param options MediaResponse options
      * @public
      */
    def this(options: MediaResponseOptions) = this()
  }
  
  @js.native
  class OpenUrlAction protected ()
    extends typingsSlinky.actionsOnGoogle.urlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @js.native
  class OrderUpdate protected ()
    extends typingsSlinky.actionsOnGoogle.orderMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @js.native
  class RichResponse protected ()
    extends typingsSlinky.actionsOnGoogle.richMod.RichResponse
       with _Response {
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: RichResponseItem*) = this()
    /**
      * @param items RichResponse items
      * @public
      */
    def this(items: js.Array[RichResponseItem]) = this()
    /**
      * @param options RichResponse options
      * @public
      */
    def this(options: RichResponseOptions) = this()
  }
  
  @js.native
  class SimpleResponse protected ()
    extends typingsSlinky.actionsOnGoogle.simpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @js.native
  class Suggestions protected ()
    extends typingsSlinky.actionsOnGoogle.suggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @js.native
  class Table protected ()
    extends typingsSlinky.actionsOnGoogle.cardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

