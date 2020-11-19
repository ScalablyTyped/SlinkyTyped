package typingsSlinky.ejWebAll.ej.datavisualization.LinearGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScalesBarPointersBorder extends js.Object {
  
  /** Specifies the border Color of bar pointer
    * @Default {null}
    */
  var color: js.UndefOr[String] = js.native
  
  /** Specifies the border Width of bar pointer
    * @Default {1.5}
    */
  var width: js.UndefOr[Double] = js.native
}
object ScalesBarPointersBorder {
  
  @scala.inline
  def apply(): ScalesBarPointersBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalesBarPointersBorder]
  }
  
  @scala.inline
  implicit class ScalesBarPointersBorderOps[Self <: ScalesBarPointersBorder] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
