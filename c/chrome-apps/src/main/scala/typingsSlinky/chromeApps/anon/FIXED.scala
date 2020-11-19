package typingsSlinky.chromeApps.anon

import typingsSlinky.chromeApps.chromeAppsStrings.fixed_
import typingsSlinky.chromeApps.chromeAppsStrings.removable_
import typingsSlinky.chromeApps.chromeAppsStrings.unknown__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FIXED extends js.Object {
  
  var FIXED: fixed_ = js.native
  
  var REMOVABLE: removable_ = js.native
  
  var UNKNOWN: unknown__ = js.native
}
object FIXED {
  
  @scala.inline
  def apply(FIXED: fixed_, REMOVABLE: removable_, UNKNOWN: unknown__): FIXED = {
    val __obj = js.Dynamic.literal(FIXED = FIXED.asInstanceOf[js.Any], REMOVABLE = REMOVABLE.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[FIXED]
  }
  
  @scala.inline
  implicit class FIXEDOps[Self <: FIXED] (val x: Self) extends AnyVal {
    
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
    def setFIXED(value: fixed_): Self = this.set("FIXED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREMOVABLE(value: removable_): Self = this.set("REMOVABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: unknown__): Self = this.set("UNKNOWN", value.asInstanceOf[js.Any])
  }
}
