package typingsSlinky.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentReference extends StObject {
  
  /**
    * The unique identifier for the segment.
    */
  var Id: string = js.native
  
  /**
    * The version number of the segment.
    */
  var Version: js.UndefOr[integer] = js.native
}
object SegmentReference {
  
  @scala.inline
  def apply(Id: string): SegmentReference = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentReference]
  }
  
  @scala.inline
  implicit class SegmentReferenceMutableBuilder[Self <: SegmentReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: integer): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "Version", js.undefined)
  }
}
