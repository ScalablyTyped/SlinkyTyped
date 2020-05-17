package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RenderUIElements extends js.Object {
  var renderUIElements: js.UndefOr[Boolean] = js.native
  var rootName: js.UndefOr[Boolean] = js.native
  var showAttributeElementId: js.UndefOr[Boolean] = js.native
  var showPriority: js.UndefOr[Boolean] = js.native
  var showType: js.UndefOr[Boolean] = js.native
  var withoutSelection: js.UndefOr[Boolean] = js.native
}

object RenderUIElements {
  @scala.inline
  def apply(): RenderUIElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RenderUIElements]
  }
  @scala.inline
  implicit class RenderUIElementsOps[Self <: RenderUIElements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRenderUIElements(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderUIElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderUIElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderUIElements")(js.undefined)
        ret
    }
    @scala.inline
    def withRootName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootName")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAttributeElementId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAttributeElementId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAttributeElementId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAttributeElementId")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPriority(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPriority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPriority")(js.undefined)
        ret
    }
    @scala.inline
    def withShowType(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showType")(js.undefined)
        ret
    }
    @scala.inline
    def withWithoutSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutSelection")(js.undefined)
        ret
    }
  }
  
}

