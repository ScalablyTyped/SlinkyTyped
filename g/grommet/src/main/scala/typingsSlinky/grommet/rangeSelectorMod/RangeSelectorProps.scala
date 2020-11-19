package typingsSlinky.grommet.rangeSelectorMod

import typingsSlinky.grommet.anon.Lower
import typingsSlinky.grommet.grommetStrings.full
import typingsSlinky.grommet.grommetStrings.horizontal
import typingsSlinky.grommet.grommetStrings.large
import typingsSlinky.grommet.grommetStrings.medium
import typingsSlinky.grommet.grommetStrings.small
import typingsSlinky.grommet.grommetStrings.strong
import typingsSlinky.grommet.grommetStrings.vertical
import typingsSlinky.grommet.grommetStrings.weak
import typingsSlinky.grommet.grommetStrings.xlarge
import typingsSlinky.grommet.grommetStrings.xsmall
import typingsSlinky.grommet.grommetStrings.xxsmall
import typingsSlinky.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelectorProps extends js.Object {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var direction: js.UndefOr[horizontal | vertical] = js.native
  
  var invert: js.UndefOr[Boolean] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var messages: js.UndefOr[Lower] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var opacity: js.UndefOr[weak | medium | strong | String | Boolean] = js.native
  
  var round: js.UndefOr[xsmall | small | medium | large | full | String] = js.native
  
  var size: js.UndefOr[xxsmall | xsmall | small | medium | large | xlarge | full | String] = js.native
  
  var step: js.UndefOr[Double] = js.native
  
  var values: js.Array[Double] = js.native
}
object RangeSelectorProps {
  
  @scala.inline
  def apply(values: js.Array[Double]): RangeSelectorProps = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorProps]
  }
  
  @scala.inline
  implicit class RangeSelectorPropsOps[Self <: RangeSelectorProps] (val x: Self) extends AnyVal {
    
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
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDirection(value: horizontal | vertical): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    
    @scala.inline
    def setInvert(value: Boolean): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvert: Self = this.set("invert", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMessages(value: Lower): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* repeated */ js.Any => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOpacity(value: weak | medium | strong | String | Boolean): Self = this.set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOpacity: Self = this.set("opacity", js.undefined)
    
    @scala.inline
    def setRound(value: xsmall | small | medium | large | full | String): Self = this.set("round", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    
    @scala.inline
    def setSize(value: xxsmall | xsmall | small | medium | large | xlarge | full | String): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
