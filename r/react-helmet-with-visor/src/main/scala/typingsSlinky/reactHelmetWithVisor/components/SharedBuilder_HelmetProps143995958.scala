package typingsSlinky.reactHelmetWithVisor.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactHelmetWithVisor.mod.BodyProps
import typingsSlinky.reactHelmetWithVisor.mod.HelmetTags
import typingsSlinky.reactHelmetWithVisor.mod.HtmlProps
import typingsSlinky.reactHelmetWithVisor.mod.LinkProps
import typingsSlinky.reactHelmetWithVisor.mod.MetaProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_HelmetProps143995958[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def async(value: Boolean): this.type = set("async", value.asInstanceOf[js.Any])
  @scala.inline
  def base(value: js.Any): this.type = set("base", value.asInstanceOf[js.Any])
  @scala.inline
  def bodyAttributes(value: BodyProps): this.type = set("bodyAttributes", value.asInstanceOf[js.Any])
  @scala.inline
  def defaultTitle(value: String): this.type = set("defaultTitle", value.asInstanceOf[js.Any])
  @scala.inline
  def defer(value: Boolean): this.type = set("defer", value.asInstanceOf[js.Any])
  @scala.inline
  def encodeSpecialCharacters(value: Boolean): this.type = set("encodeSpecialCharacters", value.asInstanceOf[js.Any])
  @scala.inline
  def htmlAttributes(value: HtmlProps): this.type = set("htmlAttributes", value.asInstanceOf[js.Any])
  @scala.inline
  def link(value: js.Array[LinkProps]): this.type = set("link", value.asInstanceOf[js.Any])
  @scala.inline
  def meta(value: js.Array[MetaProps]): this.type = set("meta", value.asInstanceOf[js.Any])
  @scala.inline
  def noscript(value: js.Array[_]): this.type = set("noscript", value.asInstanceOf[js.Any])
  @scala.inline
  def onChangeClientState(value: (/* newState */ js.Any, /* addedTags */ HelmetTags, /* removedTags */ HelmetTags) => Unit): this.type = set("onChangeClientState", js.Any.fromFunction3(value))
  @scala.inline
  def script(value: js.Array[_]): this.type = set("script", value.asInstanceOf[js.Any])
  @scala.inline
  def style(value: js.Array[_]): this.type = set("style", value.asInstanceOf[js.Any])
  @scala.inline
  def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  @scala.inline
  def titleAttributes(value: js.Object): this.type = set("titleAttributes", value.asInstanceOf[js.Any])
  @scala.inline
  def titleTemplate(value: String): this.type = set("titleTemplate", value.asInstanceOf[js.Any])
}

