package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeTrafficLights2Set extends /* index */ NumberDictionary[Icon] {
  var greenTrafficLight: Icon = js.native
  var redTrafficLight: Icon = js.native
  var yellowTrafficLight: Icon = js.native
}

object ThreeTrafficLights2Set {
  @scala.inline
  def apply(greenTrafficLight: Icon, redTrafficLight: Icon, yellowTrafficLight: Icon): ThreeTrafficLights2Set = {
    val __obj = js.Dynamic.literal(greenTrafficLight = greenTrafficLight.asInstanceOf[js.Any], redTrafficLight = redTrafficLight.asInstanceOf[js.Any], yellowTrafficLight = yellowTrafficLight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeTrafficLights2Set]
  }
  @scala.inline
  implicit class ThreeTrafficLights2SetOps[Self <: ThreeTrafficLights2Set] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreenTrafficLight(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenTrafficLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedTrafficLight(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redTrafficLight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowTrafficLight(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowTrafficLight")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

