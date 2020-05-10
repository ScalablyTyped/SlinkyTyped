package typingsSlinky.officeUiFabricReact.navBaseMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INavState extends js.Object {
  var isGroupCollapsed: StringDictionary[Boolean] = js.native
  var isLinkExpandStateChanged: js.UndefOr[Boolean] = js.native
  var selectedKey: js.UndefOr[String] = js.native
}

object INavState {
  @scala.inline
  def apply(isGroupCollapsed: StringDictionary[Boolean]): INavState = {
    val __obj = js.Dynamic.literal(isGroupCollapsed = isGroupCollapsed.asInstanceOf[js.Any])
    __obj.asInstanceOf[INavState]
  }
  @scala.inline
  implicit class INavStateOps[Self <: INavState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsGroupCollapsed(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isGroupCollapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsLinkExpandStateChanged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinkExpandStateChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLinkExpandStateChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLinkExpandStateChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedKey")(js.undefined)
        ret
    }
  }
  
}

