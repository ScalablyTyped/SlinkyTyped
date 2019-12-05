package typingsSlinky.actionsDashOnDashGoogle

import typingsSlinky.actionsDashOnDashGoogle.distCommonMod.JsonObject
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OrdersOrderUpdate
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationConversationMod._Response
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItemOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardBasicMod.BasicCardOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardButtonMod.ButtonOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardTableMod.TableOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponseOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseImageMod.ImageOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestionOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObjectString
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponseOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseItem
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponseOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponseOptions
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/response", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationResponseMod extends js.Object {
  @js.native
  class BasicCard protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @js.native
  class BrowseCarousel protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarousel {
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
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseBrowseMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @js.native
  class Button protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.Button {
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
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseHtmlMod.HtmlResponse[TData] {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
  }
  
  @js.native
  class Image protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseImageMod.Image
       with _Response {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @js.native
  class LinkOutSuggestion protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseLinkoutMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @js.native
  class MediaObject protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaObject
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
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseMediaMod.MediaResponse {
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
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseUrlMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @js.native
  class OrderUpdate protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseOrderMod.OrderUpdate {
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
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseRichMod.RichResponse
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
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSimpleMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @js.native
  class Suggestions protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseSuggestionMod.Suggestions
       with _Response {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @js.native
  class Table protected ()
    extends typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationResponseCardMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
}

