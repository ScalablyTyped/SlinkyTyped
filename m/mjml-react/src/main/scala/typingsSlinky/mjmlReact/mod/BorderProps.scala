package typingsSlinky.mjmlReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BorderProps extends js.Object {
  var border: js.UndefOr[String] = js.native
  var borderBottom: js.UndefOr[String] = js.native
  var borderLeft: js.UndefOr[String] = js.native
  var borderRadius: js.UndefOr[String | Double] = js.native
  var borderRight: js.UndefOr[String] = js.native
  var borderTop: js.UndefOr[String] = js.native
}

object BorderProps {
  @scala.inline
  def apply(): BorderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BorderProps]
  }
  @scala.inline
  implicit class BorderPropsOps[Self <: BorderProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("border")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderBottom(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderBottom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderBottom")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderLeft(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderLeft: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderLeft")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderRadius(value: String | Double): Self = {
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
    def withBorderRight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderRight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderRight")(js.undefined)
        ret
    }
    @scala.inline
    def withBorderTop(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBorderTop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderTop")(js.undefined)
        ret
    }
  }
  
}

