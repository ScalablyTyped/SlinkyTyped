package typingsSlinky.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiagramConnectionDefaults extends js.Object {
  var content: js.UndefOr[DiagramConnectionDefaultsContent] = js.native
  var editable: js.UndefOr[Boolean | DiagramConnectionDefaultsEditable] = js.native
  var endCap: js.UndefOr[String | DiagramConnectionDefaultsEndCap] = js.native
  var fromConnector: js.UndefOr[String] = js.native
  var hover: js.UndefOr[DiagramConnectionDefaultsHover] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selection: js.UndefOr[DiagramConnectionDefaultsSelection] = js.native
  var startCap: js.UndefOr[String | DiagramConnectionDefaultsStartCap] = js.native
  var stroke: js.UndefOr[DiagramConnectionDefaultsStroke] = js.native
  var toConnector: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DiagramConnectionDefaults {
  @scala.inline
  def apply(): DiagramConnectionDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiagramConnectionDefaults]
  }
  @scala.inline
  implicit class DiagramConnectionDefaultsOps[Self <: DiagramConnectionDefaults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: DiagramConnectionDefaultsContent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean | DiagramConnectionDefaultsEditable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withEndCap(value: String | DiagramConnectionDefaultsEndCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endCap")(js.undefined)
        ret
    }
    @scala.inline
    def withFromConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFromConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fromConnector")(js.undefined)
        ret
    }
    @scala.inline
    def withHover(value: DiagramConnectionDefaultsHover): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hover")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectable")(js.undefined)
        ret
    }
    @scala.inline
    def withSelection(value: DiagramConnectionDefaultsSelection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selection")(js.undefined)
        ret
    }
    @scala.inline
    def withStartCap(value: String | DiagramConnectionDefaultsStartCap): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartCap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startCap")(js.undefined)
        ret
    }
    @scala.inline
    def withStroke(value: DiagramConnectionDefaultsStroke): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStroke: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stroke")(js.undefined)
        ret
    }
    @scala.inline
    def withToConnector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConnector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToConnector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toConnector")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

