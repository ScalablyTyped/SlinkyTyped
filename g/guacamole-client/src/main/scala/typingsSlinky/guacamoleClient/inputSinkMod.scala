package typingsSlinky.guacamoleClient

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputSinkMod {
  
  @JSImport("guacamole-client/lib/InputSink", "InputSink")
  @js.native
  class InputSink () extends StObject {
    
    /**
      * Attempts to focus the underlying input field. The focus attempt occurs
      * asynchronously, and may silently fail depending on browser restrictions.
      */
    def focus(): Unit = js.native
    
    /**
      * Returns the underlying input field. This input field MUST be manually
      * added to the DOM for the Guacamole.InputSink to have any effect.
      */
    def getElement(): HTMLElement = js.native
  }
}
