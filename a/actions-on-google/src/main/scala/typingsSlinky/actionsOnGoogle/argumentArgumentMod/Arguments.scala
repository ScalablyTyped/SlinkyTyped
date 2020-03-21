package typingsSlinky.actionsOnGoogle.argumentArgumentMod

import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.COMPLETE_PURCHASE_VALUE
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.CONFIRMATION
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.DATETIME
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_VALUE
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.DIGITAL_PURCHASE_CHECK_RESULT
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.IS_FINAL_REPROMPT
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.LINK
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.MEDIA_STATUS
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.NEW_SURFACE
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.OPTION
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.PERMISSION
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.PLACE
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.REGISTER_UPDATE
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.REPROMPT_COUNT
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.SIGN_IN
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_DECISION_VALUE
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_REQUIREMENTS_CHECK_RESULT
import typingsSlinky.actionsOnGoogle.actionsOnGoogleStrings.UPDATES_USER_ID
import typingsSlinky.actionsOnGoogle.completepurchaseMod.CompletePurchaseArgument
import typingsSlinky.actionsOnGoogle.confirmationMod.ConfirmationArgument
import typingsSlinky.actionsOnGoogle.datetimeMod.DateTimeArgument
import typingsSlinky.actionsOnGoogle.decisionMod.TransactionDecisionArgument
import typingsSlinky.actionsOnGoogle.deeplinkMod.DeepLinkArgument
import typingsSlinky.actionsOnGoogle.deliveryaddressMod.DeliveryAddressArgument
import typingsSlinky.actionsOnGoogle.digitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typingsSlinky.actionsOnGoogle.mediaMod.MediaStatusArgument
import typingsSlinky.actionsOnGoogle.newsurfaceMod.NewSurfaceArgument
import typingsSlinky.actionsOnGoogle.noinputMod.FinalRepromptArgument
import typingsSlinky.actionsOnGoogle.noinputMod.RepromptArgument
import typingsSlinky.actionsOnGoogle.optionOptionMod.OptionArgument
import typingsSlinky.actionsOnGoogle.permissionPermissionMod.PermissionArgument
import typingsSlinky.actionsOnGoogle.placeMod.PlaceArgument
import typingsSlinky.actionsOnGoogle.registerupdateMod.RegisterUpdateArgument
import typingsSlinky.actionsOnGoogle.requirementsMod.TransactionRequirementsArgument
import typingsSlinky.actionsOnGoogle.signinMod.SignInArgument
import typingsSlinky.actionsOnGoogle.updateMod.UpdatePermissionUserIdArgument
import typingsSlinky.actionsOnGoogle.v2Mod.GoogleActionsV2Argument
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Arguments")
@js.native
/** @hidden */
class Arguments () extends js.Object {
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  /** @public */
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[GoogleActionsV2Argument]] = js.native
  /** @public */
  var parsed: Parsed = js.native
  /** @public */
  var raw: Raw = js.native
  /** @public */
  var status: Status = js.native
  /** @public */
  def get(name: String): Argument = js.native
  @JSName("get")
  def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): CompletePurchaseArgument = js.native
  @JSName("get")
  def get_CONFIRMATION(name: CONFIRMATION): ConfirmationArgument = js.native
  @JSName("get")
  def get_DATETIME(name: DATETIME): DateTimeArgument = js.native
  @JSName("get")
  def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): DeliveryAddressArgument = js.native
  @JSName("get")
  def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): DigitalPurchaseCheckArgument = js.native
  @JSName("get")
  def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): FinalRepromptArgument = js.native
  @JSName("get")
  def get_LINK(name: LINK): DeepLinkArgument = js.native
  @JSName("get")
  def get_MEDIASTATUS(name: MEDIA_STATUS): MediaStatusArgument = js.native
  @JSName("get")
  def get_NEWSURFACE(name: NEW_SURFACE): NewSurfaceArgument = js.native
  @JSName("get")
  def get_OPTION(name: OPTION): OptionArgument = js.native
  /**
    * Get the argument value by name from the current intent.
    * The first property value not named `name` or `status` will be returned.
    * Will retrieve `textValue` last.
    * If there is no other properties, return undefined.
    *
    * @example
    * ```javascript
    *
    * // Actions SDK
    * app.intent('actions.intent.PERMISSION', conv => {
    *   const granted = conv.arguments.get('PERMISSION') // boolean true if granted, false if not
    * })
    *
    * // Dialogflow
    * // Create a Dialogflow intent with the `actions_intent_PERMISSION` event
    * app.intent('Get Permission', conv => {
    *   const granted = conv.arguments.get('PERMISSION') // boolean true if granted, false if not
    * })
    * ```
    *
    * @param argument Name of the argument.
    * @return First property not named 'name' or 'status' with 'textValue' given last priority
    *     or undefined if no other properties.
    *
    * @public
    */
  @JSName("get")
  def get_PERMISSION(name: PERMISSION): PermissionArgument = js.native
  @JSName("get")
  def get_PLACE(name: PLACE): PlaceArgument = js.native
  @JSName("get")
  def get_REGISTERUPDATE(name: REGISTER_UPDATE): RegisterUpdateArgument = js.native
  @JSName("get")
  def get_REPROMPTCOUNT(name: REPROMPT_COUNT): RepromptArgument = js.native
  @JSName("get")
  def get_SIGNIN(name: SIGN_IN): SignInArgument = js.native
  @JSName("get")
  def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): TransactionDecisionArgument = js.native
  @JSName("get")
  def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): TransactionRequirementsArgument = js.native
  @JSName("get")
  def get_UPDATESUSERID(name: UPDATES_USER_ID): UpdatePermissionUserIdArgument = js.native
}

