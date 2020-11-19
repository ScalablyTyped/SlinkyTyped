package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.mod.GaugeLine
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.GaugeBar> */
@js.native
trait PartialGaugeBarColor extends js.Object {
  
  var color: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var line: js.UndefOr[Partial[GaugeLine]] = js.native
  
  var thickness: js.UndefOr[Double] = js.native
}
object PartialGaugeBarColor {
  
  @scala.inline
  def apply(): PartialGaugeBarColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialGaugeBarColor]
  }
  
  @scala.inline
  implicit class PartialGaugeBarColorOps[Self <: PartialGaugeBarColor] (val x: Self) extends AnyVal {
    
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
    def setColorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("color", js.Array(value :_*))
    
    @scala.inline
    def setColor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setLine(value: Partial[GaugeLine]): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLine: Self = this.set("line", js.undefined)
    
    @scala.inline
    def setThickness(value: Double): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
  }
}
