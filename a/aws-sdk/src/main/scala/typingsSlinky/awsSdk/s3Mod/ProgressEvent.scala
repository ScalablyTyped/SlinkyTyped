package typingsSlinky.awsSdk.s3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressEvent extends StObject {
  
  /**
    * The Progress event details.
    */
  var Details: js.UndefOr[Progress] = js.native
}
object ProgressEvent {
  
  @scala.inline
  def apply(): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressEvent]
  }
  
  @scala.inline
  implicit class ProgressEventMutableBuilder[Self <: ProgressEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetails(value: Progress): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "Details", js.undefined)
  }
}
