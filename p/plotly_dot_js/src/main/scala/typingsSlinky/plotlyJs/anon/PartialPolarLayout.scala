package typingsSlinky.plotlyJs.anon

import typingsSlinky.plotlyJs.plotlyJsStrings.circular
import typingsSlinky.plotlyJs.plotlyJsStrings.linear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.PolarLayout> */
@js.native
trait PartialPolarLayout extends js.Object {
  
  var angularaxis: js.UndefOr[PartialLayoutAxis] = js.native
  
  var bgcolor: js.UndefOr[typingsSlinky.plotlyJs.mod.Color] = js.native
  
  var domain: js.UndefOr[PartialDomain] = js.native
  
  var gridshape: js.UndefOr[circular | linear] = js.native
  
  var hole: js.UndefOr[Double] = js.native
  
  var radialaxis: js.UndefOr[PartialLayoutAxis] = js.native
  
  var sector: js.UndefOr[js.Array[Double]] = js.native
  
  var uirevision: js.UndefOr[String | Double] = js.native
}
object PartialPolarLayout {
  
  @scala.inline
  def apply(): PartialPolarLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPolarLayout]
  }
  
  @scala.inline
  implicit class PartialPolarLayoutOps[Self <: PartialPolarLayout] (val x: Self) extends AnyVal {
    
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
    def setAngularaxis(value: PartialLayoutAxis): Self = this.set("angularaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngularaxis: Self = this.set("angularaxis", js.undefined)
    
    @scala.inline
    def setBgcolorVarargs(value: (js.UndefOr[(js.Array[js.UndefOr[String | Double | Null]]) | Double | Null | String])*): Self = this.set("bgcolor", js.Array(value :_*))
    
    @scala.inline
    def setBgcolor(value: typingsSlinky.plotlyJs.mod.Color): Self = this.set("bgcolor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBgcolor: Self = this.set("bgcolor", js.undefined)
    
    @scala.inline
    def setDomain(value: PartialDomain): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setGridshape(value: circular | linear): Self = this.set("gridshape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridshape: Self = this.set("gridshape", js.undefined)
    
    @scala.inline
    def setHole(value: Double): Self = this.set("hole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHole: Self = this.set("hole", js.undefined)
    
    @scala.inline
    def setRadialaxis(value: PartialLayoutAxis): Self = this.set("radialaxis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadialaxis: Self = this.set("radialaxis", js.undefined)
    
    @scala.inline
    def setSectorVarargs(value: Double*): Self = this.set("sector", js.Array(value :_*))
    
    @scala.inline
    def setSector(value: js.Array[Double]): Self = this.set("sector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSector: Self = this.set("sector", js.undefined)
    
    @scala.inline
    def setUirevision(value: String | Double): Self = this.set("uirevision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUirevision: Self = this.set("uirevision", js.undefined)
  }
}
