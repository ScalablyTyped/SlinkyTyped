package typingsSlinky.oracledb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used with connection.executeMany() to define a bind variable's types, sizes and directions.
  */
@js.native
trait BindDefinition extends StObject {
  
  /**
    * The direction of the bind. One of the Execute Bind Direction Constants.
    *
    * @default BIND_IN
    */
  var dir: js.UndefOr[Double] = js.native
  
  /**
    * Required for Strings and Buffers. Ignored for other types. Specifies the maximum number of bytes
    * allocated when processing each value of this bind variable. When data is being passed into the database,
    * maxSize should be at least the size of the longest value. When data is being returned from the database,
    * maxSize should be the size of the longest value. If maxSize is too small, executeMany() will throw an
    * error that is not handled by batchErrors.
    */
  var maxSize: js.UndefOr[Double] = js.native
  
  /**
    * The node-oracledb or JavaScript data type to be bound. One of the Node-oracledb Type Constants.
    */
  var `type`: js.UndefOr[Double] = js.native
}
object BindDefinition {
  
  @scala.inline
  def apply(): BindDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BindDefinition]
  }
  
  @scala.inline
  implicit class BindDefinitionMutableBuilder[Self <: BindDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDir(value: Double): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
    
    @scala.inline
    def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
