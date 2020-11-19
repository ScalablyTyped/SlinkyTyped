package typingsSlinky.burns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * Type Alias for event handlers
    */
  type EventHandler = typingsSlinky.burns.mod.Handlers | (typingsSlinky.std.Record[java.lang.String, typingsSlinky.burns.mod.Handlers])
  
  /**
    * Function type for handling events
    */
  type HandlerFn = js.Function1[/* payload */ js.UndefOr[js.Any], js.Any]
  
  /**
    * This Type is an alias to the multiple
    * parameter types the `registerEvent` method accepts
    */
  type Handlers = java.lang.String | typingsSlinky.burns.mod.HandlerFn | js.Array[typingsSlinky.burns.mod.HandlerFn]
}
