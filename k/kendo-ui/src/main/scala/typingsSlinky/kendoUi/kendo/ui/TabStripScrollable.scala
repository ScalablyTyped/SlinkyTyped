package typingsSlinky.kendoUi.kendo.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TabStripScrollable extends js.Object {
  
  var distance: js.UndefOr[Double] = js.native
}
object TabStripScrollable {
  
  @scala.inline
  def apply(): TabStripScrollable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabStripScrollable]
  }
  
  @scala.inline
  implicit class TabStripScrollableOps[Self <: TabStripScrollable] (val x: Self) extends AnyVal {
    
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
    def setDistance(value: Double): Self = this.set("distance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistance: Self = this.set("distance", js.undefined)
  }
}
