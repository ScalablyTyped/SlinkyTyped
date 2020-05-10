package typingsSlinky.reactRnd.mod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HandleComponent extends js.Object {
  var bottom: js.UndefOr[ReactElement] = js.native
  var bottomLeft: js.UndefOr[ReactElement] = js.native
  var bottomRight: js.UndefOr[ReactElement] = js.native
  var left: js.UndefOr[ReactElement] = js.native
  var right: js.UndefOr[ReactElement] = js.native
  var top: js.UndefOr[ReactElement] = js.native
  var topLeft: js.UndefOr[ReactElement] = js.native
  var topRight: js.UndefOr[ReactElement] = js.native
}

object HandleComponent {
  @scala.inline
  def apply(): HandleComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleComponent]
  }
  @scala.inline
  implicit class HandleComponentOps[Self <: HandleComponent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBottom(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomLeft(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBottomRight(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBottomRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(js.undefined)
        ret
    }
    @scala.inline
    def withLeft(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("left")(js.undefined)
        ret
    }
    @scala.inline
    def withRight(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("right")(js.undefined)
        ret
    }
    @scala.inline
    def withTop(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("top")(js.undefined)
        ret
    }
    @scala.inline
    def withTopLeft(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withTopRight(value: ReactElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTopRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("topRight")(js.undefined)
        ret
    }
  }
  
}

