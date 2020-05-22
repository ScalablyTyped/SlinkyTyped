package typingsSlinky.antDesignPro.loginTabMod

import slinky.core.TagMod
import typingsSlinky.antDesignPro.anon.AddTab
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginTabProps extends js.Object {
  var key: js.UndefOr[String] = js.undefined
  var tab: js.UndefOr[TagMod[Any]] = js.undefined
  var tabUtil: AddTab
}

object LoginTabProps {
  @scala.inline
  def apply(tabUtil: AddTab, key: String = null, tab: TagMod[Any] = null): LoginTabProps = {
    val __obj = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (tab != null) __obj.updateDynamic("tab")(tab.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginTabProps]
  }
}

