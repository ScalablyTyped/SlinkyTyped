package typingsSlinky.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadConfig extends js.Object {
  var checkPolicy: js.UndefOr[Boolean] = js.native
  var policy: js.UndefOr[LoadPolicyConfig] = js.native
  var process: js.UndefOr[LoadProcessConfig] = js.native
  var shouldCrash: js.UndefOr[Boolean] = js.native
}

object LoadConfig {
  @scala.inline
  def apply(): LoadConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadConfig]
  }
  @scala.inline
  implicit class LoadConfigOps[Self <: LoadConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckPolicy(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCheckPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: LoadPolicyConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withProcess(value: LoadProcessConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("process")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldCrash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCrash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShouldCrash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldCrash")(js.undefined)
        ret
    }
  }
  
}

