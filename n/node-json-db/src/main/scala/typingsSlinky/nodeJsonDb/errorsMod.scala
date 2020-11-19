package typingsSlinky.nodeJsonDb

import typingsSlinky.std.Error
import typingsSlinky.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-json-db/dist/lib/Errors", JSImport.Namespace)
@js.native
object errorsMod extends js.Object {
  
  @js.native
  class DataError () extends NestedError
  
  @js.native
  class DatabaseError () extends NestedError
  
  @js.native
  abstract class NestedError protected () extends Error {
    def this(message: String, id: Number) = this()
    def this(message: String, id: Number, inner: js.Error) = this()
    
    val id: Number = js.native
    
    val inner: js.UndefOr[js.Error] = js.native
  }
}
