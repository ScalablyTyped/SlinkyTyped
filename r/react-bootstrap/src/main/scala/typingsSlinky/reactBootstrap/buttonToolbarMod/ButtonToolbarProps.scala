package typingsSlinky.reactBootstrap.buttonToolbarMod

import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonToolbarProps
  extends AllHTMLAttributes[ButtonToolbar]
     with ClassAttributes[ButtonToolbar] {
  var block: js.UndefOr[Boolean] = js.native
  var bsClass: js.UndefOr[String] = js.native
  var bsSize: js.UndefOr[Sizes] = js.native
  var bsStyle: js.UndefOr[String] = js.native
  var justified: js.UndefOr[Boolean] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object ButtonToolbarProps {
  @scala.inline
  def apply(): ButtonToolbarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonToolbarProps]
  }
  @scala.inline
  implicit class ButtonToolbarPropsOps[Self <: ButtonToolbarProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(js.undefined)
        ret
    }
    @scala.inline
    def withBsClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsClass")(js.undefined)
        ret
    }
    @scala.inline
    def withBsSize(value: Sizes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsSize")(js.undefined)
        ret
    }
    @scala.inline
    def withBsStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBsStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bsStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withJustified(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justified")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustified: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justified")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

