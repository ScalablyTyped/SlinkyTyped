package typingsSlinky.jestCore.anon

import typingsSlinky.jestTestResult.typesMod.AggregatedResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalConfig extends js.Object {
  var globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig
  var results: AggregatedResult
}

object GlobalConfig {
  @scala.inline
  def apply(globalConfig: typingsSlinky.jestTypes.configMod.GlobalConfig, results: AggregatedResult): GlobalConfig = {
    val __obj = js.Dynamic.literal(globalConfig = globalConfig.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalConfig]
  }
}

