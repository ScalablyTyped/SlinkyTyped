package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LeafItemSettings extends js.Object {
  /** Specifies the border brush color of the leaf item.
    * @Default {white}
    */
  var borderBrush: js.UndefOr[String] = js.native
  /** Specifies the border thickness of the leaf item.
    * @Default {1}
    */
  var borderThickness: js.UndefOr[Double] = js.native
  /** Specifies the space between the leaf items.
    * @Default {0}
    */
  var gap: js.UndefOr[Double] = js.native
  /** Specifies the label template of the leaf item.
    * @Default {null}
    */
  var itemTemplate: js.UndefOr[String] = js.native
  /** Specifies the label path of the leaf item.
    * @Default {null}
    */
  var labelPath: js.UndefOr[String] = js.native
  /** Specifies the position of the leaf labels.
    * @Default {center}
    */
  var labelPosition: js.UndefOr[Position | String] = js.native
  /** Specifies the mode of label visibility
    * @Default {visible}
    */
  var labelVisibilityMode: js.UndefOr[VisibilityMode | String] = js.native
  /** Shows or hides the label of the leaf item.
    * @Default {false}
    */
  var showLabels: js.UndefOr[Boolean] = js.native
  /** Specifies the overflow options for leaf labels.
    * @Default {none}
    */
  var textOverflow: js.UndefOr[TextOverflow | String] = js.native
}

object LeafItemSettings {
  @scala.inline
  def apply(): LeafItemSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeafItemSettings]
  }
  @scala.inline
  implicit class LeafItemSettingsOps[Self <: LeafItemSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderBrush(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBrush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBrush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBrush")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderThickness(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderThickness: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderThickness")(js.undefined)
        ret
    }
    @scala.inline
    def withGap(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gap")(js.undefined)
        ret
    }
    @scala.inline
    def withItemTemplate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withLabelPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabelPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labelPath")(js.undefined)
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

