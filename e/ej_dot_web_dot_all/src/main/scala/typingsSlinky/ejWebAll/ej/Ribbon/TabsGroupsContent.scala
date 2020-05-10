package typingsSlinky.ejWebAll.ej.Ribbon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabsGroupsContent extends js.Object {
  /** Specifies the height, width, type, isBig property to the controls in the group commonly.
    * @Default {Object}
    */
  var defaults: js.UndefOr[TabsGroupsContentDefaults] = js.native
  /** Specifies the controls such as Syncfusion button, split button, dropdown list, toggle button, gallery, custom controls in the subgroup of the ribbon tab .
    * @Default {Array}
    */
  var groups: js.UndefOr[js.Array[TabsGroupsContentGroup]] = js.native
}

object TabsGroupsContent {
  @scala.inline
  def apply(): TabsGroupsContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabsGroupsContent]
  }
  @scala.inline
  implicit class TabsGroupsContentOps[Self <: TabsGroupsContent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaults(value: TabsGroupsContentDefaults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaults")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: js.Array[TabsGroupsContentGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groups")(js.undefined)
        ret
    }
  }
  
}

