package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadialGaugeOptions extends js.Object {
  
  var gaugeArea: js.UndefOr[RadialGaugeGaugeArea] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var pointer: js.UndefOr[js.Array[RadialGaugePointerItem]] = js.native
  
  var renderAs: js.UndefOr[String] = js.native
  
  var scale: js.UndefOr[RadialGaugeScale] = js.native
  
  var theme: js.UndefOr[String] = js.native
  
  var transitions: js.UndefOr[Boolean] = js.native
}
object RadialGaugeOptions {
  
  @scala.inline
  def apply(): RadialGaugeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadialGaugeOptions]
  }
  
  @scala.inline
  implicit class RadialGaugeOptionsOps[Self <: RadialGaugeOptions] (val x: Self) extends AnyVal {
    
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
    def setGaugeArea(value: RadialGaugeGaugeArea): Self = this.set("gaugeArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGaugeArea: Self = this.set("gaugeArea", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPointerVarargs(value: RadialGaugePointerItem*): Self = this.set("pointer", js.Array(value :_*))
    
    @scala.inline
    def setPointer(value: js.Array[RadialGaugePointerItem]): Self = this.set("pointer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointer: Self = this.set("pointer", js.undefined)
    
    @scala.inline
    def setRenderAs(value: String): Self = this.set("renderAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAs: Self = this.set("renderAs", js.undefined)
    
    @scala.inline
    def setScale(value: RadialGaugeScale): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setTransitions(value: Boolean): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
}
