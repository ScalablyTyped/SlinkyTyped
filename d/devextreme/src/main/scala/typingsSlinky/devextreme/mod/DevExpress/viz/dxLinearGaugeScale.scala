package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.devextremeStrings.bottom
import typingsSlinky.devextreme.devextremeStrings.center
import typingsSlinky.devextreme.devextremeStrings.left
import typingsSlinky.devextreme.devextremeStrings.right
import typingsSlinky.devextreme.devextremeStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxLinearGaugeScale extends BaseGaugeScale {
  
  /**
    * [descr:dxLinearGauge.Options.scale.horizontalOrientation]
    */
  var horizontalOrientation: js.UndefOr[center | left | right] = js.native
  
  /**
    * [descr:dxLinearGauge.Options.scale.label]
    */
  @JSName("label")
  var label_dxLinearGaugeScale: js.UndefOr[dxLinearGaugeScaleLabel] = js.native
  
  /**
    * [descr:dxLinearGauge.Options.scale.verticalOrientation]
    */
  var verticalOrientation: js.UndefOr[bottom | center | top] = js.native
}
object dxLinearGaugeScale {
  
  @scala.inline
  def apply(): dxLinearGaugeScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxLinearGaugeScale]
  }
  
  @scala.inline
  implicit class dxLinearGaugeScaleOps[Self <: dxLinearGaugeScale] (val x: Self) extends AnyVal {
    
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
    def setHorizontalOrientation(value: center | left | right): Self = this.set("horizontalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalOrientation: Self = this.set("horizontalOrientation", js.undefined)
    
    @scala.inline
    def setLabel(value: dxLinearGaugeScaleLabel): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setVerticalOrientation(value: bottom | center | top): Self = this.set("verticalOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalOrientation: Self = this.set("verticalOrientation", js.undefined)
  }
}
