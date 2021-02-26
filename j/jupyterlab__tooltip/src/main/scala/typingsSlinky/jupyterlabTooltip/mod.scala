package typingsSlinky.jupyterlabTooltip

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object ITooltipManager extends Shortcut {
    
    @JSImport("@jupyterlab/tooltip", "ITooltipManager")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabTooltip.tokensMod.ITooltipManager] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabTooltip.tokensMod.ITooltipManager]
    
    /* This means you don't have to write `^`, but can instead just say `ITooltipManager.foo` */
    override def _to: Token[typingsSlinky.jupyterlabTooltip.tokensMod.ITooltipManager] = ^
  }
  
  @JSImport("@jupyterlab/tooltip", "Tooltip")
  @js.native
  class Tooltip protected ()
    extends typingsSlinky.jupyterlabTooltip.widgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
}
