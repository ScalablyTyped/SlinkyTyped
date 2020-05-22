package typingsSlinky.reactOnclickoutside.mod

import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigObject extends js.Object {
  var excludeScrollbar: js.UndefOr[Boolean] = js.undefined
  var handleClickOutside: js.UndefOr[MouseEventHandler[_]] = js.undefined
}

object ConfigObject {
  @scala.inline
  def apply(
    excludeScrollbar: js.UndefOr[Boolean] = js.undefined,
    handleClickOutside: SyntheticMouseEvent[_] => Unit = null
  ): ConfigObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(excludeScrollbar)) __obj.updateDynamic("excludeScrollbar")(excludeScrollbar.get.asInstanceOf[js.Any])
    if (handleClickOutside != null) __obj.updateDynamic("handleClickOutside")(js.Any.fromFunction1(handleClickOutside))
    __obj.asInstanceOf[ConfigObject]
  }
}

