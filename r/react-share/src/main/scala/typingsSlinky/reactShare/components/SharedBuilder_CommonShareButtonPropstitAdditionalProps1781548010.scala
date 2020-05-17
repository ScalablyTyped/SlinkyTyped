package typingsSlinky.reactShare.components

import org.scalajs.dom.raw.HTMLDivElement
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.StyleHTMLAttributes
import typingsSlinky.reactShare.reactShareStrings.screenCenter
import typingsSlinky.reactShare.reactShareStrings.windowCenter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_CommonShareButtonPropstitAdditionalProps1781548010 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def additionalProps(value: HTMLAttributes[HTMLDivElement]): this.type = set("additionalProps", value.asInstanceOf[js.Any])
  @scala.inline
  def beforeOnClick(value: () => js.Promise[Unit] | Unit): this.type = set("beforeOnClick", js.Any.fromFunction0(value))
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def disabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): this.type = set("disabledStyle", value.asInstanceOf[js.Any])
  @scala.inline
  def onClick(value: /* link */ String => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def onShareWindowClose(value: () => Unit): this.type = set("onShareWindowClose", js.Any.fromFunction0(value))
  @scala.inline
  def openWindow(value: Boolean): this.type = set("openWindow", value.asInstanceOf[js.Any])
  @scala.inline
  def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def windowHeight(value: Double): this.type = set("windowHeight", value.asInstanceOf[js.Any])
  @scala.inline
  def windowPosition(value: windowCenter | screenCenter): this.type = set("windowPosition", value.asInstanceOf[js.Any])
  @scala.inline
  def windowWidth(value: Double): this.type = set("windowWidth", value.asInstanceOf[js.Any])
}

