package typingsSlinky.ionicCore.oldAnimationAnimationInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayOptions extends js.Object {
  var duration: js.UndefOr[Double] = js.undefined
  var promise: js.UndefOr[Boolean] = js.undefined
}

object PlayOptions {
  @scala.inline
  def apply(duration: js.UndefOr[Double] = js.undefined, promise: js.UndefOr[Boolean] = js.undefined): PlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(promise)) __obj.updateDynamic("promise")(promise.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayOptions]
  }
}

