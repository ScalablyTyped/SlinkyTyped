package typingsSlinky.antDesignPro.anon

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseText extends js.Object {
  var collapseText: js.UndefOr[TagMod[Any]] = js.native
  var expandText: js.UndefOr[TagMod[Any]] = js.native
  var selectAllText: js.UndefOr[TagMod[Any]] = js.native
}

object CollapseText {
  @scala.inline
  def apply(): CollapseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseText]
  }
  @scala.inline
  implicit class CollapseTextOps[Self <: CollapseText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCollapseTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollapseText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapseText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapseText")(js.undefined)
        ret
    }
    @scala.inline
    def withExpandTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpandText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpandText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expandText")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectAllTextReactElement(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectAllText(value: TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectAllText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectAllText")(js.undefined)
        ret
    }
  }
  
}

