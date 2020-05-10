package typingsSlinky.reactBootstrap.clearfixMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClearfixProps
  extends AllHTMLAttributes[Clearfix]
     with ClassAttributes[Clearfix] {
  var bsClass: js.UndefOr[String] = js.native
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.native
  var visibleLgBlock: js.UndefOr[Boolean] = js.native
  var visibleMdBlock: js.UndefOr[Boolean] = js.native
  var visibleSmBlock: js.UndefOr[Boolean] = js.native
  var visibleXsBlock: js.UndefOr[Boolean] = js.native
}

object ClearfixProps {
  @scala.inline
  def apply(): ClearfixProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClearfixProps]
  }
  @scala.inline
  implicit class ClearfixPropsOps[Self <: ClearfixProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withComponentClassFunctionComponent(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClassComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentClass(value: ReactComponentClass[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentClass")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleLgBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleLgBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleLgBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleLgBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleMdBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMdBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleMdBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleMdBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleSmBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleSmBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleSmBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleSmBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleXsBlock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleXsBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleXsBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleXsBlock")(js.undefined)
        ret
    }
  }
  
}

