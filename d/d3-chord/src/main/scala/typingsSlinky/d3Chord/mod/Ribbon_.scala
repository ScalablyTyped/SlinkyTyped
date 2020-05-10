package typingsSlinky.d3Chord.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ribbon_ extends js.Object {
  /**
    * Ribbon subgroup constituting the source of the Ribbon
    */
  var source: RibbonSubgroup = js.native
  /**
    * Ribbon subgroup constituting the target of the Ribbon
    */
  var target: RibbonSubgroup = js.native
}

object Ribbon_ {
  @scala.inline
  def apply(source: RibbonSubgroup, target: RibbonSubgroup): Ribbon_ = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ribbon_]
  }
  @scala.inline
  implicit class Ribbon_Ops[Self <: Ribbon_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: RibbonSubgroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTarget(value: RibbonSubgroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

