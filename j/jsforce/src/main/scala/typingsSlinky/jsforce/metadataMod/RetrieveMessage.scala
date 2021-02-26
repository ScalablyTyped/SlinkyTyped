package typingsSlinky.jsforce.metadataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrieveMessage extends StObject {
  
  var fileName: String = js.native
  
  var problem: String = js.native
}
object RetrieveMessage {
  
  @scala.inline
  def apply(fileName: String, problem: String): RetrieveMessage = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], problem = problem.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetrieveMessage]
  }
  
  @scala.inline
  implicit class RetrieveMessageMutableBuilder[Self <: RetrieveMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProblem(value: String): Self = StObject.set(x, "problem", value.asInstanceOf[js.Any])
  }
}
