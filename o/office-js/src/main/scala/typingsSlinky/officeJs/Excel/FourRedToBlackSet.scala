package typingsSlinky.officeJs.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FourRedToBlackSet extends /* index */ NumberDictionary[Icon] {
  var blackCircle: Icon = js.native
  var grayCircle: Icon = js.native
  var pinkCircle: Icon = js.native
  var redCircle: Icon = js.native
}

object FourRedToBlackSet {
  @scala.inline
  def apply(blackCircle: Icon, grayCircle: Icon, pinkCircle: Icon, redCircle: Icon): FourRedToBlackSet = {
    val __obj = js.Dynamic.literal(blackCircle = blackCircle.asInstanceOf[js.Any], grayCircle = grayCircle.asInstanceOf[js.Any], pinkCircle = pinkCircle.asInstanceOf[js.Any], redCircle = redCircle.asInstanceOf[js.Any])
    __obj.asInstanceOf[FourRedToBlackSet]
  }
  @scala.inline
  implicit class FourRedToBlackSetOps[Self <: FourRedToBlackSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlackCircle(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blackCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGrayCircle(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grayCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPinkCircle(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinkCircle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRedCircle(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redCircle")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

