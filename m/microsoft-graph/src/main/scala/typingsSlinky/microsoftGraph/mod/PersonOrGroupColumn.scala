package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PersonOrGroupColumn extends js.Object {
  // Indicates whether multiple values can be selected from the source.
  var allowMultipleSelection: js.UndefOr[Boolean] = js.native
  // Whether to allow selection of people only, or people and groups. Must be one of peopleAndGroups or peopleOnly.
  var chooseFromType: js.UndefOr[String] = js.native
  // How to display the information about the person or group chosen. See below.
  var displayAs: js.UndefOr[String] = js.native
}

object PersonOrGroupColumn {
  @scala.inline
  def apply(): PersonOrGroupColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersonOrGroupColumn]
  }
  @scala.inline
  implicit class PersonOrGroupColumnOps[Self <: PersonOrGroupColumn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowMultipleSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowMultipleSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowMultipleSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withChooseFromType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseFromType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChooseFromType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chooseFromType")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayAs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayAs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayAs")(js.undefined)
        ret
    }
  }
  
}

