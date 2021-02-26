package typingsSlinky.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RetrievalImportance extends StObject {
  
  /** Indicates the ranking importance given to property when it is matched during retrieval. Once set, the token importance of a property cannot be changed. */
  var importance: js.UndefOr[String] = js.native
}
object RetrievalImportance {
  
  @scala.inline
  def apply(): RetrievalImportance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RetrievalImportance]
  }
  
  @scala.inline
  implicit class RetrievalImportanceMutableBuilder[Self <: RetrievalImportance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportance(value: String): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
  }
}
