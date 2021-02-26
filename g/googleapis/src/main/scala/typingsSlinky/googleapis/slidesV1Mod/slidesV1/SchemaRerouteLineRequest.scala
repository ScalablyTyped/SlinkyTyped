package typingsSlinky.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Reroutes a line such that it&#39;s connected at the two closest connection
  * sites on the connected page elements.
  */
@js.native
trait SchemaRerouteLineRequest extends StObject {
  
  /**
    * The object ID of the line to reroute.  Only a line with a category
    * indicating it is a &quot;connector&quot; can be rerouted. The start and
    * end connections of the line must be on different page elements.
    */
  var objectId: js.UndefOr[String] = js.native
}
object SchemaRerouteLineRequest {
  
  @scala.inline
  def apply(): SchemaRerouteLineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRerouteLineRequest]
  }
  
  @scala.inline
  implicit class SchemaRerouteLineRequestMutableBuilder[Self <: SchemaRerouteLineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
  }
}
