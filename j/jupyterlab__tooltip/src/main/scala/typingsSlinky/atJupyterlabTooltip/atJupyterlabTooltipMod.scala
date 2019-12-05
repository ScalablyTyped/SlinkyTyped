package typingsSlinky.atJupyterlabTooltip

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabTooltip.libWidgetMod.Tooltip.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/tooltip", JSImport.Namespace)
@js.native
object atJupyterlabTooltipMod extends js.Object {
  @js.native
  class Tooltip protected ()
    extends typingsSlinky.atJupyterlabTooltip.libWidgetMod.Tooltip {
    /**
      * Instantiate a tooltip.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  object ITooltipManager
    extends TopLevel[Token[typingsSlinky.atJupyterlabTooltip.libTokensMod.ITooltipManager]]
  
}

