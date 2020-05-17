package typingsSlinky.reactChatWidget.anon

import slinky.core.ReactComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Autofocus extends js.Object {
  var autofocus: js.UndefOr[Boolean] = js.native
  var badge: js.UndefOr[Double] = js.native
  var customLauncher: js.UndefOr[ReactComponentClass[js.Function0[Unit]]] = js.native
  var fullScreenMode: js.UndefOr[Boolean] = js.native
  var handleQuickButtonClicked: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.native
  var profileAvatar: js.UndefOr[String] = js.native
  var senderPlaceHolder: js.UndefOr[String] = js.native
  var showCloseButton: js.UndefOr[Boolean] = js.native
  var subtitle: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var titleAvatar: js.UndefOr[String] = js.native
  def handleNewUserMessage(userInput: String): Unit = js.native
}

object Autofocus {
  @scala.inline
  def apply(handleNewUserMessage: String => Unit): Autofocus = {
    val __obj = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
    __obj.asInstanceOf[Autofocus]
  }
  @scala.inline
  implicit class AutofocusOps[Self <: Autofocus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandleNewUserMessage(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleNewUserMessage")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAutofocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutofocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autofocus")(js.undefined)
        ret
    }
    @scala.inline
    def withBadge(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badge")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLauncherFunctionComponent(value: ReactComponentClass[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLauncher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomLauncherComponentClass(value: ReactComponentClass[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLauncher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCustomLauncher(value: ReactComponentClass[js.Function0[Unit]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLauncher")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLauncher: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLauncher")(js.undefined)
        ret
    }
    @scala.inline
    def withFullScreenMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreenMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullScreenMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullScreenMode")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleQuickButtonClicked(value: /* value */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleQuickButtonClicked")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutHandleQuickButtonClicked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleQuickButtonClicked")(js.undefined)
        ret
    }
    @scala.inline
    def withProfileAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProfileAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("profileAvatar")(js.undefined)
        ret
    }
    @scala.inline
    def withSenderPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderPlaceHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSenderPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("senderPlaceHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleAvatar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAvatar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleAvatar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleAvatar")(js.undefined)
        ret
    }
  }
  
}

