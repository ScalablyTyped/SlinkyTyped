package typingsSlinky.googleapis.youtubeV3Mod.youtubeV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Settings and Info of the monitor stream
  */
@js.native
trait SchemaMonitorStreamInfo extends StObject {
  
  /**
    * If you have set the enableMonitorStream property to true, then this
    * property determines the length of the live broadcast delay.
    */
  var broadcastStreamDelayMs: js.UndefOr[Double] = js.native
  
  /**
    * HTML code that embeds a player that plays the monitor stream.
    */
  var embedHtml: js.UndefOr[String] = js.native
  
  /**
    * This value determines whether the monitor stream is enabled for the
    * broadcast. If the monitor stream is enabled, then YouTube will broadcast
    * the event content on a special stream intended only for the
    * broadcaster&#39;s consumption. The broadcaster can use the stream to
    * review the event content and also to identify the optimal times to insert
    * cuepoints.  You need to set this value to true if you intend to have a
    * broadcast delay for your event.  Note: This property cannot be updated
    * once the broadcast is in the testing or live state.
    */
  var enableMonitorStream: js.UndefOr[Boolean] = js.native
}
object SchemaMonitorStreamInfo {
  
  @scala.inline
  def apply(): SchemaMonitorStreamInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMonitorStreamInfo]
  }
  
  @scala.inline
  implicit class SchemaMonitorStreamInfoMutableBuilder[Self <: SchemaMonitorStreamInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBroadcastStreamDelayMs(value: Double): Self = StObject.set(x, "broadcastStreamDelayMs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBroadcastStreamDelayMsUndefined: Self = StObject.set(x, "broadcastStreamDelayMs", js.undefined)
    
    @scala.inline
    def setEmbedHtml(value: String): Self = StObject.set(x, "embedHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmbedHtmlUndefined: Self = StObject.set(x, "embedHtml", js.undefined)
    
    @scala.inline
    def setEnableMonitorStream(value: Boolean): Self = StObject.set(x, "enableMonitorStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMonitorStreamUndefined: Self = StObject.set(x, "enableMonitorStream", js.undefined)
  }
}
