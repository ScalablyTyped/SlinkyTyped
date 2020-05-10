package typingsSlinky.actionsOnGoogle.argumentArgumentMod

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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgumentsNamed extends js.Object {
  /**
    * The complete purchase information.
    * Only use after calling {@link CompletePurchase|conv.ask(new CompletePurchase)}.
    * @public
    */
  var COMPLETE_PURCHASE_VALUE: js.UndefOr[CompletePurchaseArgument] = js.native
  /**
    * The confirmation decision.
    * Use after {@link Confirmation|conv.ask(new Confirmation)}
    * @public
    */
  var CONFIRMATION: js.UndefOr[ConfirmationArgument] = js.native
  /**
    * The user provided date and time.
    * Use after {@link DateTime|conv.ask(new DateTime)}
    * @public
    */
  var DATETIME: js.UndefOr[DateTimeArgument] = js.native
  /**
    * The order delivery address.
    * Only use after calling {@link DeliveryAddress|conv.ask(new DeliveryAddress)}.
    * @public
    */
  var DELIVERY_ADDRESS_VALUE: js.UndefOr[DeliveryAddressArgument] = js.native
  /**
    * Only use after calling {@link DigitalPurchaseCheck|conv.ask(new DigitalPurchaseCheck)}.
    * @public
    */
  var DIGITAL_PURCHASE_CHECK_RESULT: js.UndefOr[DigitalPurchaseCheckArgument] = js.native
  /**
    * True if it is the final reprompt related to silent input from the user.
    * This should be used along with the `actions.intent.NO_INPUT` intent to give the final
    * response to the user after multiple silences and should be an `conv.close`
    * which ends the conversation.
    * @public
    */
  var IS_FINAL_REPROMPT: js.UndefOr[FinalRepromptArgument] = js.native
  /**
    * The link non status argument.
    * Is undefined as a noop.
    * Use {@link Status#get|conv.arguments.status.get('LINK')} to explicitly get the status.
    * @public
    * @deprecated
    */
  var LINK: js.UndefOr[DeepLinkArgument] = js.native
  /**
    * The status of MEDIA_STATUS intent.
    * @public
    */
  var MEDIA_STATUS: js.UndefOr[MediaStatusArgument] = js.native
  /**
    * The result of {@link NewSurface|conv.ask(new NewSurface)}
    * True if user has triggered conversation on a new device following the
    * `actions.intent.NEW_SURFACE` intent.
    * @public
    */
  var NEW_SURFACE: js.UndefOr[NewSurfaceArgument] = js.native
  /**
    * The option key user chose from options response.
    * Only use after calling {@link List|conv.ask(new List)}
    * or {@link Carousel|conv.ask(new Carousel)}.
    * @public
    */
  var OPTION: js.UndefOr[OptionArgument] = js.native
  /**
    * True if the request follows a previous request asking for
    * permission from the user and the user granted the permission(s).
    * Otherwise, false.
    * Only use after calling {@link Permission|conv.ask(new Permission)}
    * or {@link UpdatePermission|conv.ask(new UpdatePermission)}.
    * @public
    */
  var PERMISSION: js.UndefOr[PermissionArgument] = js.native
  /**
    * The user provided place.
    * Use after {@link Place|conv.ask(new Place)}.
    * @public
    */
  var PLACE: js.UndefOr[PlaceArgument] = js.native
  /**
    * True if user accepted update registration request.
    * Used with {@link RegisterUpdate|conv.ask(new RegisterUpdate)}
    * @public
    */
  var REGISTER_UPDATE: js.UndefOr[RegisterUpdateArgument] = js.native
  /**
    * The number of subsequent reprompts related to silent input from the user.
    * This should be used along with the `actions.intent.NO_INPUT` intent to reprompt the
    * user for input in cases where the Google Assistant could not pick up any speech.
    * @public
    */
  var REPROMPT_COUNT: js.UndefOr[RepromptArgument] = js.native
  /**
    * The status of user sign in request.
    * Use after {@link SignIn|conv.ask(new SignIn)}
    * @public
    */
  var SIGN_IN: js.UndefOr[SignInArgument] = js.native
  /**
    * The transaction decision information.
    * Is object with userDecision only if user declines.
    * userDecision will be one of {@link GoogleActionsV2TransactionDecisionValueUserDecision}.
    * Only use after calling {@link TransactionDecision|conv.ask(new TransactionDecision)}.
    * @public
    */
  var TRANSACTION_DECISION_VALUE: js.UndefOr[TransactionDecisionArgument] = js.native
  /**
    * The transactability of user.
    * Only use after calling {@link TransactionRequirements|conv.ask(new TransactionRequirements)}.
    * Undefined if no result given.
    * @public
    */
  var TRANSACTION_REQUIREMENTS_CHECK_RESULT: js.UndefOr[TransactionRequirementsArgument] = js.native
  /**
    * The updates user id.
    * Only use after calling {@link UpdatePermission|conv.ask(new UpdatePermission)}.
    * @public
    */
  var UPDATES_USER_ID: js.UndefOr[UpdatePermissionUserIdArgument] = js.native
}

