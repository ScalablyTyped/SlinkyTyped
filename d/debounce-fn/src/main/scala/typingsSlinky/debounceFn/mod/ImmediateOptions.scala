package typingsSlinky.debounceFn.mod

import typingsSlinky.debounceFn.debounceFnBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImmediateOptions extends Options {
  @JSName("immediate")
  val immediate_ImmediateOptions: `true`
}

object ImmediateOptions {
  @scala.inline
  def apply(immediate: `true`, wait: js.UndefOr[Double] = js.undefined): ImmediateOptions = {
    val __obj = js.Dynamic.literal(immediate = immediate.asInstanceOf[js.Any])
    if (!js.isUndefined(wait)) __obj.updateDynamic("wait")(wait.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImmediateOptions]
  }
}

