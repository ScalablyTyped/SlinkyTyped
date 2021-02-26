package typingsSlinky.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location at the end of a body, header, footer or footnote. The location is
  * immediately before the last newline in the document segment.
  */
@js.native
trait SchemaEndOfSegmentLocation extends StObject {
  
  /**
    * The ID of the header, footer or footnote the location is in. An empty
    * segment ID signifies the document&#39;s body.
    */
  var segmentId: js.UndefOr[String] = js.native
}
object SchemaEndOfSegmentLocation {
  
  @scala.inline
  def apply(): SchemaEndOfSegmentLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEndOfSegmentLocation]
  }
  
  @scala.inline
  implicit class SchemaEndOfSegmentLocationMutableBuilder[Self <: SchemaEndOfSegmentLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSegmentId(value: String): Self = StObject.set(x, "segmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentIdUndefined: Self = StObject.set(x, "segmentId", js.undefined)
  }
}
