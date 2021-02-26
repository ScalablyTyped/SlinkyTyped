package typingsSlinky.materialUiCore

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.materialUiCore.tooltipTooltipMod.TooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tooltipMod extends Shortcut {
  
  @JSImport("@material-ui/core/Tooltip", JSImport.Default)
  @js.native
  val default: ReactComponentClass[TooltipProps] = js.native
  
  type _To = ReactComponentClass[TooltipProps]
  
  /* This means you don't have to write `default`, but can instead just say `tooltipMod.foo` */
  override def _to: ReactComponentClass[TooltipProps] = default
}
