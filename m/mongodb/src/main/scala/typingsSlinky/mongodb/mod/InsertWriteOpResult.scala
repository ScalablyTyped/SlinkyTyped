package typingsSlinky.mongodb.mod

import org.scalablytyped.runtime.NumberDictionary
import typingsSlinky.mongodb.anon.IdAny
import typingsSlinky.mongodb.anon.Ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsertWriteOpResult[TSchema /* <: IdAny */] extends StObject {
  
  var connection: js.Any = js.native
  
  var insertedCount: scala.Double = js.native
  
  var insertedIds: NumberDictionary[
    /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
  ] = js.native
  
  var ops: js.Array[TSchema] = js.native
  
  var result: Ok = js.native
}
object InsertWriteOpResult {
  
  @scala.inline
  def apply[TSchema /* <: IdAny */](
    connection: js.Any,
    insertedCount: scala.Double,
    insertedIds: NumberDictionary[
      /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
    ],
    ops: js.Array[TSchema],
    result: Ok
  ): InsertWriteOpResult[TSchema] = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], insertedCount = insertedCount.asInstanceOf[js.Any], insertedIds = insertedIds.asInstanceOf[js.Any], ops = ops.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertWriteOpResult[TSchema]]
  }
  
  @scala.inline
  implicit class InsertWriteOpResultMutableBuilder[Self <: InsertWriteOpResult[_], TSchema /* <: IdAny */] (val x: Self with InsertWriteOpResult[TSchema]) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Any): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedCount(value: scala.Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertedIds(
      value: NumberDictionary[
          /* import warning: importer.ImportType#apply Failed type conversion: TSchema['_id'] */ js.Any
        ]
    ): Self = StObject.set(x, "insertedIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOps(value: js.Array[TSchema]): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsVarargs(value: TSchema*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setResult(value: Ok): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
