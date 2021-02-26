package typingsSlinky.rcSlider

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.rcTooltip.tooltipMod.TooltipProps
import typingsSlinky.react.mod.ForwardRefExoticComponent
import typingsSlinky.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderTooltipMod extends Shortcut {
  
  @JSImport("rc-slider/lib/common/SliderTooltip", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TooltipProps with RefAttributes[_]] = js.native
  
  type _To = ForwardRefExoticComponent[TooltipProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `sliderTooltipMod.foo` */
  override def _to: ForwardRefExoticComponent[TooltipProps with RefAttributes[_]] = default
}
