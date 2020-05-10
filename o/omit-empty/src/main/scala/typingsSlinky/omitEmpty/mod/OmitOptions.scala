package typingsSlinky.omitEmpty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OmitOptions extends js.Object {
  var omitZero: js.UndefOr[Boolean] = js.native
}

object OmitOptions {
  @scala.inline
  def apply(): OmitOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitOptions]
  }
  @scala.inline
  implicit class OmitOptionsOps[Self <: OmitOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOmitZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitZero")(js.undefined)
        ret
    }
  }
  
}

