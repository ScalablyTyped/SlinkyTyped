package typingsSlinky.reactNativeSvg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextPathProps extends TextSpecificProps {
  var href: js.UndefOr[String] = js.native
  var method: js.UndefOr[TextPathMethod] = js.native
  var midLine: js.UndefOr[TextPathMidLine] = js.native
  var spacing: js.UndefOr[TextPathSpacing] = js.native
  var startOffset: js.UndefOr[NumberProp] = js.native
  var xlinkHref: js.UndefOr[String] = js.native
}

object TextPathProps {
  @scala.inline
  def apply(): TextPathProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextPathProps]
  }
  @scala.inline
  implicit class TextPathPropsOps[Self <: TextPathProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: TextPathMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withMidLine(value: TextPathMidLine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midLine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMidLine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("midLine")(js.undefined)
        ret
    }
    @scala.inline
    def withSpacing(value: TextPathSpacing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpacing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spacing")(js.undefined)
        ret
    }
    @scala.inline
    def withStartOffset(value: NumberProp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withXlinkHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlinkHref")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXlinkHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xlinkHref")(js.undefined)
        ret
    }
  }
  
}

