package typingsSlinky.materialUiCore.transitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Duration_ extends js.Object {
  var complex: Double = js.native
  var enteringScreen: Double = js.native
  var leavingScreen: Double = js.native
  var short: Double = js.native
  var shorter: Double = js.native
  var shortest: Double = js.native
  var standard: Double = js.native
}

object Duration_ {
  @scala.inline
  def apply(
    complex: Double,
    enteringScreen: Double,
    leavingScreen: Double,
    short: Double,
    shorter: Double,
    shortest: Double,
    standard: Double
  ): Duration_ = {
    val __obj = js.Dynamic.literal(complex = complex.asInstanceOf[js.Any], enteringScreen = enteringScreen.asInstanceOf[js.Any], leavingScreen = leavingScreen.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any], shorter = shorter.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any], standard = standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration_]
  }
  @scala.inline
  implicit class Duration_Ops[Self <: Duration_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("complex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnteringScreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enteringScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLeavingScreen(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leavingScreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShorter(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortest(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStandard(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standard")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

