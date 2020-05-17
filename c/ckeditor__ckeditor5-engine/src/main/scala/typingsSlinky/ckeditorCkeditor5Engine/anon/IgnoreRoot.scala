package typingsSlinky.ckeditorCkeditor5Engine.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgnoreRoot extends js.Object {
  var ignoreRoot: js.UndefOr[Boolean] = js.native
  var renderUIElements: js.UndefOr[Boolean] = js.native
  var sameSelectionCharacters: js.UndefOr[Boolean] = js.native
  var showAttributeElementId: js.UndefOr[Boolean] = js.native
  var showPriority: js.UndefOr[Boolean] = js.native
  var showType: js.UndefOr[Boolean] = js.native
}

object IgnoreRoot {
  @scala.inline
  def apply(): IgnoreRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreRoot]
  }
  @scala.inline
  implicit class IgnoreRootOps[Self <: IgnoreRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIgnoreRoot(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreRoot")(js.undefined)
        ret
    }
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
    def withSameSelectionCharacters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSelectionCharacters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSameSelectionCharacters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sameSelectionCharacters")(js.undefined)
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
  }
  
}

