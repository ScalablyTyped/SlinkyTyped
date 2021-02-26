package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.popoverMod.IPopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Popover")
@js.native
class Popover protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Popover {
  def this(props: IPopoverProps) = this()
  def this(props: IPopoverProps, context: js.Any) = this()
}
/* static members */
object Popover {
  
  @JSImport("@blueprintjs/core", "Popover")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Popover.defaultProps")
  @js.native
  def defaultProps: IPopoverProps = js.native
  @scala.inline
  def defaultProps_=(x: IPopoverProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Popover.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
