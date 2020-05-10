package typingsSlinky.pinoHttp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAttributeKeys extends js.Object {
  var err: js.UndefOr[String] = js.native
  var req: js.UndefOr[String] = js.native
  var res: js.UndefOr[String] = js.native
  var responseTime: js.UndefOr[String] = js.native
}

object CustomAttributeKeys {
  @scala.inline
  def apply(): CustomAttributeKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAttributeKeys]
  }
  @scala.inline
  implicit class CustomAttributeKeysOps[Self <: CustomAttributeKeys] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErr(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("err")(js.undefined)
        ret
    }
    @scala.inline
    def withReq(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReq: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("req")(js.undefined)
        ret
    }
    @scala.inline
    def withRes(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("res")(js.undefined)
        ret
    }
    @scala.inline
    def withResponseTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResponseTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseTime")(js.undefined)
        ret
    }
  }
  
}

