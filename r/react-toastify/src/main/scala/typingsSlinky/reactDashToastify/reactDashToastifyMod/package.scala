package typingsSlinky.reactDashToastify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashToastifyMod {
  import slinky.core.TagMod

  type ToastContent = TagMod[Any] | js.Function0[Unit]
  type ToastId = Double | String
}
