package typingsSlinky.jimp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoGreyscale extends js.Object {
  var autoGreyscale: js.UndefOr[Boolean] = js.native
  var max: Double = js.native
  var replace: js.UndefOr[Double] = js.native
}

object AnonAutoGreyscale {
  @scala.inline
  def apply(max: Double): AnonAutoGreyscale = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoGreyscale]
  }
  @scala.inline
  implicit class AnonAutoGreyscaleOps[Self <: AnonAutoGreyscale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutoGreyscale(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGreyscale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoGreyscale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoGreyscale")(js.undefined)
        ret
    }
    @scala.inline
    def withReplace(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replace")(js.undefined)
        ret
    }
  }
  
}

