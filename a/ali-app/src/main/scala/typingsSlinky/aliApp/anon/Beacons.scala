package typingsSlinky.aliApp.anon

import typingsSlinky.aliApp.my.Beacon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Beacons extends StObject {
  
  var beacons: js.Array[Beacon] = js.native
}
object Beacons {
  
  @scala.inline
  def apply(beacons: js.Array[Beacon]): Beacons = {
    val __obj = js.Dynamic.literal(beacons = beacons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Beacons]
  }
  
  @scala.inline
  implicit class BeaconsMutableBuilder[Self <: Beacons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacons(value: js.Array[Beacon]): Self = StObject.set(x, "beacons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeaconsVarargs(value: Beacon*): Self = StObject.set(x, "beacons", js.Array(value :_*))
  }
}
