package typingsSlinky.antdMobileRn.cardPropsTypeMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardFooterPropsType extends js.Object {
  var content: js.UndefOr[TagMod[Any]] = js.undefined
  var extra: js.UndefOr[TagMod[Any]] = js.undefined
}

object CardFooterPropsType {
  @scala.inline
  def apply(content: TagMod[Any] = null, extra: TagMod[Any] = null): CardFooterPropsType = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardFooterPropsType]
  }
}

