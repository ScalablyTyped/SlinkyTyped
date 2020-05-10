package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeSymbols2Set extends /* index */ NumberDictionary[Icon] {
  var greenCheck: Icon = js.native
  var redCross: Icon = js.native
  var yellowExclamation: Icon = js.native
}

object ThreeSymbols2Set {
  @scala.inline
  def apply(greenCheck: Icon, redCross: Icon, yellowExclamation: Icon): ThreeSymbols2Set = {
    val __obj = js.Dynamic.literal(greenCheck = greenCheck.asInstanceOf[js.Any], redCross = redCross.asInstanceOf[js.Any], yellowExclamation = yellowExclamation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSymbols2Set]
  }
  @scala.inline
  implicit class ThreeSymbols2SetOps[Self <: ThreeSymbols2Set] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreenCheck(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedCross(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redCross")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowExclamation(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowExclamation")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

