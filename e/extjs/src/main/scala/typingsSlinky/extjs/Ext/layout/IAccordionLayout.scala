package typingsSlinky.extjs.Ext.layout

import typingsSlinky.extjs.Ext.layout.container.IVBox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccordionLayout extends IVBox {
  /** [Config Option] (Boolean) */
  var activeOnTop: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var animate: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var autoWidth: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var collapseFirst: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var fill: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var hideCollapseTool: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var multi: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Boolean) */
  var titleCollapse: js.UndefOr[Boolean] = js.native
}

object IAccordionLayout {
  @scala.inline
  def apply(): IAccordionLayout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAccordionLayout]
  }
  @scala.inline
  implicit class IAccordionLayoutOps[Self <: IAccordionLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActiveOnTop(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOnTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveOnTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeOnTop")(js.undefined)
        ret
    }
    @scala.inline
    def withAnimate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnimate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("animate")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoWidth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapseFirst(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFirst")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseFirst")(js.undefined)
        ret
    }
    @scala.inline
    def withFill(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFill: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(js.undefined)
        ret
    }
    @scala.inline
    def withHideCollapseTool(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCollapseTool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideCollapseTool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideCollapseTool")(js.undefined)
        ret
    }
    @scala.inline
    def withMulti(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMulti: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multi")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCollapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleCollapse")(js.undefined)
        ret
    }
  }
  
}

