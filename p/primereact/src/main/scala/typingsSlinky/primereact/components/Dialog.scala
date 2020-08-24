package typingsSlinky.primereact.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.anon.Maximized
import typingsSlinky.primereact.dialogMod.DialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog {
  @JSImport("primereact/dialog", "Dialog")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactDialogMod.Dialog] {
    @scala.inline
    def appendTo(value: HTMLElement): this.type = set("appendTo", value.asInstanceOf[js.Any])
    @scala.inline
    def ariaCloseIconLabel(value: String): this.type = set("ariaCloseIconLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def baseZIndex(value: Double): this.type = set("baseZIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def blockScroll(value: Boolean): this.type = set("blockScroll", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def closeOnEscape(value: Boolean): this.type = set("closeOnEscape", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: js.Object): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissableMask(value: Boolean): this.type = set("dismissableMask", value.asInstanceOf[js.Any])
    @scala.inline
    def focusOnShow(value: Boolean): this.type = set("focusOnShow", value.asInstanceOf[js.Any])
    @scala.inline
    def footer(value: js.Any): this.type = set("footer", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: js.Any): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def iconsTemplate(value: js.Any): this.type = set("iconsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def maskClassName(value: String): this.type = set("maskClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def maximizable(value: Boolean): this.type = set("maximizable", value.asInstanceOf[js.Any])
    @scala.inline
    def maximized(value: Boolean): this.type = set("maximized", value.asInstanceOf[js.Any])
    @scala.inline
    def modal(value: Boolean): this.type = set("modal", value.asInstanceOf[js.Any])
    @scala.inline
    def onMaximize(value: /* e */ Maximized => Unit): this.type = set("onMaximize", js.Any.fromFunction1(value))
    @scala.inline
    def onShow(value: () => Unit): this.type = set("onShow", js.Any.fromFunction0(value))
    @scala.inline
    def position(value: String): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    @scala.inline
    def showHeader(value: Boolean): this.type = set("showHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: js.Object): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def visible(value: Boolean): this.type = set("visible", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DialogProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(onHide: () => Unit): Builder = {
    val __props = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    new Builder(js.Array(this.component, __props.asInstanceOf[DialogProps]))
  }
}

