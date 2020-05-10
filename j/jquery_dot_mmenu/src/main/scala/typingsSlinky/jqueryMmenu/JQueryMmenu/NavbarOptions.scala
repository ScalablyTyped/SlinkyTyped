package typingsSlinky.jqueryMmenu.JQueryMmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavbarOptions extends js.Object {
  /**
    * Whether or not to add a navbar above the panels.
    * Default: true
    */
  var add: js.UndefOr[Boolean] = js.native
  /**
    * The title above the main panel.
    * Default: "Menu"
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The type of link to set for the title.
    * Possible values: "parent", "anchor" or "none".
    * Default: "parent"
    */
  var titleLink: js.UndefOr[String] = js.native
}

object NavbarOptions {
  @scala.inline
  def apply(): NavbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavbarOptions]
  }
  @scala.inline
  implicit class NavbarOptionsOps[Self <: NavbarOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleLink")(js.undefined)
        ret
    }
  }
  
}

