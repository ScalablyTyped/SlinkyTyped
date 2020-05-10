package typingsSlinky.reactShare.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconComponentProps extends js.Object {
  /** Allow rounded corners if using rect icons */
  var borderRadius: js.UndefOr[Double] = js.native
  /** Customize background style, e.g. fill */
  var iconBgStyle: js.UndefOr[CSSProperties] = js.native
  /**
    * Customize logo's fill color
    * @default 'white'
    */
  var logoFillColor: js.UndefOr[String] = js.native
  /** Whether to show round or rect icons */
  var round: js.UndefOr[Boolean] = js.native
  /** Icon size in pixels */
  var size: js.UndefOr[Double] = js.native
}

object IconComponentProps {
  @scala.inline
  def apply(): IconComponentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconComponentProps]
  }
  @scala.inline
  implicit class IconComponentPropsOps[Self <: IconComponentProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRadius: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRadius")(js.undefined)
        ret
    }
    @scala.inline
    def withIconBgStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconBgStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIconBgStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iconBgStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoFillColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoFillColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoFillColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoFillColor")(js.undefined)
        ret
    }
    @scala.inline
    def withRound(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRound: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("round")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: Double): Self = {
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

