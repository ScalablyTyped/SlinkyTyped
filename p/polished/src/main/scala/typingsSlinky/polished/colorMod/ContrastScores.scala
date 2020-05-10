package typingsSlinky.polished.colorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContrastScores extends js.Object {
  var AA: Boolean = js.native
  var AAA: Boolean = js.native
  var AAALarge: Boolean = js.native
  var AALarge: Boolean = js.native
}

object ContrastScores {
  @scala.inline
  def apply(AA: Boolean, AAA: Boolean, AAALarge: Boolean, AALarge: Boolean): ContrastScores = {
    val __obj = js.Dynamic.literal(AA = AA.asInstanceOf[js.Any], AAA = AAA.asInstanceOf[js.Any], AAALarge = AAALarge.asInstanceOf[js.Any], AALarge = AALarge.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContrastScores]
  }
  @scala.inline
  implicit class ContrastScoresOps[Self <: ContrastScores] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAAA(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AAA")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAAALarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AAALarge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAALarge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AALarge")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

