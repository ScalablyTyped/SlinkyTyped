package typingsSlinky.officeUiFabricReact.facepileTypesMod

import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFacepileStyles extends js.Object {
  var addButton: IStyle = js.native
  var descriptiveOverflowButton: IStyle = js.native
  var itemButton: IStyle = js.native
  var itemContainer: IStyle = js.native
  var member: IStyle = js.native
  var members: IStyle = js.native
  var overflowButton: IStyle = js.native
  var overflowInitialsIcon: IStyle = js.native
  /**
    * Style for the root element.
    */
  var root: IStyle = js.native
  var screenReaderOnly: IStyle = js.native
}

object IFacepileStyles {
  @scala.inline
  def apply(): IFacepileStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFacepileStyles]
  }
  @scala.inline
  implicit class IFacepileStylesOps[Self <: IFacepileStyles] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(js.undefined)
        ret
    }
    @scala.inline
    def withAddButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButton")(null)
        ret
    }
    @scala.inline
    def withDescriptiveOverflowButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptiveOverflowButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescriptiveOverflowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptiveOverflowButton")(js.undefined)
        ret
    }
    @scala.inline
    def withDescriptiveOverflowButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descriptiveOverflowButton")(null)
        ret
    }
    @scala.inline
    def withItemButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemButton")(js.undefined)
        ret
    }
    @scala.inline
    def withItemButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemButton")(null)
        ret
    }
    @scala.inline
    def withItemContainer(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContainer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContainer")(js.undefined)
        ret
    }
    @scala.inline
    def withItemContainerNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemContainer")(null)
        ret
    }
    @scala.inline
    def withMember(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMember: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(js.undefined)
        ret
    }
    @scala.inline
    def withMemberNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("member")(null)
        ret
    }
    @scala.inline
    def withMembers(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMembers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(js.undefined)
        ret
    }
    @scala.inline
    def withMembersNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("members")(null)
        ret
    }
    @scala.inline
    def withOverflowButton(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButton")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButton")(null)
        ret
    }
    @scala.inline
    def withOverflowInitialsIcon(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowInitialsIcon")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowInitialsIcon: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowInitialsIcon")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowInitialsIconNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowInitialsIcon")(null)
        ret
    }
    @scala.inline
    def withRoot(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
    @scala.inline
    def withRootNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(null)
        ret
    }
    @scala.inline
    def withScreenReaderOnly(value: IStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreenReaderOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withScreenReaderOnlyNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenReaderOnly")(null)
        ret
    }
  }
  
}

