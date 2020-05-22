package typingsSlinky.rollup.anon

import typingsSlinky.rollup.mod.InputOption
import typingsSlinky.rollup.mod.RollupWatcherEvent
import typingsSlinky.rollup.rollupStrings.BUNDLE_START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Input extends RollupWatcherEvent {
  var code: BUNDLE_START
  var input: InputOption
  var output: js.Array[String]
}

object Input {
  @scala.inline
  def apply(code: BUNDLE_START, input: InputOption, output: js.Array[String]): Input = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
}

