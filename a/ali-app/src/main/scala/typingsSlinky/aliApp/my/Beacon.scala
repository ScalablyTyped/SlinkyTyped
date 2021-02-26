package typingsSlinky.aliApp.my

import typingsSlinky.aliApp.aliAppNumbers.`0`
import typingsSlinky.aliApp.aliAppNumbers.`1`
import typingsSlinky.aliApp.aliAppNumbers.`2`
import typingsSlinky.aliApp.aliAppNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Beacon extends StObject {
  
  /** iBeacon 设备的距离 */
  var accuracy: Double = js.native
  
  /** iBeacon 设备的主 id */
  var major: String = js.native
  
  /** iBeacon 设备的次 id */
  var minor: String = js.native
  
  /** 表示设备距离的枚举值(0-3分别代表：未知、极近、近、远) */
  var proximity: `0` | `1` | `2` | `3` = js.native
  
  /** iBeacon 信号强度 */
  var rssi: Double = js.native
  
  /** iBeacon 设备广播的 uuid */
  var uuid: String = js.native
}
object Beacon {
  
  @scala.inline
  def apply(
    accuracy: Double,
    major: String,
    minor: String,
    proximity: `0` | `1` | `2` | `3`,
    rssi: Double,
    uuid: String
  ): Beacon = {
    val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], proximity = proximity.asInstanceOf[js.Any], rssi = rssi.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacon]
  }
  
  @scala.inline
  implicit class BeaconMutableBuilder[Self <: Beacon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMajor(value: String): Self = StObject.set(x, "major", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinor(value: String): Self = StObject.set(x, "minor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximity(value: `0` | `1` | `2` | `3`): Self = StObject.set(x, "proximity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRssi(value: Double): Self = StObject.set(x, "rssi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
  }
}
