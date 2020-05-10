package typingsSlinky.leafletGroupedlayercontrol.mod

import typingsSlinky.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupedLayersOptions extends ControlOptions {
  /** Default: true */
  var autoZIndex: js.UndefOr[Boolean] = js.native
  /** Default: true */
  var collapsed: js.UndefOr[Boolean] = js.native
  var exclusiveGroups: js.UndefOr[js.Array[String]] = js.native
  /** Default: false */
  var groupCheckboxes: js.UndefOr[Boolean] = js.native
}

object GroupedLayersOptions {
  @scala.inline
  def apply(): GroupedLayersOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupedLayersOptions]
  }
  @scala.inline
  implicit class GroupedLayersOptionsOps[Self <: GroupedLayersOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoZIndex(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoZIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoZIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
        ret
    }
    @scala.inline
    def withExclusiveGroups(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclusiveGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclusiveGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupCheckboxes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCheckboxes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupCheckboxes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupCheckboxes")(js.undefined)
        ret
    }
  }
  
}

