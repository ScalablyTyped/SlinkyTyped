package typingsSlinky.elasticElasticsearch.requestParamsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CcrResumeFollow[T] extends Generic {
  
  var body: js.UndefOr[T] = js.native
  
  var index: String = js.native
}
object CcrResumeFollow {
  
  @scala.inline
  def apply[T](index: String): CcrResumeFollow[T] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
    __obj.asInstanceOf[CcrResumeFollow[T]]
  }
  
  @scala.inline
  implicit class CcrResumeFollowMutableBuilder[Self <: CcrResumeFollow[_], T] (val x: Self with CcrResumeFollow[T]) extends AnyVal {
    
    @scala.inline
    def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
  }
}
