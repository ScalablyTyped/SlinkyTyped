package typingsSlinky.antd.gridRowMod

import org.scalajs.dom.raw.HTMLDivElement
import typingsSlinky.antd.antdStrings.`space-around`
import typingsSlinky.antd.antdStrings.`space-between`
import typingsSlinky.antd.antdStrings.bottom
import typingsSlinky.antd.antdStrings.center
import typingsSlinky.antd.antdStrings.end
import typingsSlinky.antd.antdStrings.middle
import typingsSlinky.antd.antdStrings.start
import typingsSlinky.antd.antdStrings.stretch
import typingsSlinky.antd.antdStrings.top
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowProps extends HTMLAttributes[HTMLDivElement] {
  var align: js.UndefOr[top | middle | bottom | stretch] = js.native
  var gutter: js.UndefOr[Gutter | (js.Tuple2[Gutter, Gutter])] = js.native
  var justify: js.UndefOr[start | end | center | `space-around` | `space-between`] = js.native
  var prefixCls: js.UndefOr[String] = js.native
}

object RowProps {
  @scala.inline
  def apply(): RowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowProps]
  }
  @scala.inline
  implicit class RowPropsOps[Self <: RowProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: top | middle | bottom | stretch): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withGutter(value: Gutter | (js.Tuple2[Gutter, Gutter])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGutter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gutter")(js.undefined)
        ret
    }
    @scala.inline
    def withJustify(value: start | end | center | `space-around` | `space-between`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJustify: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("justify")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixCls(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixCls: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(js.undefined)
        ret
    }
  }
  
}

