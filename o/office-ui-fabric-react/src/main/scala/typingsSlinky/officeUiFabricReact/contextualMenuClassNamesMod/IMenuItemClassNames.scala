package typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMenuItemClassNames extends js.Object {
  var checkmarkIcon: String = js.native
  var divider: String = js.native
  var icon: String = js.native
  var item: String = js.native
  var label: String = js.native
  var linkContent: String = js.native
  var linkContentMenu: String = js.native
  var root: String = js.native
  var secondaryText: String = js.native
  var splitContainer: String = js.native
  var splitMenu: String = js.native
  var splitPrimary: String = js.native
  var subMenuIcon: String = js.native
}

object IMenuItemClassNames {
  @scala.inline
  def apply(
    checkmarkIcon: String,
    divider: String,
    icon: String,
    item: String,
    label: String,
    linkContent: String,
    linkContentMenu: String,
    root: String,
    secondaryText: String,
    splitContainer: String,
    splitMenu: String,
    splitPrimary: String,
    subMenuIcon: String
  ): IMenuItemClassNames = {
    val __obj = js.Dynamic.literal(checkmarkIcon = checkmarkIcon.asInstanceOf[js.Any], divider = divider.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], linkContent = linkContent.asInstanceOf[js.Any], linkContentMenu = linkContentMenu.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], secondaryText = secondaryText.asInstanceOf[js.Any], splitContainer = splitContainer.asInstanceOf[js.Any], splitMenu = splitMenu.asInstanceOf[js.Any], splitPrimary = splitPrimary.asInstanceOf[js.Any], subMenuIcon = subMenuIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMenuItemClassNames]
  }
  @scala.inline
  implicit class IMenuItemClassNamesOps[Self <: IMenuItemClassNames] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCheckmarkIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checkmarkIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItem(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("item")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("label")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkContentMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkContentMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecondaryText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondaryText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitMenu(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitMenu")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSplitPrimary(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splitPrimary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubMenuIcon(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subMenuIcon")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

