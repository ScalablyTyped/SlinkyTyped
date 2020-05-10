package typingsSlinky.reactNativeMaterialUi.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListItemCenterElement extends js.Object {
  var primaryText: String | ReactElement = js.native
  var secondaryText: js.UndefOr[String] = js.native
  var tertiaryText: js.UndefOr[String] = js.native
}

object ListItemCenterElement {
  @scala.inline
  def apply(primaryText: String | ReactElement): ListItemCenterElement = {
    val __obj = js.Dynamic.literal(primaryText = primaryText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemCenterElement]
  }
  @scala.inline
  implicit class ListItemCenterElementOps[Self <: ListItemCenterElement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPrimaryTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrimaryText(value: String | ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("primaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(js.undefined)
        ret
    }
    @scala.inline
    def withTertiaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTertiaryText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tertiaryText")(js.undefined)
        ret
    }
  }
  
}

