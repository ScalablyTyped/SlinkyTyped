package typingsSlinky.ngTable.groupSettingsMod

import typingsSlinky.ngTable.sortingMod.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGroupSettings extends js.Object {
  /**
    * The default sort direction that will be used whenever a group is supplied that
    * does not define its own sort direction
    */
  var defaultSort: js.UndefOr[SortDirection] = js.native
  /**
    * Determines whether groups should be displayed expanded to show their items. Defaults to true
    */
  var isExpanded: js.UndefOr[Boolean] = js.native
}

object IGroupSettings {
  @scala.inline
  def apply(): IGroupSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGroupSettings]
  }
  @scala.inline
  implicit class IGroupSettingsOps[Self <: IGroupSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultSort(value: SortDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultSort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultSort")(js.undefined)
        ret
    }
    @scala.inline
    def withIsExpanded(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsExpanded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExpanded")(js.undefined)
        ret
    }
  }
  
}

