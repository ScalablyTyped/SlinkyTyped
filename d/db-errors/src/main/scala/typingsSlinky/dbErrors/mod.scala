package typingsSlinky.dbErrors

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("db-errors", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def wrapError(err: js.Error): DBError = js.native
  
  @js.native
  class CheckViolationError () extends DBError {
    
    var constraint: String = js.native
    
    var table: String = js.native
  }
  
  @js.native
  class ConstraintViolationError () extends DBError
  
  @js.native
  class DBError () extends Error {
    
    var nativeError: js.Error = js.native
  }
  
  @js.native
  class DataError () extends DBError
  
  @js.native
  class ForeignKeyViolationError () extends DBError {
    
    var constraint: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @js.native
  class NotNullViolationError () extends DBError {
    
    var column: String = js.native
    
    var database: js.UndefOr[String] = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
  
  @js.native
  class UniqueViolationError () extends DBError {
    
    var columns: js.Array[String] = js.native
    
    var constraint: String = js.native
    
    var schema: js.UndefOr[String] = js.native
    
    var table: String = js.native
  }
}
