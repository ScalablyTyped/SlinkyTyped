package typingsSlinky.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendSettings extends js.Object {
  /** Specifies the alignment text for legend
    * @Default {near}
    */
  var alignment: js.UndefOr[String] = js.native
  /** Specifies the alignment text for legend
    * @Default {0}
    */
  var columnCount: js.UndefOr[Double] = js.native
  /** Specifies the dockPosition text for legend
    * @Default {top}
    */
  var dockPosition: js.UndefOr[String] = js.native
  /** Specifies the height for legend
    * @Default {30}
    */
  var height: js.UndefOr[Double] = js.native
  /** Specifies the iconHeight for legend
    * @Default {15}
    */
  var iconHeight: js.UndefOr[Double] = js.native
  /** Specifies the iconWidth for legend
    * @Default {15}
    */
  var iconWidth: js.UndefOr[Double] = js.native
  /** Specifies the leftLabel text for legend
    */
  var leftLabel: js.UndefOr[String] = js.native
  /** Specifies the mode for legendSettings whether default or interactive mode
    * @Default {default}
    */
  var mode: js.UndefOr[String] = js.native
  /** Specifies the rightLabel text for legend
    */
  var rightLabel: js.UndefOr[String] = js.native
  /** Specifies the template for legendSettings
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
  /** Specifies the title text for legend
    */
  var title: js.UndefOr[String] = js.native
  /** Specifies the width for legend
    * @Default {100}
    */
  var width: js.UndefOr[Double] = js.native
}

object LegendSettings {
  @scala.inline
  def apply(): LegendSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendSettings]
  }
  @scala.inline
  implicit class LegendSettingsOps[Self <: LegendSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlignment(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlignment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alignment")(js.undefined)
        ret
    }
    @scala.inline
    def withColumnCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColumnCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columnCount")(js.undefined)
        ret
    }
    @scala.inline
    def withDockPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDockPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dockPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIconHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconHeight")(js.undefined)
        ret
    }
    @scala.inline
    def withIconWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withRightLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightLabel")(js.undefined)
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
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

