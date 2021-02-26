package typingsSlinky.actionsOnGoogle

import typingsSlinky.actionsOnGoogle.actionssdkActionssdkMod.ActionsSdk_
import typingsSlinky.actionsOnGoogle.basicMod.BasicCardOptions
import typingsSlinky.actionsOnGoogle.browseMod.BrowseCarouselItemOptions
import typingsSlinky.actionsOnGoogle.browseMod.BrowseCarouselOptions
import typingsSlinky.actionsOnGoogle.buttonMod.ButtonOptions
import typingsSlinky.actionsOnGoogle.carouselMod.CarouselOptions
import typingsSlinky.actionsOnGoogle.commonMod.JsonObject
import typingsSlinky.actionsOnGoogle.contextMod.Contexts
import typingsSlinky.actionsOnGoogle.convMod.ActionsSdkConversationOptions
import typingsSlinky.actionsOnGoogle.conversationConversationMod.ConversationOptions
import typingsSlinky.actionsOnGoogle.conversationConversationMod.Intent
import typingsSlinky.actionsOnGoogle.datetimeMod.DateTimeOptions
import typingsSlinky.actionsOnGoogle.deeplinkMod.DeepLinkOptions
import typingsSlinky.actionsOnGoogle.dialogflowConvMod.DialogflowConversationOptions
import typingsSlinky.actionsOnGoogle.dialogflowDialogflowMod.Dialogflow_
import typingsSlinky.actionsOnGoogle.helperHelperMod.HelperOptions
import typingsSlinky.actionsOnGoogle.htmlMod.HtmlResponseOptions
import typingsSlinky.actionsOnGoogle.imageMod.ImageOptions
import typingsSlinky.actionsOnGoogle.linkoutMod.LinkOutSuggestionOptions
import typingsSlinky.actionsOnGoogle.listMod.ListOptions
import typingsSlinky.actionsOnGoogle.newsurfaceMod.NewSurfaceOptions
import typingsSlinky.actionsOnGoogle.permissionPermissionMod.PermissionOptions
import typingsSlinky.actionsOnGoogle.placeMod.PlaceOptions
import typingsSlinky.actionsOnGoogle.registerupdateMod.RegisterUpdateOptions
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObjectOptions
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaObjectString
import typingsSlinky.actionsOnGoogle.responseMediaMod.MediaResponseOptions
import typingsSlinky.actionsOnGoogle.richMod.RichResponseItem
import typingsSlinky.actionsOnGoogle.richMod.RichResponseOptions
import typingsSlinky.actionsOnGoogle.simpleMod.SimpleResponseOptions
import typingsSlinky.actionsOnGoogle.smarthomeSmarthomeMod.SmartHome_
import typingsSlinky.actionsOnGoogle.tableMod.TableOptions
import typingsSlinky.actionsOnGoogle.updateMod.UpdatePermissionOptions
import typingsSlinky.actionsOnGoogle.urlMod.OpenUrlActionOptions
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsOrdersV3OrderUpdate
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3CompletePurchaseValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3DigitalPurchaseCheckSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionDecisionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsTransactionsV3TransactionRequirementsCheckSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2DeliveryAddressValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2OrdersOrderUpdate
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionDecisionValueSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2TransactionRequirementsCheckSpec
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsHtmlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("actions-on-google", "ActionsSdkConversation")
  @js.native
  /** @public */
  class ActionsSdkConversation[TConvData, TUserStorage] ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.ActionsSdkConversation[TConvData, TUserStorage] {
    def this(options: ActionsSdkConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "BasicCard")
  @js.native
  class BasicCard protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.BasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  @JSImport("actions-on-google", "BrowseCarousel")
  @js.native
  class BrowseCarousel protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.BrowseCarousel {
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
  
  @JSImport("actions-on-google", "BrowseCarouselItem")
  @js.native
  class BrowseCarouselItem protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.BrowseCarouselItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  @JSImport("actions-on-google", "Button")
  @js.native
  class Button protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Button {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @JSImport("actions-on-google", "Carousel")
  @js.native
  class Carousel protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google", "CompletePurchase")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3CompletePurchaseValueSpec}
    * @public
    */
  class CompletePurchase ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.CompletePurchase {
    def this(options: GoogleActionsTransactionsV3CompletePurchaseValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "Confirmation")
  @js.native
  class Confirmation protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Confirmation {
    /**
      * @param text The confirmation prompt presented to the user to
      *     query for an affirmative or negative response.
      * @public
      */
    def this(text: String) = this()
  }
  
  @JSImport("actions-on-google", "Conversation")
  @js.native
  /** @hidden */
  class Conversation[TUserStorage] ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Conversation[TUserStorage] {
    def this(options: ConversationOptions[TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DateTime")
  @js.native
  class DateTime protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.DateTime {
    /**
      * @param options DateTime options
      * @public
      */
    def this(options: DateTimeOptions) = this()
  }
  
  @JSImport("actions-on-google", "DeepLink")
  @js.native
  class DeepLink protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.DeepLink {
    /**
      * @param options DeepLink options
      * @deprecated
      * @public
      */
    def this(options: DeepLinkOptions) = this()
  }
  
  @JSImport("actions-on-google", "DeliveryAddress")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2DeliveryAddressValueSpec}
    * @public
    */
  class DeliveryAddress ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.DeliveryAddress {
    def this(options: GoogleActionsV2DeliveryAddressValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "DialogflowConversation")
  @js.native
  /** @public */
  class DialogflowConversation[TConvData, TUserStorage, TContexts /* <: Contexts */] ()
    extends typingsSlinky.actionsOnGoogle.dialogflowMod.DialogflowConversation[TConvData, TUserStorage, TContexts] {
    def this(options: DialogflowConversationOptions[TConvData, TUserStorage]) = this()
  }
  
  @JSImport("actions-on-google", "DigitalPurchaseCheck")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsTransactionsV3DigitalPurchaseCheckSpec}
    * @public
    */
  class DigitalPurchaseCheck ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.DigitalPurchaseCheck {
    def this(options: GoogleActionsTransactionsV3DigitalPurchaseCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "Helper")
  @js.native
  class Helper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Helper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  class HtmlResponse[TData /* <: JsonObject */] ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.HtmlResponse[TData] {
    def this(options: HtmlResponseOptions[TData]) = this()
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
  }
  
  @JSImport("actions-on-google", "Image")
  @js.native
  class Image protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Image {
    /**
      * @param options Image options
      * @public
      */
    def this(option: ImageOptions) = this()
  }
  
  @JSImport("actions-on-google", "LinkOutSuggestion")
  @js.native
  class LinkOutSuggestion protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.LinkOutSuggestion {
    /**
      * @param options LinkOutSuggestion options
      * @public
      */
    def this(options: LinkOutSuggestionOptions) = this()
  }
  
  @JSImport("actions-on-google", "List")
  @js.native
  class List protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaObject")
  @js.native
  class MediaObject protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.MediaObject {
    def this(options: String) = this()
    /**
      * @param options MediaObject options or just a string for the url
      * @public
      */
    def this(options: MediaObjectOptions) = this()
  }
  
  @JSImport("actions-on-google", "MediaResponse")
  @js.native
  class MediaResponse protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.MediaResponse {
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
  
  @JSImport("actions-on-google", "NewSurface")
  @js.native
  class NewSurface protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.NewSurface {
    /**
      * @param options NewSurface options
      * @public
      */
    def this(options: NewSurfaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "OpenUrlAction")
  @js.native
  class OpenUrlAction protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.OpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  @JSImport("actions-on-google", "OrderUpdate")
  @js.native
  class OrderUpdate protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.OrderUpdate {
    def this(options: GoogleActionsOrdersV3OrderUpdate) = this()
    /**
      * @param options The raw {@link GoogleActionsV2OrdersOrderUpdate}
      *     or {@link GoogleActionsOrdersV3OrderUpdate}
      *     if using ordersv3
      * @public
      */
    def this(options: GoogleActionsV2OrdersOrderUpdate) = this()
  }
  
  @JSImport("actions-on-google", "Permission")
  @js.native
  class Permission protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Permission {
    /**
      * @param options Permission options
      * @public
      */
    def this(options: PermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "Place")
  @js.native
  class Place protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Place {
    /**
      * @param options Place options
      * @public
      */
    def this(options: PlaceOptions) = this()
  }
  
  @JSImport("actions-on-google", "RegisterUpdate")
  @js.native
  class RegisterUpdate protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.RegisterUpdate {
    /**
      * @param options RegisterUpdate options
      * @public
      */
    def this(options: RegisterUpdateOptions) = this()
  }
  
  @JSImport("actions-on-google", "RichResponse")
  @js.native
  class RichResponse protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.RichResponse {
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
  
  @JSImport("actions-on-google", "SignIn")
  @js.native
  /**
    * @param context The optional context why the app needs to ask the user to sign in, as a
    *     prefix of a prompt for user consent, e.g. "To track your exercise", or
    *     "To check your account balance".
    * @public
    */
  class SignIn ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.SignIn {
    def this(context: String) = this()
  }
  
  @JSImport("actions-on-google", "SimpleResponse")
  @js.native
  class SimpleResponse protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.SimpleResponse {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  @JSImport("actions-on-google", "SoloHelper")
  @js.native
  class SoloHelper[TIntent /* <: Intent */, TValueSpec] protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.SoloHelper[TIntent, TValueSpec] {
    def this(options: HelperOptions[TIntent, TValueSpec]) = this()
  }
  
  @JSImport("actions-on-google", "Suggestions")
  @js.native
  class Suggestions protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Suggestions {
    /**
      * @param suggestions Texts of the suggestions.
      * @public
      */
    def this(suggestions: (js.Array[String] | String)*) = this()
  }
  
  @JSImport("actions-on-google", "Table")
  @js.native
  class Table protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.Table {
    /** @public */
    def this(options: TableOptions) = this()
  }
  
  @JSImport("actions-on-google", "TransactionDecision")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionDecisionValueSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionDecisionValueSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionDecision ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.TransactionDecision {
    def this(options: GoogleActionsTransactionsV3TransactionDecisionValueSpec) = this()
    def this(options: GoogleActionsV2TransactionDecisionValueSpec) = this()
  }
  
  @JSImport("actions-on-google", "TransactionRequirements")
  @js.native
  /**
    * @param options The raw {@link GoogleActionsV2TransactionRequirementsCheckSpec}
    *     or {@link GoogleActionsTransactionsV3TransactionRequirementsCheckSpec}
    *     if using ordersv3
    * @public
    */
  class TransactionRequirements ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.TransactionRequirements {
    def this(options: GoogleActionsTransactionsV3TransactionRequirementsCheckSpec) = this()
    def this(options: GoogleActionsV2TransactionRequirementsCheckSpec) = this()
  }
  
  @JSImport("actions-on-google", "UnauthorizedError")
  @js.native
  class UnauthorizedError ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.UnauthorizedError
  
  @JSImport("actions-on-google", "UpdatePermission")
  @js.native
  class UpdatePermission protected ()
    extends typingsSlinky.actionsOnGoogle.actionssdkMod.UpdatePermission {
    /**
      * @param options UpdatePermission options
      * @public
      */
    def this(options: UpdatePermissionOptions) = this()
  }
  
  @JSImport("actions-on-google", "actionssdk")
  @js.native
  val actionssdk: ActionsSdk_ = js.native
  
  @JSImport("actions-on-google", "dialogflow")
  @js.native
  val dialogflow: Dialogflow_ = js.native
  
  @JSImport("actions-on-google", "smarthome")
  @js.native
  val smarthome: SmartHome_ = js.native
}
