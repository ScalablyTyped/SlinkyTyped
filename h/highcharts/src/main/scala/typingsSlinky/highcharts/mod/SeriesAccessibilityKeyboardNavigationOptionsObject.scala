package typingsSlinky.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SeriesAccessibilityKeyboardNavigationOptionsObject extends js.Object {
  
  /**
    * (Highstock) Enable/disable keyboard navigation support for a specific
    * series.
    */
  var enabled: js.UndefOr[Boolean] = js.native
}
object SeriesAccessibilityKeyboardNavigationOptionsObject {
  
  @scala.inline
  def apply(): SeriesAccessibilityKeyboardNavigationOptionsObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SeriesAccessibilityKeyboardNavigationOptionsObject]
  }
  
  @scala.inline
  implicit class SeriesAccessibilityKeyboardNavigationOptionsObjectOps[Self <: SeriesAccessibilityKeyboardNavigationOptionsObject] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
  }
}
