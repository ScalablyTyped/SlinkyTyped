package typingsSlinky.leafletDraw.mod

import typingsSlinky.leafletDraw.mod.Control.DrawConstructorOptions
import typingsSlinky.leafletDraw.mod.Draw.Feature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "DrawToolbar")
@js.native
class DrawToolbar () extends Toolbar {
  def this(options: ToolbarOptions) = this()
  
  def getActions(handler: Feature): js.Array[ToolbarAction] = js.native
  
  def getModeHandlers(map: DrawMap): js.Array[ToolbarModeHandler] = js.native
  
  def setOptions(options: DrawConstructorOptions): Unit = js.native
}
