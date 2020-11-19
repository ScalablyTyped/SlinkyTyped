package typingsSlinky.expoStatusBarHeight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@expo/status-bar-height", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  val default: StatusBarHeight = js.native
  
  @js.native
  class StatusBarHeight () extends js.Object {
    
    /**
      * Add 'willChange' event listener
      */
    def addEventListener(handler: StatusBarHeightHandler): Unit = js.native
    
    /**
      * Get the current status bar height
      */
    def getAsync(): js.Promise[Double] = js.native
    
    /**
      * Remove 'willChange' event listener
      */
    def removeEventListener(handler: StatusBarHeightHandler): Unit = js.native
  }
  
  type StatusBarHeightHandler = js.Function1[/* height */ Double, Unit]
}
