package typingsSlinky.chromeApps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBC extends StObject {
  
  var PBC: typingsSlinky.chromeApps.chromeAppsStrings.PBC = js.native
  
  var PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN = js.native
}
object PBC {
  
  @scala.inline
  def apply(
    PBC: typingsSlinky.chromeApps.chromeAppsStrings.PBC,
    PIN: typingsSlinky.chromeApps.chromeAppsStrings.PIN
  ): PBC = {
    val __obj = js.Dynamic.literal(PBC = PBC.asInstanceOf[js.Any], PIN = PIN.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBC]
  }
  
  @scala.inline
  implicit class PBCMutableBuilder[Self <: PBC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPBC(value: typingsSlinky.chromeApps.chromeAppsStrings.PBC): Self = StObject.set(x, "PBC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPIN(value: typingsSlinky.chromeApps.chromeAppsStrings.PIN): Self = StObject.set(x, "PIN", value.asInstanceOf[js.Any])
  }
}
