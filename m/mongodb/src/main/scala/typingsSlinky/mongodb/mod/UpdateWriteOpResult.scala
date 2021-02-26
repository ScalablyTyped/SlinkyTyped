package typingsSlinky.mongodb.mod

import typingsSlinky.mongodb.anon.IdObjectId
import typingsSlinky.mongodb.anon.NModified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateWriteOpResult extends StObject {
  
  var connection: js.Any = js.native
  
  var matchedCount: scala.Double = js.native
  
  var modifiedCount: scala.Double = js.native
  
  var result: NModified = js.native
  
  var upsertedCount: scala.Double = js.native
  
  var upsertedId: IdObjectId = js.native
}
object UpdateWriteOpResult {
  
  @scala.inline
  def apply(
    connection: js.Any,
    matchedCount: scala.Double,
    modifiedCount: scala.Double,
    result: NModified,
    upsertedCount: scala.Double,
    upsertedId: IdObjectId
  ): UpdateWriteOpResult = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], matchedCount = matchedCount.asInstanceOf[js.Any], modifiedCount = modifiedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], upsertedCount = upsertedCount.asInstanceOf[js.Any], upsertedId = upsertedId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWriteOpResult]
  }
  
  @scala.inline
  implicit class UpdateWriteOpResultMutableBuilder[Self <: UpdateWriteOpResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedCount(value: scala.Double): Self = StObject.set(x, "matchedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedCount(value: scala.Double): Self = StObject.set(x, "modifiedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: NModified): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedCount(value: scala.Double): Self = StObject.set(x, "upsertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpsertedId(value: IdObjectId): Self = StObject.set(x, "upsertedId", value.asInstanceOf[js.Any])
  }
}
