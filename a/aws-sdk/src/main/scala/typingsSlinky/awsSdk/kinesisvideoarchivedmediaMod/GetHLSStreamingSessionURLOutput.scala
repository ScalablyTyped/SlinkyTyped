package typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetHLSStreamingSessionURLOutput extends StObject {
  
  /**
    * The URL (containing the session token) that a media player can use to retrieve the HLS master playlist.
    */
  var HLSStreamingSessionURL: js.UndefOr[typingsSlinky.awsSdk.kinesisvideoarchivedmediaMod.HLSStreamingSessionURL] = js.native
}
object GetHLSStreamingSessionURLOutput {
  
  @scala.inline
  def apply(): GetHLSStreamingSessionURLOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetHLSStreamingSessionURLOutput]
  }
  
  @scala.inline
  implicit class GetHLSStreamingSessionURLOutputMutableBuilder[Self <: GetHLSStreamingSessionURLOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHLSStreamingSessionURL(value: HLSStreamingSessionURL): Self = StObject.set(x, "HLSStreamingSessionURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHLSStreamingSessionURLUndefined: Self = StObject.set(x, "HLSStreamingSessionURL", js.undefined)
  }
}
