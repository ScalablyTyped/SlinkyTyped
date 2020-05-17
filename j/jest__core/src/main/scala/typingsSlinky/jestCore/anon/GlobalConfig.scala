package typingsSlinky.jestCore.anon

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalConfig extends js.Object {
  var globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig = js.native
  var results: AggregatedResult = js.native
}

object GlobalConfig {
  @scala.inline
  def apply(globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig, results: AggregatedResult): GlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
  @scala.inline
  implicit class GlobalConfigOps[Self <: GlobalConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlobalConfig(value: typingsSlinky.jestTypes.configMod.GlobalConfig): Self = {
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

