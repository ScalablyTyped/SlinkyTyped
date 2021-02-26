package typingsSlinky.operationRetrier

import typingsSlinky.operationRetrier.anon.Initial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Provides retrier service
    */
  @JSImport("operation-retrier", JSImport.Default)
  @js.native
  class default protected ()
    extends typingsSlinky.operationRetrier.retrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
  
  @JSImport("operation-retrier", "Backoff")
  @js.native
  class Backoff protected ()
    extends typingsSlinky.operationRetrier.backoffMod.Backoff {
    def this(options: js.Any) = this()
  }
  object Backoff {
    
    /* static member */
    @JSImport("operation-retrier", "Backoff.exponential")
    @js.native
    def exponential(options: js.Any): typingsSlinky.operationRetrier.backoffMod.Backoff = js.native
  }
  
  /**
    * Provides retrier service
    */
  @JSImport("operation-retrier", "Retrier")
  @js.native
  class Retrier protected ()
    extends typingsSlinky.operationRetrier.retrierMod.Retrier {
    /**
      * Creates a new Retrier instance
      */
    def this(options: Initial) = this()
  }
}
