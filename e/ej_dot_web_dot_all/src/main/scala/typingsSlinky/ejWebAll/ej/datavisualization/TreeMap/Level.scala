package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Level extends js.Object {
  /** specifies the group background
    * @Default {null}
    */
  var groupBackground: js.UndefOr[String] = js.native
  /** Specifies the group border color for tree map level.
    * @Default {null}
    */
  var groupBorderColor: js.UndefOr[String] = js.native
  /** Specifies the group border thickness for tree map level.
    * @Default {1}
    */
  var groupBorderThickness: js.UndefOr[Double] = js.native
  /** Specifies the group gap for tree map level.
    * @Default {1}
    */
  var groupGap: js.UndefOr[Double] = js.native
  /** Specifies the group padding for tree map level.
    * @Default {4}
    */
  var groupPadding: js.UndefOr[Double] = js.native
  /** Specifies the group path for tree map level.
    */
  var groupPath: js.UndefOr[String] = js.native
  /** Specifies the header height for tree map level.
    * @Default {0}
    */
  var headerHeight: js.UndefOr[Double] = js.native
  /** Specifies the header template for tree map level.
    * @Default {null}
    */
  var headerTemplate: js.UndefOr[String] = js.native
  /** Specifies the mode of header visibility
    * @Default {visible}
    */
  var headerVisibilityMode: js.UndefOr[VisibilityMode | String] = js.native
  /** Specifies the position of the labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | String] = js.native
  /** Specifies the label template for tree map level.
    * @Default {null}
    */
  var labelTemplate: js.UndefOr[String] = js.native
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.native
  /** Shows or hides the header for tree map level.
    * @Default {false}
    */
  var showHeader: js.UndefOr[Boolean] = js.native
  /** Shows or hides the labels for tree map level.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
}

object Level {
  @scala.inline
  def apply(): Level = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Level]
  }
  @scala.inline
  implicit class LevelOps[Self <: Level] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBorderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBorderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBorderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupBorderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupGap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupGap")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPadding(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPadding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPadding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPadding")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupPath")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withHeaderVisibilityMode(value: VisibilityMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVisibilityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderVisibilityMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerVisibilityMode")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPosition(value: Position | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelVisibilityMode(value: VisibilityMode | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVisibilityMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelVisibilityMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelVisibilityMode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withTextOverflow(value: TextOverflow | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextOverflow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textOverflow")(js.undefined)
        ret
    }
  }
  
}

