package typingsSlinky.meteor.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdGeneration[T, U] extends StObject {
  
  var connection: js.UndefOr[js.Object | Null] = js.native
  
  var idGeneration: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[js.Function1[/* doc */ T, U]] = js.native
}
object IdGeneration {
  
  @scala.inline
  def apply[T, U](): IdGeneration[T, U] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IdGeneration[T, U]]
  }
  
  @scala.inline
  implicit class IdGenerationMutableBuilder[Self <: IdGeneration[_, _], T, U] (val x: Self with (IdGeneration[T, U])) extends AnyVal {
    
    @scala.inline
    def setConnection(value: js.Object): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionNull: Self = StObject.set(x, "connection", null)
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setIdGeneration(value: String): Self = StObject.set(x, "idGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdGenerationUndefined: Self = StObject.set(x, "idGeneration", js.undefined)
    
    @scala.inline
    def setTransform(value: /* doc */ T => U): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
