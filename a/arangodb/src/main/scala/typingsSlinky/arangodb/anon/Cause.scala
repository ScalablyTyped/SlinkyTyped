package typingsSlinky.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cause extends js.Object {
  var cause: js.UndefOr[js.Error] = js.undefined
  var extra: js.UndefOr[js.Any] = js.undefined
}

object Cause {
  @scala.inline
  def apply(cause: js.Error = null, extra: js.Any = null): Cause = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cause]
  }
}

