package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MlEvaluateDataFrame[T] extends Generic {
  
  var body: T = js.native
}
object MlEvaluateDataFrame {
  
  @scala.inline
  def apply[T](body: T): MlEvaluateDataFrame[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrame[T]]
  }
  
  @scala.inline
  implicit class MlEvaluateDataFrameMutableBuilder[Self <: MlEvaluateDataFrame[_], T] (val x: Self with MlEvaluateDataFrame[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
  }
}
