package typingsSlinky.oracleOraclejet.anon

import typingsSlinky.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends js.Object {
  
  def renderer(context: TooltipContext): Insert | PreventDefault = js.native
}
object `10` {
  
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `10` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10Ops`[Self <: `10`] (val x: Self) extends AnyVal {
    
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
    def setRenderer(value: TooltipContext => Insert | PreventDefault): Self = this.set("renderer", js.Any.fromFunction1(value))
  }
}
