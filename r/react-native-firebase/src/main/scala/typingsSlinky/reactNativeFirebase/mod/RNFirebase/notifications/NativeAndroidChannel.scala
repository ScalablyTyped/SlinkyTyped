package typingsSlinky.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeAndroidChannel extends StObject {
  
  var bypassDnd: js.UndefOr[Boolean] = js.native
  
  var channelId: String = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var group: js.UndefOr[String] = js.native
  
  var importance: Double = js.native
  
  var lightColor: js.UndefOr[String] = js.native
  
  var lightsEnabled: js.UndefOr[Boolean] = js.native
  
  var lockScreenVisibility: js.UndefOr[Double] = js.native
  
  var name: String = js.native
  
  var showBadge: js.UndefOr[Boolean] = js.native
  
  var sound: js.UndefOr[String] = js.native
  
  var vibrationEnabled: js.UndefOr[Boolean] = js.native
  
  var vibrationPattern: js.UndefOr[js.Array[Double]] = js.native
}
object NativeAndroidChannel {
  
  @scala.inline
  def apply(channelId: String, importance: Double, name: String): NativeAndroidChannel = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannel]
  }
  
  @scala.inline
  implicit class NativeAndroidChannelMutableBuilder[Self <: NativeAndroidChannel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBypassDnd(value: Boolean): Self = StObject.set(x, "bypassDnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBypassDndUndefined: Self = StObject.set(x, "bypassDnd", js.undefined)
    
    @scala.inline
    def setChannelId(value: String): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setImportance(value: Double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightColor(value: String): Self = StObject.set(x, "lightColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightColorUndefined: Self = StObject.set(x, "lightColor", js.undefined)
    
    @scala.inline
    def setLightsEnabled(value: Boolean): Self = StObject.set(x, "lightsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightsEnabledUndefined: Self = StObject.set(x, "lightsEnabled", js.undefined)
    
    @scala.inline
    def setLockScreenVisibility(value: Double): Self = StObject.set(x, "lockScreenVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockScreenVisibilityUndefined: Self = StObject.set(x, "lockScreenVisibility", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBadge(value: Boolean): Self = StObject.set(x, "showBadge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowBadgeUndefined: Self = StObject.set(x, "showBadge", js.undefined)
    
    @scala.inline
    def setSound(value: String): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    @scala.inline
    def setVibrationEnabled(value: Boolean): Self = StObject.set(x, "vibrationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrationEnabledUndefined: Self = StObject.set(x, "vibrationEnabled", js.undefined)
    
    @scala.inline
    def setVibrationPattern(value: js.Array[Double]): Self = StObject.set(x, "vibrationPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVibrationPatternUndefined: Self = StObject.set(x, "vibrationPattern", js.undefined)
    
    @scala.inline
    def setVibrationPatternVarargs(value: Double*): Self = StObject.set(x, "vibrationPattern", js.Array(value :_*))
  }
}
