package typingsSlinky.gapiDrive.gapi.client.drive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GenerateIdsParameters extends StObject {
  
  var maxResults: js.UndefOr[Double] = js.native
  
  var space: js.UndefOr[String] = js.native
}
object GenerateIdsParameters {
  
  @scala.inline
  def apply(): GenerateIdsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateIdsParameters]
  }
  
  @scala.inline
  implicit class GenerateIdsParametersMutableBuilder[Self <: GenerateIdsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: Double): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setSpace(value: String): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
  }
}
