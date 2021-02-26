package typingsSlinky.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineObject extends StObject {
  
  /**
    * Key-value pairs that define the properties of the object.
    */
  var fields: fieldList = js.native
  
  /**
    * The ID of the object.
    */
  var id: typingsSlinky.awsSdk.datapipelineMod.id = js.native
  
  /**
    * The name of the object.
    */
  var name: id = js.native
}
object PipelineObject {
  
  @scala.inline
  def apply(fields: fieldList, id: id, name: id): PipelineObject = {
    val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelineObject]
  }
  
  @scala.inline
  implicit class PipelineObjectMutableBuilder[Self <: PipelineObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: fieldList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setId(value: id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: id): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
