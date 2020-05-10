package typingsSlinky.reactCalendarTimeline.mod

import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetResizeProps extends js.Object {
  var leftClassName: js.UndefOr[String] = js.native
  var leftStyle: js.UndefOr[CSSProperties] = js.native
  var rightClassName: js.UndefOr[String] = js.native
  var rightStyle: js.UndefOr[CSSProperties] = js.native
}

object GetResizeProps {
  @scala.inline
  def apply(): GetResizeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResizeProps]
  }
  @scala.inline
  implicit class GetResizePropsOps[Self <: GetResizeProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLeftClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withLeftStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeftStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leftStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRightClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightClassName")(js.undefined)
        ret
    }
    @scala.inline
    def withRightStyle(value: CSSProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRightStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rightStyle")(js.undefined)
        ret
    }
  }
  
}

