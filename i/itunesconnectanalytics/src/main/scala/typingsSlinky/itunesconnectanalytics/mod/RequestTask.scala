package typingsSlinky.itunesconnectanalytics.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestTask extends StObject {
  
  def completed(error: js.Error, body: String): Unit = js.native
  
  var query: String = js.native
}
object RequestTask {
  
  @scala.inline
  def apply(completed: (js.Error, String) => Unit, query: String): RequestTask = {
    val __obj = js.Dynamic.literal(completed = js.Any.fromFunction2(completed), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestTask]
  }
  
  @scala.inline
  implicit class RequestTaskMutableBuilder[Self <: RequestTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompleted(value: (js.Error, String) => Unit): Self = StObject.set(x, "completed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
