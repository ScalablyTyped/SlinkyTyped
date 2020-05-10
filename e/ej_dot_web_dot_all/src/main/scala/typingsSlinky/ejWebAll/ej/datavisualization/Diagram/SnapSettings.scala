package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapSettings extends js.Object {
  /** Enables or disables snapping nodes/connectors to objects
    * @Default {true}
    */
  var enableSnapToObject: js.UndefOr[Boolean] = js.native
  /** Defines the appearance of horizontal gridlines
    */
  var horizontalGridLines: js.UndefOr[SnapSettingsHorizontalGridLines] = js.native
  /** Defines the angle by which the object needs to be snapped
    * @Default {5}
    */
  var snapAngle: js.UndefOr[Double] = js.native
  /** Defines and sets the snapConstraints
    */
  var snapConstraints: js.UndefOr[SnapConstraints | String] = js.native
  /** Defines the minimum distance between the selected object and the nearest object
    * @Default {5}
    */
  var snapObjectDistance: js.UndefOr[Double] = js.native
  /** Defines the appearance of horizontal gridlines
    */
  var verticalGridLines: js.UndefOr[SnapSettingsVerticalGridLines] = js.native
}

object SnapSettings {
  @scala.inline
  def apply(): SnapSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapSettings]
  }
  @scala.inline
  implicit class SnapSettingsOps[Self <: SnapSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnableSnapToObject(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSnapToObject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSnapToObject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSnapToObject")(js.undefined)
        ret
    }
    @scala.inline
    def withHorizontalGridLines(value: SnapSettingsHorizontalGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHorizontalGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("horizontalGridLines")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapAngle(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapAngle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapAngle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapAngle")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapConstraints(value: SnapConstraints | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapObjectDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapObjectDistance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapObjectDistance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapObjectDistance")(js.undefined)
        ret
    }
    @scala.inline
    def withVerticalGridLines(value: SnapSettingsVerticalGridLines): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGridLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerticalGridLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verticalGridLines")(js.undefined)
        ret
    }
  }
  
}

