package typingsSlinky.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides an option for the data format.
  */
@js.native
trait CoercionTypeOptions extends js.Object {
  /**
    * The desired data format.
    */
  var coercionType: js.UndefOr[CoercionType | String] = js.native
}

object CoercionTypeOptions {
  @scala.inline
  def apply(): CoercionTypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoercionTypeOptions]
  }
  @scala.inline
  implicit class CoercionTypeOptionsOps[Self <: CoercionTypeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoercionType(value: CoercionType | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoercionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coercionType")(js.undefined)
        ret
    }
  }
  
}

