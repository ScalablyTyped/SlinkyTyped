package typingsSlinky.procfsStats.mod

import typingsSlinky.procfsStats.anon.Discardedpackets
import typingsSlinky.procfsStats.anon.Missed
import typingsSlinky.procfsStats.anon.Quality
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Wifi extends StObject {
  
  var Interface: String = js.native
  
  var beacon: Missed = js.native
  
  var crypt: Discardedpackets = js.native
  
  var frag: Discardedpackets = js.native
  
  var level: Quality = js.native
  
  var link: Quality = js.native
  
  var misc: Discardedpackets = js.native
  
  var noise: Quality = js.native
  
  var nwid: Discardedpackets = js.native
  
  var retry: Discardedpackets = js.native
  
  var status: String = js.native
}
object Wifi {
  
  @scala.inline
  def apply(
    Interface: String,
    beacon: Missed,
    crypt: Discardedpackets,
    frag: Discardedpackets,
    level: Quality,
    link: Quality,
    misc: Discardedpackets,
    noise: Quality,
    nwid: Discardedpackets,
    retry: Discardedpackets,
    status: String
  ): Wifi = {
    val __obj = js.Dynamic.literal(Interface = Interface.asInstanceOf[js.Any], beacon = beacon.asInstanceOf[js.Any], crypt = crypt.asInstanceOf[js.Any], frag = frag.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], misc = misc.asInstanceOf[js.Any], noise = noise.asInstanceOf[js.Any], nwid = nwid.asInstanceOf[js.Any], retry = retry.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Wifi]
  }
  
  @scala.inline
  implicit class WifiMutableBuilder[Self <: Wifi] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeacon(value: Missed): Self = StObject.set(x, "beacon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrypt(value: Discardedpackets): Self = StObject.set(x, "crypt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrag(value: Discardedpackets): Self = StObject.set(x, "frag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterface(value: String): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevel(value: Quality): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLink(value: Quality): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMisc(value: Discardedpackets): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoise(value: Quality): Self = StObject.set(x, "noise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNwid(value: Discardedpackets): Self = StObject.set(x, "nwid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetry(value: Discardedpackets): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
