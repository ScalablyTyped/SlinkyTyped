package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.div.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.alertMod.AlertProps
import typingsSlinky.antd.antdStrings.error
import typingsSlinky.antd.antdStrings.info
import typingsSlinky.antd.antdStrings.success
import typingsSlinky.antd.antdStrings.warning
import typingsSlinky.antd.errorBoundaryMod.ErrorBoundaryProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
  @JSImport("antd", "Alert")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def afterClose(value: () => Unit): this.type = set("afterClose", js.Any.fromFunction0(value))
    @scala.inline
    def banner(value: Boolean): this.type = set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def closable(value: Boolean): this.type = set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def closeTextReactElement(value: ReactElement): this.type = set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def closeText(value: ReactElement): this.type = set("closeText", value.asInstanceOf[js.Any])
    @scala.inline
    def descriptionReactElement(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def description(value: ReactElement): this.type = set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def message(value: ReactElement): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def onClose(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): this.type = set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): this.type = set("onMouseLeave", js.Any.fromFunction1(value))
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: success | info | warning | error): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Alert.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object ErrorBoundary {
    @JSImport("antd", "Alert.ErrorBoundary")
    @js.native
    object component extends js.Object
    
    def withProps(p: ErrorBoundaryProps): SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary] = new SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: ErrorBoundary.type): SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary] = new SharedBuilder_ErrorBoundaryProps_1809267820[typingsSlinky.antd.mod.Alert.ErrorBoundary](js.Array(this.component, js.Dictionary.empty))()
  }
  
}

