package typingsSlinky.chromeApps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBC extends js.Object {
  
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
  implicit class PBCOps[Self <: PBC] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPBC(value: typingsSlinky.chromeApps.chromeAppsStrings.PBC): Self = this.set("PBC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPIN(value: typingsSlinky.chromeApps.chromeAppsStrings.PIN): Self = this.set("PIN", value.asInstanceOf[js.Any])
  }
}
