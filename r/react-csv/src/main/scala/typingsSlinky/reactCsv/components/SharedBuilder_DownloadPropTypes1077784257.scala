package typingsSlinky.reactCsv.components

import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.reactCsv.commonPropTypesMod.AsyncClickHandler
import typingsSlinky.reactCsv.commonPropTypesMod.Headers
import typingsSlinky.reactCsv.commonPropTypesMod.SyncClickHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@scala.inline
class SharedBuilder_DownloadPropTypes1077784257[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  @scala.inline
  def asyncOnClick(value: Boolean): this.type = set("asyncOnClick", value.asInstanceOf[js.Any])
  @scala.inline
  def enclosingCharacter(value: String): this.type = set("enclosingCharacter", value.asInstanceOf[js.Any])
  @scala.inline
  def filename(value: String): this.type = set("filename", value.asInstanceOf[js.Any])
  @scala.inline
  def headers(value: Headers): this.type = set("headers", value.asInstanceOf[js.Any])
  @scala.inline
  def onClickFunction2(
    value: (/* event */ MouseEventHandler[HTMLAnchorElement], /* done */ js.Function1[/* proceed */ js.UndefOr[Boolean], Unit]) => Unit
  ): this.type = set("onClick", js.Any.fromFunction2(value))
  @scala.inline
  def onClickFunction1(value: /* event */ MouseEventHandler[HTMLAnchorElement] => Boolean | Unit): this.type = set("onClick", js.Any.fromFunction1(value))
  @scala.inline
  def onClick(value: SyncClickHandler | AsyncClickHandler): this.type = set("onClick", value.asInstanceOf[js.Any])
  @scala.inline
  def separator(value: String): this.type = set("separator", value.asInstanceOf[js.Any])
  @scala.inline
  def target(value: String): this.type = set("target", value.asInstanceOf[js.Any])
  @scala.inline
  def uFEFF(value: Boolean): this.type = set("uFEFF", value.asInstanceOf[js.Any])
}

