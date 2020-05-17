package typingsSlinky.knuddelsUserappsApi.mod.global

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.knuddelsUserappsApi.mod.KnuddelsEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * @see https://developer.knuddels.de/docs/classes/App.html
	 */
@js.native
trait App extends js.Object {
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#property_chatCommands
  		 */
  var chatCommands: js.UndefOr[
    StringDictionary[
      js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
    ]
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayJoinChannel
  		 */
  var mayJoinChannel: js.UndefOr[js.Function1[/* user */ User, ChannelJoinPermission]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicActionMessage
  		 */
  var mayShowPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Boolean]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayShowPublicMessage
  		 */
  var mayShowPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Boolean]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_mayUserDice
  		 */
  var mayUserDice: js.UndefOr[js.Function2[/* user */ User, /* diceConfig */ DiceConfiguration, Boolean]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountChangedKnuddelAmount
  		 */
  var onAccountChangedKnuddelAmount: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* knuddelAccount */ KnuddelAccount, 
      /* oldKnuddelAmount */ KnuddelAmount, 
      /* newKnuddelAmount */ KnuddelAmount, 
      Unit
    ]
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAccountReceivedKnuddel
  		 */
  var onAccountReceivedKnuddel: js.UndefOr[
    js.Function5[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      /* knuddelAccount */ KnuddelAccount, 
      Unit
    ]
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppEventReceived
  		 */
  var onAppEventReceived: js.UndefOr[
    js.Function3[
      /* appInstance */ AppInstance, 
      /* type */ java.lang.String, 
      /* data */ KnuddelsEvent, 
      Unit
    ]
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onAppStart
  		 */
  var onAppStart: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onBeforeKnuddelReceived
  		 */
  var onBeforeKnuddelReceived: js.UndefOr[js.Function1[/* knuddelTransfer */ KnuddelTransfer, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onDeveloperCommand
  		 * @since AppServer 108662, ChatServer 108662
  		 */
  var onDeveloperCommand: js.UndefOr[js.Function2[/* user */ User, /* params */ java.lang.String, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onEventReceived
  		 */
  var onEventReceived: js.UndefOr[
    js.Function4[
      /* user */ User, 
      /* type */ java.lang.String, 
      /* data */ KnuddelsEvent, 
      /* appContentSession */ AppContentSession, 
      Unit
    ]
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onKnuddelReceived
  		 */
  var onKnuddelReceived: js.UndefOr[
    js.Function4[
      /* sender */ User, 
      /* receiver */ BotUser, 
      /* knuddelAmount */ KnuddelAmount, 
      /* transferReason */ java.lang.String, 
      Unit
    ]
  ] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrepareShutdown
  		 */
  var onPrepareShutdown: js.UndefOr[js.Function1[/* secondsTillShutdown */ Double, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPrivateMessage
  		 */
  var onPrivateMessage: js.UndefOr[js.Function1[/* privateMessage */ PrivateMessage, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicActionMessage
  		 */
  var onPublicActionMessage: js.UndefOr[js.Function1[/* publicActionMessage */ PublicActionMessage, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicEventMessage
  		 */
  var onPublicEventMessage: js.UndefOr[js.Function1[/* publicEventMessage */ PublicEventMessage, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onPublicMessage
  		 */
  var onPublicMessage: js.UndefOr[js.Function1[/* publicMessage */ PublicMessage, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onShutdown
  		 */
  var onShutdown: js.UndefOr[js.Function0[Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDeleted
  		 */
  var onUserDeleted: js.UndefOr[js.Function2[/* userId */ Double, /* userPersistence */ UserPersistence, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserDiced
  		 */
  var onUserDiced: js.UndefOr[js.Function1[/* diceEvent */ DiceEvent, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserJoined
  		 */
  var onUserJoined: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.native
  /**
  		 * @see https://developer.knuddels.de/docs/classes/App.html#method_onUserLeft
  		 */
  var onUserLeft: js.UndefOr[js.Function1[/* user */ User, Unit]] = js.native
}

object App {
  @scala.inline
  def apply(): App = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[App]
  }
  @scala.inline
  implicit class AppOps[Self <: App] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChatCommands(
      value: StringDictionary[
          js.Function3[/* user */ User, /* params */ java.lang.String, /* command */ java.lang.String, Unit]
        ]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatCommands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChatCommands: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chatCommands")(js.undefined)
        ret
    }
    @scala.inline
    def withMayJoinChannel(value: /* user */ User => ChannelJoinPermission): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayJoinChannel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMayJoinChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayJoinChannel")(js.undefined)
        ret
    }
    @scala.inline
    def withMayShowPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayShowPublicActionMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMayShowPublicActionMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayShowPublicActionMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMayShowPublicMessage(value: /* publicMessage */ PublicMessage => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayShowPublicMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutMayShowPublicMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayShowPublicMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMayUserDice(value: (/* user */ User, /* diceConfig */ DiceConfiguration) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayUserDice")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMayUserDice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mayUserDice")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccountChangedKnuddelAmount(
      value: (/* user */ User, /* knuddelAccount */ KnuddelAccount, /* oldKnuddelAmount */ KnuddelAmount, /* newKnuddelAmount */ KnuddelAmount) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccountChangedKnuddelAmount")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnAccountChangedKnuddelAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccountChangedKnuddelAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAccountReceivedKnuddel(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String, /* knuddelAccount */ KnuddelAccount) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccountReceivedKnuddel")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutOnAccountReceivedKnuddel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAccountReceivedKnuddel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppEventReceived(
      value: (/* appInstance */ AppInstance, /* type */ java.lang.String, /* data */ KnuddelsEvent) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppEventReceived")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutOnAppEventReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppEventReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnAppStart(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppStart")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnAppStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onAppStart")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeKnuddelReceived(value: /* knuddelTransfer */ KnuddelTransfer => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeKnuddelReceived")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeKnuddelReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeKnuddelReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDeveloperCommand(value: (/* user */ User, /* params */ java.lang.String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeveloperCommand")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnDeveloperCommand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDeveloperCommand")(js.undefined)
        ret
    }
    @scala.inline
    def withOnEventReceived(
      value: (/* user */ User, /* type */ java.lang.String, /* data */ KnuddelsEvent, /* appContentSession */ AppContentSession) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventReceived")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnEventReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onEventReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnKnuddelReceived(
      value: (/* sender */ User, /* receiver */ BotUser, /* knuddelAmount */ KnuddelAmount, /* transferReason */ java.lang.String) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKnuddelReceived")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutOnKnuddelReceived: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onKnuddelReceived")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrepareShutdown(value: /* secondsTillShutdown */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepareShutdown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrepareShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrepareShutdown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPrivateMessage(value: /* privateMessage */ PrivateMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrivateMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPrivateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPrivateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPublicActionMessage(value: /* publicActionMessage */ PublicActionMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPublicActionMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPublicActionMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPublicActionMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPublicEventMessage(value: /* publicEventMessage */ PublicEventMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPublicEventMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPublicEventMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPublicEventMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnPublicMessage(value: /* publicMessage */ PublicMessage => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPublicMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnPublicMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onPublicMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnShutdown(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShutdown")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnShutdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onShutdown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserDeleted(value: (/* userId */ Double, /* userPersistence */ UserPersistence) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserDeleted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUserDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserDeleted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserDiced(value: /* diceEvent */ DiceEvent => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserDiced")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserDiced: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserDiced")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserJoined(value: /* user */ User => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserJoined")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserJoined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserJoined")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUserLeft(value: /* user */ User => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserLeft")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUserLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUserLeft")(js.undefined)
        ret
    }
  }
  
}

