package typingsSlinky.rcMenu.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rcMenu.interfaceMod.MenuInfo
import typingsSlinky.rcMenu.rcMenuStrings.ltr
import typingsSlinky.rcMenu.rcMenuStrings.rtl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_MenuItemGroupProps_851978124[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def direction(value: ltr | rtl): this.type = set("direction", value.asInstanceOf[js.Any])
  @scala.inline
  def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  @scala.inline
  def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
  @scala.inline
  def onClick(value: /* info */ MenuInfo => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def renderMenuItem(value: (/* item */ ReactElement, /* index */ Double, /* key */ String) => ReactElement): this.type = set("renderMenuItem", js.Any.fromFunction3(value))
  @scala.inline
  def rootPrefixCls(value: String): this.type = set("rootPrefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def subMenuKey(value: String): this.type = set("subMenuKey", value.asInstanceOf[js.Any])
  @scala.inline
  def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
}

