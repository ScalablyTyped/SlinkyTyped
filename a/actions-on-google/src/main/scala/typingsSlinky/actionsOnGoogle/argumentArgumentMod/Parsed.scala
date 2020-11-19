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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("actions-on-google/dist/service/actionssdk/conversation/argument/argument", "Parsed")
@js.native
class Parsed protected () extends js.Object {
  /** @hidden */
  def this(raw: js.Array[GoogleActionsV2Argument]) = this()
  
  /** @public */
  def get(name: String): Argument = js.native
  @JSName("get")
  def get_COMPLETEPURCHASEVALUE(name: COMPLETE_PURCHASE_VALUE): js.UndefOr[CompletePurchaseArgument] = js.native
  @JSName("get")
  def get_CONFIRMATION(name: CONFIRMATION): js.UndefOr[ConfirmationArgument] = js.native
  @JSName("get")
  def get_DATETIME(name: DATETIME): js.UndefOr[DateTimeArgument] = js.native
  @JSName("get")
  def get_DELIVERYADDRESSVALUE(name: DELIVERY_ADDRESS_VALUE): js.UndefOr[DeliveryAddressArgument] = js.native
  @JSName("get")
  def get_DIGITALPURCHASECHECKRESULT(name: DIGITAL_PURCHASE_CHECK_RESULT): js.UndefOr[DigitalPurchaseCheckArgument] = js.native
  @JSName("get")
  def get_ISFINALREPROMPT(name: IS_FINAL_REPROMPT): js.UndefOr[FinalRepromptArgument] = js.native
  @JSName("get")
  def get_LINK(name: LINK): js.UndefOr[DeepLinkArgument] = js.native
  @JSName("get")
  def get_MEDIASTATUS(name: MEDIA_STATUS): js.UndefOr[MediaStatusArgument] = js.native
  @JSName("get")
  def get_NEWSURFACE(name: NEW_SURFACE): js.UndefOr[NewSurfaceArgument] = js.native
  @JSName("get")
  def get_OPTION(name: OPTION): js.UndefOr[OptionArgument] = js.native
  /** @public */
  @JSName("get")
  def get_PERMISSION(name: PERMISSION): js.UndefOr[PermissionArgument] = js.native
  @JSName("get")
  def get_PLACE(name: PLACE): js.UndefOr[PlaceArgument] = js.native
  @JSName("get")
  def get_REGISTERUPDATE(name: REGISTER_UPDATE): js.UndefOr[RegisterUpdateArgument] = js.native
  @JSName("get")
  def get_REPROMPTCOUNT(name: REPROMPT_COUNT): js.UndefOr[RepromptArgument] = js.native
  @JSName("get")
  def get_SIGNIN(name: SIGN_IN): js.UndefOr[SignInArgument] = js.native
  @JSName("get")
  def get_TRANSACTIONDECISIONVALUE(name: TRANSACTION_DECISION_VALUE): js.UndefOr[TransactionDecisionArgument] = js.native
  @JSName("get")
  def get_TRANSACTIONREQUIREMENTSCHECKRESULT(name: TRANSACTION_REQUIREMENTS_CHECK_RESULT): js.UndefOr[TransactionRequirementsArgument] = js.native
  @JSName("get")
  def get_UPDATESUSERID(name: UPDATES_USER_ID): js.UndefOr[UpdatePermissionUserIdArgument] = js.native
  
  /** @public */
  var input: ArgumentsParsed = js.native
  
  /** @public */
  var list: js.Array[Argument] = js.native
}
