package typingsSlinky.samchon

import typingsSlinky.samchon.entityMod.Entity
import typingsSlinky.samchon.invokeMod.Invoke
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeHistoryMod {
  
  @JSImport("samchon/templates/slave/InvokeHistory", "InvokeHistory")
  @js.native
  /**
    * Default Constructor.
    */
  class InvokeHistory () extends Entity {
    /**
      * Construct from an {@link Invoke} message.
      *
      * @param invoke An {@link Invoke} message requesting a *parallel or distributed process*.
      */
    def this(invoke: Invoke) = this()
    
    /**
      * Complete the history.
      *
      * Completes the history and determines the {@link getEndTime end time}.
      */
    def complete(): Unit = js.native
    
    /**
      * Compute elapsed time.
      *
      * @return nanoseconds.
      */
    def computeElapsedTime(): Double = js.native
    
    /**
      * @hidden
      */
    var end_time_ : js.Any = js.native
    
    /**
      * Get end time.
      */
    def getEndTime(): js.Date = js.native
    
    /**
      * Get {@link Invoke.getListener listener} of the {@link Invoke} message.
      */
    def getListener(): String = js.native
    
    /**
      * Get start time.
      */
    def getStartTime(): js.Date = js.native
    
    /**
      * Get unique ID.
      */
    def getUID(): Double = js.native
    
    /**
      * @hidden
      */
    var listener: js.Any = js.native
    
    /**
      * @hidden
      */
    var start_time_ : js.Any = js.native
    
    /**
      * Convert to an {@link Invoke} message.
      *
      * Creates and returns an {@link Invoke} message that is used to reporting to the **master**.
      */
    def toInvoke(): Invoke = js.native
    
    /**
      * @hidden
      */
    var uid: js.Any = js.native
  }
}
