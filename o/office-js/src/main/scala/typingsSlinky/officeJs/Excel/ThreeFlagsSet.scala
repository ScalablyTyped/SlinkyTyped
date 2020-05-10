package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeFlagsSet extends /* index */ NumberDictionary[Icon] {
  var greenFlag: Icon = js.native
  var redFlag: Icon = js.native
  var yellowFlag: Icon = js.native
}

object ThreeFlagsSet {
  @scala.inline
  def apply(greenFlag: Icon, redFlag: Icon, yellowFlag: Icon): ThreeFlagsSet = {
    val __obj = js.Dynamic.literal(greenFlag = greenFlag.asInstanceOf[js.Any], redFlag = redFlag.asInstanceOf[js.Any], yellowFlag = yellowFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeFlagsSet]
  }
  @scala.inline
  implicit class ThreeFlagsSetOps[Self <: ThreeFlagsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreenFlag(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedFlag(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redFlag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowFlag(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowFlag")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

