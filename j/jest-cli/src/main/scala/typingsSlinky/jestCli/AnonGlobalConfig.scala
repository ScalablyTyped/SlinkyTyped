package typingsSlinky.jestCli

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import typingsSlinky.jestTypes.configMod.GlobalConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGlobalConfig extends js.Object {
  var globalConfig: GlobalConfig = js.native
  var results: AggregatedResult = js.native
}

object AnonGlobalConfig {
  @scala.inline
  def apply(globalConfig: GlobalConfig, results: AggregatedResult): AnonGlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGlobalConfig]
  }
  @scala.inline
  implicit class AnonGlobalConfigOps[Self <: AnonGlobalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalConfig(value: GlobalConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("globalConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: AggregatedResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

