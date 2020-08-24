package typingsSlinky.rollup.mod

import typingsSlinky.rollup.rollupStrings.BUNDLE_END
import typingsSlinky.rollup.rollupStrings.BUNDLE_START
import typingsSlinky.rollup.rollupStrings.END
import typingsSlinky.rollup.rollupStrings.ERROR
import typingsSlinky.rollup.rollupStrings.START
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.rollup.anon.`1`
  - typingsSlinky.rollup.anon.Input
  - typingsSlinky.rollup.anon.Duration
  - typingsSlinky.rollup.anon.`2`
  - typingsSlinky.rollup.anon.Error
*/
trait RollupWatcherEvent extends js.Object

object RollupWatcherEvent {
  @scala.inline
  def `1`(code: START): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def `2`(code: END): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def Input(code: BUNDLE_START, input: InputOption, output: js.Array[String]): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def Error(code: ERROR, error: RollupError): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWatcherEvent]
  }
  @scala.inline
  def Duration(
    code: BUNDLE_END,
    duration: Double,
    input: InputOption,
    output: js.Array[String],
    result: RollupBuild
  ): RollupWatcherEvent = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupWatcherEvent]
  }
}

