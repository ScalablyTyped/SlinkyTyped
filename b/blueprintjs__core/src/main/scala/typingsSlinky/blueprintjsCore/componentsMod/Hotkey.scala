package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.anon.AllowInInput
import typingsSlinky.blueprintjsCore.hotkeyMod.IHotkeyProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Hotkey")
@js.native
class Hotkey protected ()
  extends typingsSlinky.blueprintjsCore.hotkeysMod.Hotkey {
  def this(props: IHotkeyProps) = this()
  def this(props: IHotkeyProps, context: js.Any) = this()
}
/* static members */
object Hotkey {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkey")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkey.defaultProps")
  @js.native
  def defaultProps: AllowInInput = js.native
  @scala.inline
  def defaultProps_=(x: AllowInInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Hotkey.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
