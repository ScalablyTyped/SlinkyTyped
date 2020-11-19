package typingsSlinky.grommet.meterMod

import typingsSlinky.grommet.anon.ColorOpacity
import typingsSlinky.grommet.anon.Highlight
import typingsSlinky.grommet.grommetStrings.bar
import typingsSlinky.grommet.grommetStrings.circle
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.utilsMod.A11yTitleType
import typingsSlinky.grommet.utilsMod.AlignSelfType
import typingsSlinky.grommet.utilsMod.GridAreaType
import typingsSlinky.grommet.utilsMod.MarginType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeterProps extends js.Object {
  
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  
  var background: js.UndefOr[String | ColorOpacity] = js.native
  
  var gridArea: js.UndefOr[GridAreaType] = js.native
  
  var margin: js.UndefOr[MarginType] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var round: js.UndefOr[Boolean] = js.native
  
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | full | String] = js.native
  
  var thickness: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
  
  var `type`: js.UndefOr[bar | circle] = js.native
  
  var values: js.UndefOr[js.Array[Highlight]] = js.native
}
object MeterProps {
  
  @scala.inline
  def apply(): MeterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeterProps]
  }
  
  @scala.inline
  implicit class MeterPropsOps[Self <: MeterProps] (val x: Self) extends AnyVal {
    
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    
    @scala.inline
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    
    @scala.inline
    def setBackground(value: String | ColorOpacity): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge | full | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setThickness(value: xsmall | small | medium | large | xlarge | String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    
    @scala.inline
    def setType(value: bar | circle): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Highlight*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Highlight]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
