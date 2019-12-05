package typingsSlinky.rmcDashPullDashToDashRefresh.libPropsTypeMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Indicator extends js.Object {
  var activate: js.UndefOr[TagMod[Any]] = js.undefined
  var deactivate: js.UndefOr[TagMod[Any]] = js.undefined
  var finish: js.UndefOr[TagMod[Any]] = js.undefined
  var release: js.UndefOr[TagMod[Any]] = js.undefined
}

object Indicator {
  @scala.inline
  def apply(
    activate: TagMod[Any] = null,
    deactivate: TagMod[Any] = null,
    finish: TagMod[Any] = null,
    release: TagMod[Any] = null
  ): Indicator = {
    val __obj = js.Dynamic.literal()
    if (activate != null) __obj.updateDynamic("activate")(activate.asInstanceOf[js.Any])
    if (deactivate != null) __obj.updateDynamic("deactivate")(deactivate.asInstanceOf[js.Any])
    if (finish != null) __obj.updateDynamic("finish")(finish.asInstanceOf[js.Any])
    if (release != null) __obj.updateDynamic("release")(release.asInstanceOf[js.Any])
    __obj.asInstanceOf[Indicator]
  }
}

