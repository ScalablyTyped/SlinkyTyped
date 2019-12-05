package typingsSlinky.atAntDashDesignReactDashNative.libImageDashPickerImageRollMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageRollTexts extends js.Object {
  var cancelText: js.UndefOr[TagMod[Any]] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object ImageRollTexts {
  @scala.inline
  def apply(cancelText: TagMod[Any] = null, title: TagMod[Any] = null): ImageRollTexts = {
    val __obj = js.Dynamic.literal()
    if (cancelText != null) __obj.updateDynamic("cancelText")(cancelText.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageRollTexts]
  }
}

