package typingsSlinky.lambdaPhi.lambdaConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaConfig extends js.Object {
  var allowNullInjection: Boolean = js.native
}

object LambdaConfig {
  @scala.inline
  def apply(allowNullInjection: Boolean): LambdaConfig = {
    val __obj = js.Dynamic.literal(allowNullInjection = allowNullInjection.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConfig]
  }
  @scala.inline
  implicit class LambdaConfigOps[Self <: LambdaConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNullInjection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullInjection")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

