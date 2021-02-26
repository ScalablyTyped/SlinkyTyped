package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EqlSearch[T] extends Generic {
  
  var body: T = js.native
  
  var index: String = js.native
  
  var keep_alive: js.UndefOr[String] = js.native
  
  var keep_on_completion: js.UndefOr[Boolean] = js.native
  
  var wait_for_completion_timeout: js.UndefOr[String] = js.native
}
object EqlSearch {
  
  @scala.inline
  def apply[T](body: T, index: String): EqlSearch[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[EqlSearch[T]]
  }
  
  @scala.inline
  implicit class EqlSearchMutableBuilder[Self <: EqlSearch[_], T] (val x: Self with EqlSearch[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_alive(value: String): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    @scala.inline
    def setKeep_on_completion(value: Boolean): Self = StObject.set(x, "keep_on_completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeep_on_completionUndefined: Self = StObject.set(x, "keep_on_completion", js.undefined)
    
    @scala.inline
    def setWait_for_completion_timeout(value: String): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
  }
}
