package typingsSlinky.maximMazurokGapiClientDataflow.gapi.client.dataflow

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedLocation extends StObject {
  
  /** The name of the [regional endpoint] (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that failed to respond. */
  var name: js.UndefOr[String] = js.native
}
object FailedLocation {
  
  @scala.inline
  def apply(): FailedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedLocation]
  }
  
  @scala.inline
  implicit class FailedLocationMutableBuilder[Self <: FailedLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
