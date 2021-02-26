package typingsSlinky.blueprintjsCore.mod

import typingsSlinky.blueprintjsCore.controlsMod.ICheckboxProps
import typingsSlinky.blueprintjsCore.controlsMod.ICheckboxState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "Checkbox")
@js.native
class Checkbox protected ()
  extends typingsSlinky.blueprintjsCore.componentsMod.Checkbox {
  def this(props: ICheckboxProps) = this()
  def this(props: ICheckboxProps, context: js.Any) = this()
}
/* static members */
object Checkbox {
  
  @JSImport("@blueprintjs/core", "Checkbox")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core", "Checkbox.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("@blueprintjs/core", "Checkbox.getDerivedStateFromProps")
  @js.native
  def getDerivedStateFromProps(hasIndeterminate: ICheckboxProps): ICheckboxState | Null = js.native
}
