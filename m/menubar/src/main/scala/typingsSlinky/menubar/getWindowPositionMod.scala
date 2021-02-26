package typingsSlinky.menubar

import typingsSlinky.electron.mod.Tray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getWindowPositionMod {
  
  @JSImport("menubar/lib/util/getWindowPosition", "getWindowPosition")
  @js.native
  def getWindowPosition(tray: Tray): WindowPosition = js.native
  
  @JSImport("menubar/lib/util/getWindowPosition", "taskbarLocation")
  @js.native
  def taskbarLocation(tray: Tray): TaskbarLocation_ = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.menubar.menubarStrings.top
    - typingsSlinky.menubar.menubarStrings.bottom
    - typingsSlinky.menubar.menubarStrings.left
    - typingsSlinky.menubar.menubarStrings.right
  */
  trait TaskbarLocation_ extends StObject
  object TaskbarLocation_ {
    
    @scala.inline
    def bottom: typingsSlinky.menubar.menubarStrings.bottom = "bottom".asInstanceOf[typingsSlinky.menubar.menubarStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.menubar.menubarStrings.left = "left".asInstanceOf[typingsSlinky.menubar.menubarStrings.left]
    
    @scala.inline
    def right: typingsSlinky.menubar.menubarStrings.right = "right".asInstanceOf[typingsSlinky.menubar.menubarStrings.right]
    
    @scala.inline
    def top: typingsSlinky.menubar.menubarStrings.top = "top".asInstanceOf[typingsSlinky.menubar.menubarStrings.top]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.menubar.menubarStrings.trayCenter
    - typingsSlinky.menubar.menubarStrings.topRight
    - typingsSlinky.menubar.menubarStrings.trayBottomCenter
    - typingsSlinky.menubar.menubarStrings.trayBottomLeft
    - typingsSlinky.menubar.menubarStrings.bottomRight
  */
  trait WindowPosition extends StObject
  object WindowPosition {
    
    @scala.inline
    def bottomRight: typingsSlinky.menubar.menubarStrings.bottomRight = "bottomRight".asInstanceOf[typingsSlinky.menubar.menubarStrings.bottomRight]
    
    @scala.inline
    def topRight: typingsSlinky.menubar.menubarStrings.topRight = "topRight".asInstanceOf[typingsSlinky.menubar.menubarStrings.topRight]
    
    @scala.inline
    def trayBottomCenter: typingsSlinky.menubar.menubarStrings.trayBottomCenter = "trayBottomCenter".asInstanceOf[typingsSlinky.menubar.menubarStrings.trayBottomCenter]
    
    @scala.inline
    def trayBottomLeft: typingsSlinky.menubar.menubarStrings.trayBottomLeft = "trayBottomLeft".asInstanceOf[typingsSlinky.menubar.menubarStrings.trayBottomLeft]
    
    @scala.inline
    def trayCenter: typingsSlinky.menubar.menubarStrings.trayCenter = "trayCenter".asInstanceOf[typingsSlinky.menubar.menubarStrings.trayCenter]
  }
}
