package typingsSlinky.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassnamesConfigurations extends js.Object {
  /**
    * The classname on a LI that should be displayed as a divider.
    * Default: "Divider"
    */
  var divider: js.UndefOr[String] = js.native
  /**
    * The classname on a submenu (a nested UL) that should be displayed as a default list.
    * Default: "Inset"
    */
  var inset: js.UndefOr[String] = js.native
  /**
    * The classname on an element (for example a DIV) that should be considered to be a panel.
    * Only applies if the "isMenu" option is set to false.
    * Default: "Panel"
    */
  var panel: js.UndefOr[String] = js.native
  /**
    * The classname on the LI that should be displayed as selected.
    * Default: "Selected"
    */
  var selected: js.UndefOr[String] = js.native
  /**
    * The classname on a submenu (a nested UL) that should expand below
    * their parent instead of slide in from the right.
    * Default: "vertical"
    */
  var vertical: js.UndefOr[String] = js.native
}

object ClassnamesConfigurations {
  @scala.inline
  def apply(): ClassnamesConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassnamesConfigurations]
  }
  @scala.inline
  implicit class ClassnamesConfigurationsOps[Self <: ClassnamesConfigurations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDivider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDivider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("divider")(js.undefined)
        ret
    }
    @scala.inline
    def withInset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inset")(js.undefined)
        ret
    }
    @scala.inline
    def withPanel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panel")(js.undefined)
        ret
    }
    @scala.inline
    def withSelected(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selected")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

