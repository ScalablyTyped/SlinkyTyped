package typingsSlinky.reactBootstrap.colMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.AllHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColProps
  extends AllHTMLAttributes[Col]
     with ClassAttributes[Col] {
  var componentClass: js.UndefOr[ReactComponentClass[_]] = js.native
  var lg: js.UndefOr[Double] = js.native
  var lgHidden: js.UndefOr[Boolean] = js.native
  var lgOffset: js.UndefOr[Double] = js.native
  var lgPull: js.UndefOr[Double] = js.native
  var lgPush: js.UndefOr[Double] = js.native
  var md: js.UndefOr[Double] = js.native
  var mdHidden: js.UndefOr[Boolean] = js.native
  var mdOffset: js.UndefOr[Double] = js.native
  var mdPull: js.UndefOr[Double] = js.native
  var mdPush: js.UndefOr[Double] = js.native
  var sm: js.UndefOr[Double] = js.native
  var smHidden: js.UndefOr[Boolean] = js.native
  var smOffset: js.UndefOr[Double] = js.native
  var smPull: js.UndefOr[Double] = js.native
  var smPush: js.UndefOr[Double] = js.native
  var xs: js.UndefOr[Double] = js.native
  var xsHidden: js.UndefOr[Boolean] = js.native
  var xsOffset: js.UndefOr[Double] = js.native
  var xsPull: js.UndefOr[Double] = js.native
  var xsPush: js.UndefOr[Double] = js.native
}

object ColProps {
  @scala.inline
  def apply(): ColProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColProps]
  }
  @scala.inline
  implicit class ColPropsOps[Self <: ColProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLg(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lg")(js.undefined)
        ret
    }
    @scala.inline
    def withLgHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withLgOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withLgPull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPull")(js.undefined)
        ret
    }
    @scala.inline
    def withLgPush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLgPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lgPush")(js.undefined)
        ret
    }
    @scala.inline
    def withMd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("md")(js.undefined)
        ret
    }
    @scala.inline
    def withMdHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withMdOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withMdPull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPull")(js.undefined)
        ret
    }
    @scala.inline
    def withMdPush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMdPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mdPush")(js.undefined)
        ret
    }
    @scala.inline
    def withSm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sm")(js.undefined)
        ret
    }
    @scala.inline
    def withSmHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withSmOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withSmPull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPull")(js.undefined)
        ret
    }
    @scala.inline
    def withSmPush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSmPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("smPush")(js.undefined)
        ret
    }
    @scala.inline
    def withXs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xs")(js.undefined)
        ret
    }
    @scala.inline
    def withXsHidden(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsHidden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsHidden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsHidden")(js.undefined)
        ret
    }
    @scala.inline
    def withXsOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withXsPull(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsPull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsPull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsPull")(js.undefined)
        ret
    }
    @scala.inline
    def withXsPush(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsPush")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXsPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xsPush")(js.undefined)
        ret
    }
  }
  
}

