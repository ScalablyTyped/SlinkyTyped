package typingsSlinky.precise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("precise", JSImport.Namespace)
  @js.native
  def apply(): Precise = js.native
  
  @JSImport("precise", "Precise")
  @js.native
  class Precise () extends StObject {
    
    /**
      * Returns the nanoseconds from `start()` to `stop()`
      */
    def diff(): Double = js.native
    
    /**
      * Starts a timer
      */
    def start(): Precise = js.native
    
    /**
      * Stops a timer
      */
    def stop(): Precise = js.native
  }
}
