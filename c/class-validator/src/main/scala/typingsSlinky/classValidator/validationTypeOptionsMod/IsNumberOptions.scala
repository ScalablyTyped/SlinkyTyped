package typingsSlinky.classValidator.validationTypeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsNumberOptions extends js.Object {
  var allowInfinity: js.UndefOr[Boolean] = js.native
  var allowNaN: js.UndefOr[Boolean] = js.native
  var maxDecimalPlaces: js.UndefOr[Double] = js.native
}

object IsNumberOptions {
  @scala.inline
  def apply(): IsNumberOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsNumberOptions]
  }
  @scala.inline
  implicit class IsNumberOptionsOps[Self <: IsNumberOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowInfinity(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInfinity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowInfinity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowInfinity")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowNaN(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNaN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNaN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNaN")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDecimalPlaces(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimalPlaces")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDecimalPlaces: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDecimalPlaces")(js.undefined)
        ret
    }
  }
  
}

