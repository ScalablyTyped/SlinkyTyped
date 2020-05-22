package typingsSlinky.formData.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var dataSize: js.UndefOr[Double] = js.undefined
  var maxDataSize: js.UndefOr[Double] = js.undefined
  var pauseStreams: js.UndefOr[Boolean] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    dataSize: js.UndefOr[Double] = js.undefined,
    maxDataSize: js.UndefOr[Double] = js.undefined,
    pauseStreams: js.UndefOr[Boolean] = js.undefined,
    readable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dataSize)) __obj.updateDynamic("dataSize")(dataSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDataSize)) __obj.updateDynamic("maxDataSize")(maxDataSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pauseStreams)) __obj.updateDynamic("pauseStreams")(pauseStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

