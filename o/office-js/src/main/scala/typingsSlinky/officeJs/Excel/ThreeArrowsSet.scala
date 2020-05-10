package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeArrowsSet extends /* index */ NumberDictionary[Icon] {
  var greenUpArrow: Icon = js.native
  var redDownArrow: Icon = js.native
  var yellowSideArrow: Icon = js.native
}

object ThreeArrowsSet {
  @scala.inline
  def apply(greenUpArrow: Icon, redDownArrow: Icon, yellowSideArrow: Icon): ThreeArrowsSet = {
    val __obj = js.Dynamic.literal(greenUpArrow = greenUpArrow.asInstanceOf[js.Any], redDownArrow = redDownArrow.asInstanceOf[js.Any], yellowSideArrow = yellowSideArrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeArrowsSet]
  }
  @scala.inline
  implicit class ThreeArrowsSetOps[Self <: ThreeArrowsSet] (val x: Self) extends AnyVal {
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
    def withYellowSideArrow(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowSideArrow")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

