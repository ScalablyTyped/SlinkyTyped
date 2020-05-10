package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrgChartOptions extends js.Object {
  var allowCollapse: js.UndefOr[Boolean] = js.native
  var allowHtml: js.UndefOr[Boolean] = js.native
  var color: js.UndefOr[String] = js.native
  var nodeClass: js.UndefOr[String] = js.native
  var selectedNodeClass: js.UndefOr[String] = js.native
  var selectionColor: js.UndefOr[String] = js.native
  /**
    * Chart size
    * @type {('small'|'medium'|'large')}
    * @default 'medium'
    */
  var size: js.UndefOr[String] = js.native
}

object OrgChartOptions {
  @scala.inline
  def apply(): OrgChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrgChartOptions]
  }
  @scala.inline
  implicit class OrgChartOptionsOps[Self <: OrgChartOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowCollapse")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHtml")(js.undefined)
        ret
    }
    @scala.inline
    def withColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(js.undefined)
        ret
    }
    @scala.inline
    def withNodeClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNodeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nodeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedNodeClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedNodeClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedNodeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: String): Self = {
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
  }
  
}

