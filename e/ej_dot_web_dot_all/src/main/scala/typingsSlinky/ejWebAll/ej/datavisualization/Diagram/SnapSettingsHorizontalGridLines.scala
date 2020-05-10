package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnapSettingsHorizontalGridLines extends js.Object {
  /** Defines the line color of horizontal grid lines
    * @Default {lightgray}
    */
  var lineColor: js.UndefOr[String] = js.native
  /** Specifies the pattern of dashes and gaps used to stroke horizontal grid lines
    */
  var lineDashArray: js.UndefOr[String] = js.native
  /** A pattern of lines and gaps that defines a set of horizontal gridlines
    * @Default {[1.25, 18.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75, 0.25, 19.75]}
    */
  var linesInterval: js.UndefOr[js.Array[_]] = js.native
  /** Specifies a set of intervals to snap the objects
    * @Default {[20]}
    */
  var snapInterval: js.UndefOr[js.Array[_]] = js.native
}

object SnapSettingsHorizontalGridLines {
  @scala.inline
  def apply(): SnapSettingsHorizontalGridLines = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapSettingsHorizontalGridLines]
  }
  @scala.inline
  implicit class SnapSettingsHorizontalGridLinesOps[Self <: SnapSettingsHorizontalGridLines] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLineColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineColor")(js.undefined)
        ret
    }
    @scala.inline
    def withLineDashArray(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineDashArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineDashArray")(js.undefined)
        ret
    }
    @scala.inline
    def withLinesInterval(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinesInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linesInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapInterval(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapInterval")(js.undefined)
        ret
    }
  }
  
}

