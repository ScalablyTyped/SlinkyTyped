package typingsSlinky.baseui.anon

import typingsSlinky.baseui.baseuiStrings.horizontal
import typingsSlinky.baseui.baseuiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Desktop extends StObject {
  
  var desktop: js.UndefOr[horizontal | vertical] = js.native
  
  var mobile: js.UndefOr[horizontal | vertical] = js.native
}
object Desktop {
  
  @scala.inline
  def apply(): Desktop = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Desktop]
  }
  
  @scala.inline
  implicit class DesktopMutableBuilder[Self <: Desktop] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesktop(value: horizontal | vertical): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    @scala.inline
    def setMobile(value: horizontal | vertical): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
  }
}
