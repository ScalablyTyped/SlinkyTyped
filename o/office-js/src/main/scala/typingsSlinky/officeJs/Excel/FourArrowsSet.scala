package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FourArrowsSet extends /* index */ NumberDictionary[Icon] {
  var greenUpArrow: Icon = js.native
  var redDownArrow: Icon = js.native
  var yellowDownInclineArrow: Icon = js.native
  var yellowUpInclineArrow: Icon = js.native
}

object FourArrowsSet {
  @scala.inline
  def apply(greenUpArrow: Icon, redDownArrow: Icon, yellowDownInclineArrow: Icon, yellowUpInclineArrow: Icon): FourArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow.asInstanceOf[js.Any], redDownArrow = redDownArrow.asInstanceOf[js.Any], yellowDownInclineArrow = yellowDownInclineArrow.asInstanceOf[js.Any], yellowUpInclineArrow = yellowUpInclineArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourArrowsSet]
  }
  @scala.inline
  implicit class FourArrowsSetOps[Self <: FourArrowsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreenUpArrow(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenUpArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedDownArrow(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redDownArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowDownInclineArrow(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowDownInclineArrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowUpInclineArrow(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowUpInclineArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

