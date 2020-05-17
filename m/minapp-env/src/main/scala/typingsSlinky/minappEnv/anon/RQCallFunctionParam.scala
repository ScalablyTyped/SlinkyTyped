package typingsSlinky.minappEnv.anon

import typingsSlinky.minappEnv.ICloud.CallFunctionData
import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.ICloud.CallFunctionParam> */
@js.native
trait RQCallFunctionParam extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.native
  var data: js.UndefOr[CallFunctionData] = js.native
  var name: String = js.native
  var slow: js.UndefOr[Boolean] = js.native
}

object RQCallFunctionParam {
  @scala.inline
  def apply(name: String): RQCallFunctionParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQCallFunctionParam]
  }
  @scala.inline
  implicit class RQCallFunctionParamOps[Self <: RQCallFunctionParam] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: ICloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(js.undefined)
        ret
    }
    @scala.inline
    def withData(value: CallFunctionData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("data")(js.undefined)
        ret
    }
    @scala.inline
    def withSlow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slow")(js.undefined)
        ret
    }
  }
  
}

