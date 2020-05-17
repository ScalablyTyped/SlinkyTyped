package typingsSlinky.jointjs.mod.dia.ToolsView

import typingsSlinky.jointjs.mod.dia.CellView
import typingsSlinky.jointjs.mod.dia.ToolView
import typingsSlinky.jointjs.mod.mvc.ViewOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends ViewOptions[js.UndefOr[scala.Nothing]] {
  var component: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String | Null] = js.native
  var relatedView: js.UndefOr[CellView] = js.native
  var tools: js.UndefOr[js.Array[ToolView]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComponent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("component")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNameNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(null)
        ret
    }
    @scala.inline
    def withRelatedView(value: CellView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelatedView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relatedView")(js.undefined)
        ret
    }
    @scala.inline
    def withTools(value: js.Array[ToolView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTools: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tools")(js.undefined)
        ret
    }
  }
  
}

