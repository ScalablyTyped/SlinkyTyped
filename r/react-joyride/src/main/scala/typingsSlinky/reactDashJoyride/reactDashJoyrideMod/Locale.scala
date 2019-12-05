package typingsSlinky.reactDashJoyride.reactDashJoyrideMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Locale extends js.Object {
  var back: js.UndefOr[TagMod[Any]] = js.undefined
  var close: js.UndefOr[TagMod[Any]] = js.undefined
  var last: js.UndefOr[TagMod[Any]] = js.undefined
  var next: js.UndefOr[TagMod[Any]] = js.undefined
  var open: js.UndefOr[TagMod[Any]] = js.undefined
  var skip: js.UndefOr[TagMod[Any]] = js.undefined
}

object Locale {
  @scala.inline
  def apply(
    back: TagMod[Any] = null,
    close: TagMod[Any] = null,
    last: TagMod[Any] = null,
    next: TagMod[Any] = null,
    open: TagMod[Any] = null,
    skip: TagMod[Any] = null
  ): Locale = {
    val __obj = js.Dynamic.literal()
    if (back != null) __obj.updateDynamic("back")(back.asInstanceOf[js.Any])
    if (close != null) __obj.updateDynamic("close")(close.asInstanceOf[js.Any])
    if (last != null) __obj.updateDynamic("last")(last.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (skip != null) __obj.updateDynamic("skip")(skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
}

