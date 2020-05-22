package typingsSlinky.blueprintjsCore.menuDividerMod

import slinky.core.TagMod
import typingsSlinky.blueprintjsCore.propsMod.IProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMenuDividerProps extends IProps {
  /** Optional header title. */
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object IMenuDividerProps {
  @scala.inline
  def apply(className: String = null, title: TagMod[Any] = null): IMenuDividerProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuDividerProps]
  }
}

