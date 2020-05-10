package typingsSlinky.officeJsPreview.Excel

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FiveBoxesSet extends /* index */ NumberDictionary[Icon] {
  var fourFilledBoxes: Icon = js.native
  var noFilledBoxes: Icon = js.native
  var oneFilledBox: Icon = js.native
  var threeFilledBoxes: Icon = js.native
  var twoFilledBoxes: Icon = js.native
}

object FiveBoxesSet {
  @scala.inline
  def apply(
    fourFilledBoxes: Icon,
    noFilledBoxes: Icon,
    oneFilledBox: Icon,
    threeFilledBoxes: Icon,
    twoFilledBoxes: Icon
  ): FiveBoxesSet = {
    val __obj = js.Dynamic.literal(fourFilledBoxes = fourFilledBoxes.asInstanceOf[js.Any], noFilledBoxes = noFilledBoxes.asInstanceOf[js.Any], oneFilledBox = oneFilledBox.asInstanceOf[js.Any], threeFilledBoxes = threeFilledBoxes.asInstanceOf[js.Any], twoFilledBoxes = twoFilledBoxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FiveBoxesSet]
  }
  @scala.inline
  implicit class FiveBoxesSetOps[Self <: FiveBoxesSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFourFilledBoxes(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fourFilledBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoFilledBoxes(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noFilledBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOneFilledBox(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneFilledBox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreeFilledBoxes(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threeFilledBoxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwoFilledBoxes(value: Icon): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("twoFilledBoxes")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

