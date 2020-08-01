package typingsSlinky.antd.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.colorsMod.PresetColorType
import typingsSlinky.antd.placementsMod.AdjustOverflow
import typingsSlinky.antd.tooltipMod.RenderFunction
import typingsSlinky.antd.tooltipMod.TooltipPlacement
import typingsSlinky.antd.tooltipMod.TooltipPropsWithOverlay
import typingsSlinky.antd.tooltipMod.TooltipPropsWithTitle
import typingsSlinky.antd.typeMod.LiteralUnion
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SliderTooltip {
  object TooltipPropsWithOverlayRefAttributes {
    @JSImport("antd/lib/slider/SliderTooltip", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Any with js.Object] {
      @scala.inline
      def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
      @scala.inline
      def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
      @scala.inline
      def builtinPlacements(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
      ): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
      @scala.inline
      def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      @scala.inline
      def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
      @scala.inline
      def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
      @scala.inline
      def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
      @scala.inline
      def overlay(value: ReactElement | RenderFunction): this.type = set("overlay", value.asInstanceOf[js.Any])
      @scala.inline
      def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def titleFunction0(value: () => ReactElement): this.type = set("title", js.Any.fromFunction0(value))
      @scala.inline
      def title(value: ReactElement | RenderFunction): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TooltipPropsWithOverlay with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: TooltipPropsWithOverlayRefAttributes.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
  object TooltipPropsWithTitleRefAttributes {
    @JSImport("antd/lib/slider/SliderTooltip", JSImport.Default)
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Any with js.Object] {
      @scala.inline
      def arrowPointAtCenter(value: Boolean): this.type = set("arrowPointAtCenter", value.asInstanceOf[js.Any])
      @scala.inline
      def autoAdjustOverflow(value: Boolean | AdjustOverflow): this.type = set("autoAdjustOverflow", value.asInstanceOf[js.Any])
      @scala.inline
      def builtinPlacements(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BuildInPlacements */ js.Any
      ): this.type = set("builtinPlacements", value.asInstanceOf[js.Any])
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def color(value: LiteralUnion[PresetColorType, String]): this.type = set("color", value.asInstanceOf[js.Any])
      @scala.inline
      def getPopupContainer(value: /* triggerNode */ HTMLElement => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
      @scala.inline
      def openClassName(value: String): this.type = set("openClassName", value.asInstanceOf[js.Any])
      @scala.inline
      def overlayReactElement(value: ReactElement): this.type = set("overlay", value.asInstanceOf[js.Any])
      @scala.inline
      def overlayFunction0(value: () => ReactElement): this.type = set("overlay", js.Any.fromFunction0(value))
      @scala.inline
      def overlay(value: ReactElement | RenderFunction): this.type = set("overlay", value.asInstanceOf[js.Any])
      @scala.inline
      def placement(value: TooltipPlacement): this.type = set("placement", value.asInstanceOf[js.Any])
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
      @scala.inline
      def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
      @scala.inline
      def titleFunction0(value: () => ReactElement): this.type = set("title", js.Any.fromFunction0(value))
      @scala.inline
      def title(value: ReactElement | RenderFunction): this.type = set("title", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: TooltipPropsWithTitle with RefAttributes[js.Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: TooltipPropsWithTitleRefAttributes.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

