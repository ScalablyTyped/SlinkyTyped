package typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentArgumentMod

import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.COMPLETE_PURCHASE_VALUE
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.CONFIRMATION
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DATETIME
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DELIVERY_ADDRESS_VALUE
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.DIGITAL_PURCHASE_CHECK_RESULT
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.IS_FINAL_REPROMPT
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.LINK
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.MEDIA_STATUS
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.NEW_SURFACE
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.OPTION
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PERMISSION
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.PLACE
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.REGISTER_UPDATE
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.REPROMPT_COUNT
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.SIGN_IN
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.TRANSACTION_DECISION_VALUE
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.TRANSACTION_REQUIREMENTS_CHECK_RESULT
import typingsSlinky.actionsDashOnDashGoogle.actionsDashOnDashGoogleStrings.UPDATES_USER_ID
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Argument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentMediaMod.MediaStatusArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentNoinputMod.FinalRepromptArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationArgumentNoinputMod.RepromptArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperConfirmationMod.ConfirmationArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDatetimeMod.DateTimeArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperDeeplinkMod.DeepLinkArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperNewsurfaceMod.NewSurfaceArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionPermissionMod.PermissionArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPermissionUpdateMod.UpdatePermissionUserIdArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperPlaceMod.PlaceArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperRegisterupdateMod.RegisterUpdateArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperSigninMod.SignInArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionCompletepurchaseMod.CompletePurchaseArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDecisionMod.TransactionDecisionArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDeliveryaddressMod.DeliveryAddressArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionDigitalpurchasecheckMod.DigitalPurchaseCheckArgument
import typingsSlinky.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperTransactionRequirementsMod.TransactionRequirementsArgument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Parsed")
@js.native
class Parsed protected () extends js.Object {
  /** @hidden */
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  /** @public */
  var input: ArgumentsParsed = js.native
  /** @public */
  var list: js.Array[Argument] = js.native
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
  /** @public */
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

