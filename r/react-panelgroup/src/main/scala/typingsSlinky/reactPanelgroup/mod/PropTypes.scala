package typingsSlinky.reactPanelgroup.mod

import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.column
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropTypes extends js.Object {
  var borderColor: js.UndefOr[String] = js.native
  var direction: js.UndefOr[row | column] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* data */ PanelWidth, Unit]] = js.native
  var panelColor: js.UndefOr[String] = js.native
  var panelWidths: js.UndefOr[js.Array[PanelWidth | Null]] = js.native
  var spacing: js.UndefOr[Double] = js.native
}

object PropTypes {
  @scala.inline
  def apply(): PropTypes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropTypes]
  }
  @scala.inline
  implicit class PropTypesOps[Self <: PropTypes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withDirection(value: row | column): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* data */ PanelWidth => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelColor")(js.undefined)
        ret
    }
    @scala.inline
    def withPanelWidths(value: js.Array[PanelWidth | Null]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelWidths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPanelWidths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("panelWidths")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
  }
  
}

