package typingsSlinky.openjscad.CSG

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IArcOptions extends ICircleOptions {
  var endangle: js.UndefOr[Double] = js.native
  var maketangent: js.UndefOr[Boolean] = js.native
  var startangle: js.UndefOr[Double] = js.native
}

object IArcOptions {
  @scala.inline
  def apply(): IArcOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IArcOptions]
  }
  @scala.inline
  implicit class IArcOptionsOps[Self <: IArcOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endangle")(js.undefined)
        ret
    }
    @scala.inline
    def withMaketangent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maketangent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaketangent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maketangent")(js.undefined)
        ret
    }
    @scala.inline
    def withStartangle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startangle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartangle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startangle")(js.undefined)
        ret
    }
  }
  
}

