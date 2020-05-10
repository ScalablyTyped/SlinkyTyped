package typingsSlinky.reactFloater.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.popperJs.mod.Data
import typingsSlinky.popperJs.mod.Modifiers
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactFloater.AnonOffset
import typingsSlinky.reactFloater.PartialStyles
import typingsSlinky.reactFloater.mod.Action
import typingsSlinky.reactFloater.mod.Placement
import typingsSlinky.reactFloater.mod.PropsWithComponent
import typingsSlinky.reactFloater.mod.PropsWithContent
import typingsSlinky.reactFloater.mod.RenderProps
import typingsSlinky.reactFloater.mod.default
import typingsSlinky.reactFloater.reactFloaterStrings.click
import typingsSlinky.reactFloater.reactFloaterStrings.floater
import typingsSlinky.reactFloater.reactFloaterStrings.hover
import typingsSlinky.reactFloater.reactFloaterStrings.wrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactFloater {
  object PropsWithComponent {
    @JSImport("react-floater", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def autoOpen(value: Boolean): this.type = set("autoOpen", value.asInstanceOf[js.Any])
      @scala.inline
      def callback(
        value: (/* action */ Action, /* props */ typingsSlinky.reactFloater.mod.PropsWithComponent | PropsWithContent) => Unit
      ): this.type = set("callback", js.Any.fromFunction2(value))
      @scala.inline
      def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
      @scala.inline
      def disableAnimation(value: Boolean): this.type = set("disableAnimation", value.asInstanceOf[js.Any])
      @scala.inline
      def disableFlip(value: Boolean): this.type = set("disableFlip", value.asInstanceOf[js.Any])
      @scala.inline
      def disableHoverToClick(value: Boolean): this.type = set("disableHoverToClick", value.asInstanceOf[js.Any])
      @scala.inline
      def event(value: click | hover): this.type = set("event", value.asInstanceOf[js.Any])
      @scala.inline
      def eventDelay(value: Double): this.type = set("eventDelay", value.asInstanceOf[js.Any])
      @scala.inline
      def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
      @scala.inline
      def footer(value: TagMod[Any]): this.type = set("footer", value.asInstanceOf[js.Any])
      @scala.inline
      def getPopper(value: (/* popper */ Data, /* origin */ floater | wrapper) => Unit): this.type = set("getPopper", js.Any.fromFunction2(value))
      @scala.inline
      def hideArrow(value: Boolean): this.type = set("hideArrow", value.asInstanceOf[js.Any])
      @scala.inline
      def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
      @scala.inline
      def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      @scala.inline
      def options(value: Modifiers): this.type = set("options", value.asInstanceOf[js.Any])
      @scala.inline
      def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
      @scala.inline
      def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      @scala.inline
      def styles(value: PartialStyles): this.type = set("styles", value.asInstanceOf[js.Any])
      @scala.inline
      def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
      @scala.inline
      def target(value: String | HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
      @scala.inline
      def targetNull: this.type = set("target", null)
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def wrapperOptions(value: AnonOffset): this.type = set("wrapperOptions", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactFloater.mod.PropsWithComponent): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    @scala.inline
    def apply(component: RenderProps => TagMod[Any]): Builder = {
        val __props = js.Dynamic.literal(component = js.Any.fromFunction1(component))
        new Builder(js.Array(this.component, __props.asInstanceOf[typingsSlinky.reactFloater.mod.PropsWithComponent]))
    }
  }
  
  object PropsWithContent {
    @JSImport("react-floater", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, default] {
      @scala.inline
      def autoOpen(value: Boolean): this.type = set("autoOpen", value.asInstanceOf[js.Any])
      @scala.inline
      def callback(
        value: (/* action */ Action, /* props */ PropsWithComponent | typingsSlinky.reactFloater.mod.PropsWithContent) => Unit
      ): this.type = set("callback", js.Any.fromFunction2(value))
      @scala.inline
      def content(value: TagMod[Any]): this.type = set("content", value.asInstanceOf[js.Any])
      @scala.inline
      def debug(value: Boolean): this.type = set("debug", value.asInstanceOf[js.Any])
      @scala.inline
      def disableAnimation(value: Boolean): this.type = set("disableAnimation", value.asInstanceOf[js.Any])
      @scala.inline
      def disableFlip(value: Boolean): this.type = set("disableFlip", value.asInstanceOf[js.Any])
      @scala.inline
      def disableHoverToClick(value: Boolean): this.type = set("disableHoverToClick", value.asInstanceOf[js.Any])
      @scala.inline
      def event(value: click | hover): this.type = set("event", value.asInstanceOf[js.Any])
      @scala.inline
      def eventDelay(value: Double): this.type = set("eventDelay", value.asInstanceOf[js.Any])
      @scala.inline
      def footerReactElement(value: ReactElement): this.type = set("footer", value.asInstanceOf[js.Any])
      @scala.inline
      def footer(value: TagMod[Any]): this.type = set("footer", value.asInstanceOf[js.Any])
      @scala.inline
      def getPopper(value: (/* popper */ Data, /* origin */ floater | wrapper) => Unit): this.type = set("getPopper", js.Any.fromFunction2(value))
      @scala.inline
      def hideArrow(value: Boolean): this.type = set("hideArrow", value.asInstanceOf[js.Any])
      @scala.inline
      def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
      @scala.inline
      def offset(value: Double): this.type = set("offset", value.asInstanceOf[js.Any])
      @scala.inline
      def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
      @scala.inline
      def options(value: Modifiers): this.type = set("options", value.asInstanceOf[js.Any])
      @scala.inline
      def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
      @scala.inline
      def showCloseButton(value: Boolean): this.type = set("showCloseButton", value.asInstanceOf[js.Any])
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      @scala.inline
      def styles(value: PartialStyles): this.type = set("styles", value.asInstanceOf[js.Any])
      @scala.inline
      def targetHTMLElement(value: HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
      @scala.inline
      def target(value: String | HTMLElement): this.type = set("target", value.asInstanceOf[js.Any])
      @scala.inline
      def targetNull: this.type = set("target", null)
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def title(value: TagMod[Any]): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def wrapperOptions(value: AnonOffset): this.type = set("wrapperOptions", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: typingsSlinky.reactFloater.mod.PropsWithContent): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: PropsWithContent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

