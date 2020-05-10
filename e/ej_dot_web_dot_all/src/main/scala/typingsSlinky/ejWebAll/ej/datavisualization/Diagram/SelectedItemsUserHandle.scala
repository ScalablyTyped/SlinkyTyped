package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectedItemsUserHandle extends js.Object {
  /** Defines the background color of the user handle
    * @Default {#2382c3}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  /** Sets the border color of the user handle
    * @Default {transparent}
    */
  var borderColor: js.UndefOr[String] = js.native
  /** Defines whether the user handle should be added, when more than one element is selected
    * @Default {false}
    */
  var enableMultiSelection: js.UndefOr[Boolean] = js.native
  /** Sets the horizontal alignment of the user handle
    * @Default {ej.datavisualization.Diagram.HorizontalAlignment.Center}
    */
  var horizontalAlignment: js.UndefOr[HorizontalAlignment | String] = js.native
  /** To set the margin of the user handle
    * @Default {ej.datavisualization.Diagram.Margin()}
    */
  var margin: js.UndefOr[js.Any] = js.native
  /** Defines the name of the user handle
    */
  var name: js.UndefOr[String] = js.native
  /** Sets the fraction/ratio(relative to node) that defines the position of the user handle
    * @Default {ej.datavisualization.Diagram.point(0.5, 1)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  /** Sets the stroke color of the user handle
    * @Default {transparent}
    */
  var pathColor: js.UndefOr[String] = js.native
  /** Defines the custom shape of the user handle
    */
  var pathData: js.UndefOr[String] = js.native
  /** Defines the position of the user handle
    * @Default {ej.datavisualization.Diagram.UserHandlePositions.BottomCenter}
    */
  var position: js.UndefOr[UserHandlePositions | String] = js.native
  /** Defines the size of the user handle
    * @Default {8}
    */
  var size: js.UndefOr[Double] = js.native
  /** Defines the interactive behaviors of the user handle
    */
  var tool: js.UndefOr[js.Any] = js.native
  /** Sets the vertical alignment of the user handle
    * @Default {ej.datavisualization.Diagram.VerticalAlignment.Center}
    */
  var verticalAlignment: js.UndefOr[VerticalAlignment | String] = js.native
  /** Defines the visibility of the user handle
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object SelectedItemsUserHandle {
  @scala.inline
  def apply(): SelectedItemsUserHandle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedItemsUserHandle]
  }
  @scala.inline
  implicit class SelectedItemsUserHandleOps[Self <: SelectedItemsUserHandle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderColor")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableMultiSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableMultiSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableMultiSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalAlignment(value: HorizontalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withMargin(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMargin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("margin")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPathColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPathData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPathData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pathData")(js.undefined)
        ret
    }
    @scala.inline
    def withPosition(value: UserHandlePositions | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
    @scala.inline
    def withTool(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tool")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalAlignment(value: VerticalAlignment | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalAlignment")(js.undefined)
        ret
    }
    @scala.inline
    def withVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisible: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visible")(js.undefined)
        ret
    }
  }
  
}

