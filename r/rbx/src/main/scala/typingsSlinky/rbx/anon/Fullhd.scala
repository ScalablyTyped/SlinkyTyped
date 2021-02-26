package typingsSlinky.rbx.anon

import typingsSlinky.rbx.columnMod.ColumnBreakpointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fullhd extends StObject {
  
  var desktop: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var fullhd: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var mobile: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var tablet: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var touch: js.UndefOr[ColumnBreakpointOptions] = js.native
  
  var widescreen: js.UndefOr[ColumnBreakpointOptions] = js.native
}
object Fullhd {
  
  @scala.inline
  def apply(): Fullhd = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fullhd]
  }
  
  @scala.inline
  implicit class FullhdMutableBuilder[Self <: Fullhd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesktop(value: ColumnBreakpointOptions): Self = StObject.set(x, "desktop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesktopUndefined: Self = StObject.set(x, "desktop", js.undefined)
    
    @scala.inline
    def setFullhd(value: ColumnBreakpointOptions): Self = StObject.set(x, "fullhd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullhdUndefined: Self = StObject.set(x, "fullhd", js.undefined)
    
    @scala.inline
    def setMobile(value: ColumnBreakpointOptions): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    @scala.inline
    def setTablet(value: ColumnBreakpointOptions): Self = StObject.set(x, "tablet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabletUndefined: Self = StObject.set(x, "tablet", js.undefined)
    
    @scala.inline
    def setTouch(value: ColumnBreakpointOptions): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchUndefined: Self = StObject.set(x, "touch", js.undefined)
    
    @scala.inline
    def setWidescreen(value: ColumnBreakpointOptions): Self = StObject.set(x, "widescreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidescreenUndefined: Self = StObject.set(x, "widescreen", js.undefined)
  }
}
