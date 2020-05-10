package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInfo extends js.Object {
  // If true, indicates that content types are enabled for this list.
  var contentTypesEnabled: js.UndefOr[Boolean] = js.native
  // If true, indicates that the list is not normally visible in the SharePoint user experience.
  var hidden: js.UndefOr[Boolean] = js.native
  /**
    * An enumerated value that represents the base list template used in creating the list. Possible values include
    * documentLibrary, genericList, task, survey, announcements, contacts, and more.
    */
  var template: js.UndefOr[String] = js.native
}

object ListInfo {
  @scala.inline
  def apply(): ListInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInfo]
  }
  @scala.inline
  implicit class ListInfoOps[Self <: ListInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentTypesEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTypesEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentTypesEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentTypesEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hidden")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

