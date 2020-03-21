package typingsSlinky.antdMobile.listPropsTypeMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPropsType extends js.Object {
  var renderFooter: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[TagMod[Any]] | TagMod[Any]] = js.undefined
}

object ListPropsType {
  @scala.inline
  def apply(
    renderFooter: js.Function0[TagMod[Any]] | TagMod[Any] = null,
    renderHeader: js.Function0[TagMod[Any]] | TagMod[Any] = null
  ): ListPropsType = {
    val __obj = js.Dynamic.literal()
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter.asInstanceOf[js.Any])
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPropsType]
  }
}

