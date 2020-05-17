package typingsSlinky.reactChatWidget.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactChatWidget.anon.Autofocus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Widget {
  @JSImport("react-chat-widget", "Widget")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactChatWidget.mod.Widget] {
    @scala.inline
    def autofocus(value: Boolean): this.type = set("autofocus", value.asInstanceOf[js.Any])
    @scala.inline
    def badge(value: Double): this.type = set("badge", value.asInstanceOf[js.Any])
    @scala.inline
    def customLauncherFunctionComponent(value: ReactComponentClass[js.Function0[Unit]]): this.type = set("customLauncher", value.asInstanceOf[js.Any])
    @scala.inline
    def customLauncherComponentClass(value: ReactComponentClass[js.Function0[Unit]]): this.type = set("customLauncher", value.asInstanceOf[js.Any])
    @scala.inline
    def customLauncher(value: ReactComponentClass[js.Function0[Unit]]): this.type = set("customLauncher", value.asInstanceOf[js.Any])
    @scala.inline
    def fullScreenMode(value: Boolean): this.type = set("fullScreenMode", value.asInstanceOf[js.Any])
    @scala.inline
    def handleQuickButtonClicked(value: /* value */ String => Unit): this.type = set("handleQuickButtonClicked", js.Any.fromFunction1(value))
    @scala.inline
    def profileAvatar(value: String): this.type = set("profileAvatar", value.asInstanceOf[js.Any])
    @scala.inline
    def senderPlaceHolder(value: String): this.type = set("senderPlaceHolder", value.asInstanceOf[js.Any])
    @scala.inline
    def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
    @scala.inline
    def subtitle(value: String): this.type = set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def titleAvatar(value: String): this.type = set("titleAvatar", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Autofocus): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(handleNewUserMessage: String => Unit): Builder = {
    val __props = js.Dynamic.literal(handleNewUserMessage = js.Any.fromFunction1(handleNewUserMessage))
    new Builder(js.Array(this.component, __props.asInstanceOf[Autofocus]))
  }
}