object ArgumentsNamed {
  @scala.inline
  def apply(): ArgumentsNamed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArgumentsNamed]
  }
  @scala.inline
  implicit class ArgumentsNamedOps[Self <: ArgumentsNamed] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCOMPLETE_PURCHASE_VALUE(value: CompletePurchaseArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE_PURCHASE_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCOMPLETE_PURCHASE_VALUE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("COMPLETE_PURCHASE_VALUE")(js.undefined)
        ret
    }
    @scala.inline
    def withCONFIRMATION(value: ConfirmationArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONFIRMATION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCONFIRMATION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CONFIRMATION")(js.undefined)
        ret
    }
    @scala.inline
    def withDATETIME(value: DateTimeArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATETIME")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDATETIME: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DATETIME")(js.undefined)
        ret
    }
    @scala.inline
    def withDELIVERY_ADDRESS_VALUE(value: DeliveryAddressArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELIVERY_ADDRESS_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDELIVERY_ADDRESS_VALUE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DELIVERY_ADDRESS_VALUE")(js.undefined)
        ret
    }
    @scala.inline
    def withDIGITAL_PURCHASE_CHECK_RESULT(value: DigitalPurchaseCheckArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIGITAL_PURCHASE_CHECK_RESULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDIGITAL_PURCHASE_CHECK_RESULT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DIGITAL_PURCHASE_CHECK_RESULT")(js.undefined)
        ret
    }
    @scala.inline
    def withIS_FINAL_REPROMPT(value: FinalRepromptArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_FINAL_REPROMPT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIS_FINAL_REPROMPT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IS_FINAL_REPROMPT")(js.undefined)
        ret
    }
    @scala.inline
    def withLINK(value: DeepLinkArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINK")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLINK: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LINK")(js.undefined)
        ret
    }
    @scala.inline
    def withMEDIA_STATUS(value: MediaStatusArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_STATUS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMEDIA_STATUS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MEDIA_STATUS")(js.undefined)
        ret
    }
    @scala.inline
    def withNEW_SURFACE(value: NewSurfaceArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEW_SURFACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNEW_SURFACE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NEW_SURFACE")(js.undefined)
        ret
    }
    @scala.inline
    def withOPTION(value: OptionArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOPTION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPTION")(js.undefined)
        ret
    }
    @scala.inline
    def withPERMISSION(value: PermissionArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPERMISSION: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PERMISSION")(js.undefined)
        ret
    }
    @scala.inline
    def withPLACE(value: PlaceArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLACE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPLACE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PLACE")(js.undefined)
        ret
    }
    @scala.inline
    def withREGISTER_UPDATE(value: RegisterUpdateArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REGISTER_UPDATE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutREGISTER_UPDATE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REGISTER_UPDATE")(js.undefined)
        ret
    }
    @scala.inline
    def withREPROMPT_COUNT(value: RepromptArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REPROMPT_COUNT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutREPROMPT_COUNT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("REPROMPT_COUNT")(js.undefined)
        ret
    }
    @scala.inline
    def withSIGN_IN(value: SignInArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGN_IN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSIGN_IN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SIGN_IN")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSACTION_DECISION_VALUE(value: TransactionDecisionArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSACTION_DECISION_VALUE")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSACTION_DECISION_VALUE: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSACTION_DECISION_VALUE")(js.undefined)
        ret
    }
    @scala.inline
    def withTRANSACTION_REQUIREMENTS_CHECK_RESULT(value: TransactionRequirementsArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSACTION_REQUIREMENTS_CHECK_RESULT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTRANSACTION_REQUIREMENTS_CHECK_RESULT: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TRANSACTION_REQUIREMENTS_CHECK_RESULT")(js.undefined)
        ret
    }
    @scala.inline
    def withUPDATES_USER_ID(value: UpdatePermissionUserIdArgument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATES_USER_ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUPDATES_USER_ID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UPDATES_USER_ID")(js.undefined)
        ret
    }
  }
  
}

