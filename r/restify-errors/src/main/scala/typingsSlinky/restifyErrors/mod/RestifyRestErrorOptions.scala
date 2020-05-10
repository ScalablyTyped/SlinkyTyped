package typingsSlinky.restifyErrors.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestifyRestErrorOptions extends RestifyHttpErrorOptions {
  var restCode: js.UndefOr[String] = js.native
}

object RestifyRestErrorOptions {
  @scala.inline
  def apply(): RestifyRestErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestifyRestErrorOptions]
  }
  @scala.inline
  implicit class RestifyRestErrorOptionsOps[Self <: RestifyRestErrorOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRestCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restCode")(js.undefined)
        ret
    }
  }
  
}

