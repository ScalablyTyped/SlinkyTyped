package typingsSlinky.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deferredMod {
  
  @JSImport("babylonjs/Misc/deferred", "Deferred")
  @js.native
  /**
    * Constructor for this deferred object.
    */
  class Deferred[T] () extends StObject {
    
    var _reject: js.Any = js.native
    
    var _resolve: js.Any = js.native
    
    /**
      * The promise associated with this deferred object.
      */
    val promise: js.Promise[T] = js.native
    
    /**
      * The reject method of the promise associated with this deferred object.
      */
    def reject: js.Function1[/* reason */ js.UndefOr[js.Any], Unit] = js.native
    
    /**
      * The resolve method of the promise associated with this deferred object.
      */
    def resolve: js.Function1[/* value */ js.UndefOr[T | js.Thenable[T]], Unit] = js.native
  }
}
