package typingsSlinky.jupyterlabTooltip

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabTooltip.widgetMod.Tooltip.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/tooltip", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object ITooltipManager
    extends TopLevel[Token[typingsSlinky.jupyterlabTooltip.tokensMod.ITooltipManager]]
  
  @js.native
  class Tooltip protected ()
    extends typingsSlinky.jupyterlabTooltip.widgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
}
