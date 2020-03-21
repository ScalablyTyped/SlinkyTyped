package typingsSlinky.rollup

import typingsSlinky.rollup.mod.InputOption
import typingsSlinky.rollup.mod.RollupBuild
import typingsSlinky.rollup.mod.RollupWatcherEvent
import typingsSlinky.rollup.rollupStrings.BUNDLE_END
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDuration extends RollupWatcherEvent {
  var code: BUNDLE_END
  var duration: Double
  var input: InputOption
  var output: js.Array[String]
  var result: RollupBuild
}

object AnonDuration {
  @scala.inline
  def apply(
    code: BUNDLE_END,
    duration: Double,
    input: InputOption,
    output: js.Array[String],
    result: RollupBuild
  ): AnonDuration = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDuration]
  }
}

