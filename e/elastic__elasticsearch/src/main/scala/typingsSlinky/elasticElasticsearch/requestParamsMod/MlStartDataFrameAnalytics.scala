package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlStartDataFrameAnalytics[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var id: String = js.native
  
  var timeout: js.UndefOr[String] = js.native
}
object MlStartDataFrameAnalytics {
  
  @scala.inline
  def apply[T](id: String): MlStartDataFrameAnalytics[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlStartDataFrameAnalytics[T]]
  }
  
  @scala.inline
  implicit class MlStartDataFrameAnalyticsMutableBuilder[Self <: MlStartDataFrameAnalytics[_], T] (val x: Self with MlStartDataFrameAnalytics[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
