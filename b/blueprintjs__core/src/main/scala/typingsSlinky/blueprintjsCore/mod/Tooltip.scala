package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.anon.PartialITooltipProps
import typingsSlinky.blueprintjsCore.tooltipMod.ITooltipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Tooltip")
@js.native
class Tooltip protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Tooltip {
  def this(props: ITooltipProps) = this()
  def this(props: ITooltipProps, context: js.Any) = this()
}
/* static members */
object Tooltip {
  
  @JSImport("@blueprintjs/core", "Tooltip")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Tooltip.defaultProps")
  @js.native
  def defaultProps: PartialITooltipProps = js.native
  @scala.inline
  def defaultProps_=(x: PartialITooltipProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Tooltip.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
