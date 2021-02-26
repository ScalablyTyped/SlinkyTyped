package typingsSlinky.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openseadragon", "ControlDock")
@js.native
class ControlDock protected () extends StObject {
  def this(options: js.Object) = this()
  
  def addControl(element: Control, controlOptions: TControlOptions): Unit = js.native
  
  def areControlsEnabled(): Boolean = js.native
  
  def clearControls(): ControlDock = js.native
  
  def removeControl(element: Control): ControlDock = js.native
  
  def setControlsEnabled(enabled: Boolean): ControlDock = js.native
}
