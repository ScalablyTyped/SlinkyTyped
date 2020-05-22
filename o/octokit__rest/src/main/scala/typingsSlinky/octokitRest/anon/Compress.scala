package typingsSlinky.octokitRest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Compress extends js.Object {
  var agent: js.UndefOr[String | Null] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Compress {
  @scala.inline
  def apply(
    agent: js.UndefOr[Null | String] = js.undefined,
    compress: js.UndefOr[Boolean] = js.undefined,
    follow: js.UndefOr[Double] = js.undefined,
    size: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): Compress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(agent)) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(follow)) __obj.updateDynamic("follow")(follow.get.asInstanceOf[js.Any])
    if (!js.isUndefined(size)) __obj.updateDynamic("size")(size.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compress]
  }
}

