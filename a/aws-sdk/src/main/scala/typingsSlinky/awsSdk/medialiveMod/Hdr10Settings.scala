package typingsSlinky.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hdr10Settings extends StObject {
  
  /**
    * Maximum Content Light Level
  An integer metadata value defining the maximum light level, in nits,
  of any single pixel within an encoded HDR video stream or file.
    */
  var MaxCll: js.UndefOr[integerMin0Max32768] = js.native
  
  /**
    * Maximum Frame Average Light Level
  An integer metadata value defining the maximum average light level, in nits,
  for any single frame within an encoded HDR video stream or file.
    */
  var MaxFall: js.UndefOr[integerMin0Max32768] = js.native
}
object Hdr10Settings {
  
  @scala.inline
  def apply(): Hdr10Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hdr10Settings]
  }
  
  @scala.inline
  implicit class Hdr10SettingsMutableBuilder[Self <: Hdr10Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCll(value: integerMin0Max32768): Self = StObject.set(x, "MaxCll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCllUndefined: Self = StObject.set(x, "MaxCll", js.undefined)
    
    @scala.inline
    def setMaxFall(value: integerMin0Max32768): Self = StObject.set(x, "MaxFall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxFallUndefined: Self = StObject.set(x, "MaxFall", js.undefined)
  }
}
