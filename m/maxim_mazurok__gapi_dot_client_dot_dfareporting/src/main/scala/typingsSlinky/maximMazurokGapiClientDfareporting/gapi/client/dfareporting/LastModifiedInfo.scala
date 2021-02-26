package typingsSlinky.maximMazurokGapiClientDfareporting.gapi.client.dfareporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LastModifiedInfo extends StObject {
  
  /** Timestamp of the last change in milliseconds since epoch. */
  var time: js.UndefOr[String] = js.native
}
object LastModifiedInfo {
  
  @scala.inline
  def apply(): LastModifiedInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastModifiedInfo]
  }
  
  @scala.inline
  implicit class LastModifiedInfoMutableBuilder[Self <: LastModifiedInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}
