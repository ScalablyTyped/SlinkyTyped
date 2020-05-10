package typingsSlinky.oracleOraclejet

import typingsSlinky.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon10 extends js.Object {
  def renderer(context: CenterContext): AnonInsert | AnonPreventDefault = js.native
}

object Anon10 {
  @scala.inline
  def apply(renderer: CenterContext => AnonInsert | AnonPreventDefault): Anon10 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon10]
  }
  @scala.inline
  implicit class Anon10Ops[Self <: Anon10] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderer(value: CenterContext => AnonInsert | AnonPreventDefault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderer")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

