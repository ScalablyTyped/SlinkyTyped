package typingsSlinky.autolinker.anchorTagBuilderMod

import typingsSlinky.autolinker.autolinkerMod.TruncateConfigObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorTagBuilderCfg extends js.Object {
  var className: js.UndefOr[String] = js.native
  var newWindow: js.UndefOr[Boolean] = js.native
  var truncate: js.UndefOr[TruncateConfigObj] = js.native
}

object AnchorTagBuilderCfg {
  @scala.inline
  def apply(): AnchorTagBuilderCfg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorTagBuilderCfg]
  }
  @scala.inline
  implicit class AnchorTagBuilderCfgOps[Self <: AnchorTagBuilderCfg] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withNewWindow(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewWindow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newWindow")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncate(value: TruncateConfigObj): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncate")(js.undefined)
        ret
    }
  }
  
}

