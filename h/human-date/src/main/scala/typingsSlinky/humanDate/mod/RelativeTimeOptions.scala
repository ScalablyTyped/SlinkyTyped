package typingsSlinky.humanDate.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelativeTimeOptions extends js.Object {
  var allUnits: js.UndefOr[Boolean] = js.native
  var futureSuffix: js.UndefOr[String] = js.native
  var pastSuffix: js.UndefOr[String] = js.native
  var presentText: js.UndefOr[String] = js.native
  var returnObject: js.UndefOr[Boolean] = js.native
}

object RelativeTimeOptions {
  @scala.inline
  def apply(): RelativeTimeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelativeTimeOptions]
  }
  @scala.inline
  implicit class RelativeTimeOptionsOps[Self <: RelativeTimeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllUnits(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withFutureSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFutureSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("futureSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPastSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPastSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPresentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPresentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("presentText")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnObject")(js.undefined)
        ret
    }
  }
  
}

