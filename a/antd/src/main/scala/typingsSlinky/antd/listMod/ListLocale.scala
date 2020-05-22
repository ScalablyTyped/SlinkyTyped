package typingsSlinky.antd.listMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocale extends js.Object {
  var emptyText: TagMod[Any] | js.Function0[TagMod[Any]]
}

object ListLocale {
  @scala.inline
  def apply(emptyText: TagMod[Any] | js.Function0[TagMod[Any]] = null): ListLocale = {
    val __obj = js.Dynamic.literal()
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocale]
  }
}

