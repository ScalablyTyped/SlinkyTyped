package typingsSlinky.devextreme.mod.DevExpress.viz

import typingsSlinky.devextreme.anon.EndValue
import typingsSlinky.devextreme.devextremeStrings.Bright
import typingsSlinky.devextreme.devextremeStrings.Carmine
import typingsSlinky.devextreme.devextremeStrings.Material
import typingsSlinky.devextreme.devextremeStrings.Ocean
import typingsSlinky.devextreme.devextremeStrings.Office
import typingsSlinky.devextreme.devextremeStrings.Pastel
import typingsSlinky.devextreme.devextremeStrings.Soft
import typingsSlinky.devextreme.devextremeStrings.Vintage
import typingsSlinky.devextreme.devextremeStrings.Violet
import typingsSlinky.devextreme.devextremeStrings.`Dark Moon`
import typingsSlinky.devextreme.devextremeStrings.`Dark Violet`
import typingsSlinky.devextreme.devextremeStrings.`Green Mist`
import typingsSlinky.devextreme.devextremeStrings.`Harmony Light`
import typingsSlinky.devextreme.devextremeStrings.`Soft Blue`
import typingsSlinky.devextreme.devextremeStrings.`Soft Pastel`
import typingsSlinky.devextreme.devextremeStrings.alternate
import typingsSlinky.devextreme.devextremeStrings.blend
import typingsSlinky.devextreme.devextremeStrings.extrapolate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * [descr:BaseGauge.Options.rangeContainer]
  */
@js.native
trait BaseGaugeRangeContainer extends js.Object {
  
  /**
    * [descr:BaseGauge.Options.rangeContainer.backgroundColor]
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * [descr:BaseGauge.Options.rangeContainer.offset]
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * [descr:BaseGauge.Options.rangeContainer.palette]
    */
  var palette: js.UndefOr[
    js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
  ] = js.native
  
  /**
    * [descr:BaseGauge.Options.rangeContainer.paletteExtensionMode]
    */
  var paletteExtensionMode: js.UndefOr[alternate | blend | extrapolate] = js.native
  
  /**
    * [descr:BaseGauge.Options.rangeContainer.ranges]
    */
  var ranges: js.UndefOr[js.Array[EndValue]] = js.native
}
object BaseGaugeRangeContainer {
  
  @scala.inline
  def apply(): BaseGaugeRangeContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseGaugeRangeContainer]
  }
  
  @scala.inline
  implicit class BaseGaugeRangeContainerOps[Self <: BaseGaugeRangeContainer] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setPaletteVarargs(value: String*): Self = this.set("palette", js.Array(value :_*))
    
    @scala.inline
    def setPalette(
      value: js.Array[String] | Bright | (`Harmony Light`) | Ocean | Pastel | Soft | (`Soft Pastel`) | Vintage | Violet | Carmine | (`Dark Moon`) | (`Dark Violet`) | (`Green Mist`) | (`Soft Blue`) | Material | Office
    ): Self = this.set("palette", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePalette: Self = this.set("palette", js.undefined)
    
    @scala.inline
    def setPaletteExtensionMode(value: alternate | blend | extrapolate): Self = this.set("paletteExtensionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaletteExtensionMode: Self = this.set("paletteExtensionMode", js.undefined)
    
    @scala.inline
    def setRangesVarargs(value: EndValue*): Self = this.set("ranges", js.Array(value :_*))
    
    @scala.inline
    def setRanges(value: js.Array[EndValue]): Self = this.set("ranges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRanges: Self = this.set("ranges", js.undefined)
  }
}
