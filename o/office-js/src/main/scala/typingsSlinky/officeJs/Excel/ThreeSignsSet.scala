package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreeSignsSet extends /* index */ NumberDictionary[Icon] {
  var greenCircle: Icon = js.native
  var redDiamond: Icon = js.native
  var yellowTriangle: Icon = js.native
}

object ThreeSignsSet {
  @scala.inline
  def apply(greenCircle: Icon, redDiamond: Icon, yellowTriangle: Icon): ThreeSignsSet = {
    val __obj = js.Dynamic.literal(greenCircle = greenCircle.asInstanceOf[js.Any], redDiamond = redDiamond.asInstanceOf[js.Any], yellowTriangle = yellowTriangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreeSignsSet]
  }
  @scala.inline
  implicit class ThreeSignsSetOps[Self <: ThreeSignsSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGreenCircle(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greenCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedDiamond(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redDiamond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYellowTriangle(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yellowTriangle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

