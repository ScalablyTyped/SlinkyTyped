package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes the spatial position of a visual widget inside a video. It is a
  * union of various position types, out of which only will be set one.
  */
@js.native
trait SchemaInvideoPosition extends StObject {
  
  /**
    * Describes in which corner of the video the visual widget will appear.
    */
  var cornerPosition: js.UndefOr[String] = js.native
  
  /**
    * Defines the position type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaInvideoPosition {
  
  @scala.inline
  def apply(): SchemaInvideoPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInvideoPosition]
  }
  
  @scala.inline
  implicit class SchemaInvideoPositionMutableBuilder[Self <: SchemaInvideoPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCornerPosition(value: String): Self = StObject.set(x, "cornerPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCornerPositionUndefined: Self = StObject.set(x, "cornerPosition", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
