package typingsSlinky.blueprintjsCore.componentsMod

import typingsSlinky.blueprintjsCore.toastMod.IToastProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core/lib/esm/components", "Toast")
@js.native
class Toast protected ()
  extends typingsSlinky.blueprintjsCore.toastMod.Toast {
  def this(props: IToastProps) = this()
  def this(props: IToastProps, context: js.Any) = this()
}
/* static members */
object Toast {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toast")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toast.defaultProps")
  @js.native
  def defaultProps: IToastProps = js.native
  @scala.inline
  def defaultProps_=(x: IToastProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core/lib/esm/components", "Toast.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
