package typingsSlinky.joi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataUriOptions extends js.Object {
  /**
    * optional parameter defaulting to true which will require = padding if true or make padding optional if false
    */
  var paddingRequired: js.UndefOr[Boolean] = js.native
}

object DataUriOptions {
  @scala.inline
  def apply(): DataUriOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataUriOptions]
  }
  @scala.inline
  implicit class DataUriOptionsOps[Self <: DataUriOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPaddingRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaddingRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paddingRequired")(js.undefined)
        ret
    }
  }
  
}

