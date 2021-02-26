package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlGetCategories[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var category_id: js.UndefOr[Double] = js.native
  
  var from: js.UndefOr[Double] = js.native
  
  var job_id: String = js.native
  
  var partition_field_value: js.UndefOr[String] = js.native
  
  var size: js.UndefOr[Double] = js.native
}
object MlGetCategories {
  
  @scala.inline
  def apply[T](job_id: String): MlGetCategories[T] = {
    val __obj = js.Dynamic.literal(job_id = job_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlGetCategories[T]]
  }
  
  @scala.inline
  implicit class MlGetCategoriesMutableBuilder[Self <: MlGetCategories[_], T] (val x: Self with MlGetCategories[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCategory_id(value: Double): Self = StObject.set(x, "category_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategory_idUndefined: Self = StObject.set(x, "category_id", js.undefined)
    
    @scala.inline
    def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition_field_value(value: String): Self = StObject.set(x, "partition_field_value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartition_field_valueUndefined: Self = StObject.set(x, "partition_field_value", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
