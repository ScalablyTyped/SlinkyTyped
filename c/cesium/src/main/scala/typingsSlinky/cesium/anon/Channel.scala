package typingsSlinky.cesium.anon

import typingsSlinky.cesium.mod.Resource
import typingsSlinky.cesium.mod.TileDiscardPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends StObject {
  
  var channel: Double = js.native
  
  var ellipsoid: js.UndefOr[typingsSlinky.cesium.mod.Ellipsoid] = js.native
  
  var maximumLevel: js.UndefOr[Double] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  var tileDiscardPolicy: js.UndefOr[TileDiscardPolicy] = js.native
  
  var url: Resource | String = js.native
}
object Channel {
  
  @scala.inline
  def apply(channel: Double, url: Resource | String): Channel = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Double): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoid(value: typingsSlinky.cesium.mod.Ellipsoid): Self = StObject.set(x, "ellipsoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEllipsoidUndefined: Self = StObject.set(x, "ellipsoid", js.undefined)
    
    @scala.inline
    def setMaximumLevel(value: Double): Self = StObject.set(x, "maximumLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumLevelUndefined: Self = StObject.set(x, "maximumLevel", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setTileDiscardPolicy(value: TileDiscardPolicy): Self = StObject.set(x, "tileDiscardPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTileDiscardPolicyUndefined: Self = StObject.set(x, "tileDiscardPolicy", js.undefined)
    
    @scala.inline
    def setUrl(value: Resource | String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
