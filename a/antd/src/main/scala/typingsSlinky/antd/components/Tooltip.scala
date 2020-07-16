package typingsSlinky.antd.components

import typingsSlinky.antd.tooltipMod.TooltipPropsWithOverlay
import typingsSlinky.antd.tooltipMod.TooltipPropsWithTitle
import typingsSlinky.react.mod.RefAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tooltip {
  object TooltipPropsWithOverlayRefAttributes {
    @JSImport("antd/lib/tooltip", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps(p: TooltipPropsWithOverlay with RefAttributes[js.Any]): SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object] = new SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: TooltipPropsWithOverlayRefAttributes.type): SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object] = new SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
  object TooltipPropsWithTitleRefAttributes {
    @JSImport("antd/lib/tooltip", JSImport.Default)
    @js.native
    object component extends js.Object
    
    def withProps(p: TooltipPropsWithTitle with RefAttributes[js.Any]): SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object] = new SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: TooltipPropsWithTitleRefAttributes.type): SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object] = new SharedBuilder_TooltipPropsWithOverlayRefAttributesTooltipPropsWithTitleRefAttributes_808926508[js.Any with js.Object](js.Array(this.component, js.Dictionary.empty))()
  }
  
}

