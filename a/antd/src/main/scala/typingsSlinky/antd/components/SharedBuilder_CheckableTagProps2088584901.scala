package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_CheckableTagProps2088584901 (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, scala.Nothing] {
  @scala.inline
  def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  @scala.inline
  def onChange(value: /* checked */ Boolean => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
  @scala.inline
  def onClick(value: /* e */ MouseEventHandler[HTMLElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
}

