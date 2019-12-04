package typingsSlinky.antd.libTableFilterDropdownMenuWrapperMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterDropdownMenuWrapperProps extends js.Object {
  var children: js.UndefOr[TagMod[Any]] = js.undefined
  var className: js.UndefOr[String] = js.undefined
}

object FilterDropdownMenuWrapperProps {
  @scala.inline
  def apply(children: TagMod[Any] = null, className: String = null): FilterDropdownMenuWrapperProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterDropdownMenuWrapperProps]
  }
}

