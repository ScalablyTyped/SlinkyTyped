package typingsSlinky.openfin.wireMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigWithRuntime extends BaseConfig {
  @JSName("runtime")
  var runtime_ConfigWithRuntime: RuntimeConfig = js.native
}

object ConfigWithRuntime {
  @scala.inline
  def apply(runtime: RuntimeConfig): ConfigWithRuntime = {
    val __obj = js.Dynamic.literal(runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigWithRuntime]
  }
  @scala.inline
  implicit class ConfigWithRuntimeOps[Self <: ConfigWithRuntime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRuntime(value: RuntimeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runtime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

