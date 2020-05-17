package typingsSlinky.jointjs.anon

import org.scalajs.dom.raw.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ellipsis extends js.Object {
  var ellipsis: js.UndefOr[Boolean | String] = js.native
  var eol: js.UndefOr[String] = js.native
  var hyphen: js.UndefOr[String | js.RegExp] = js.native
  var separator: js.UndefOr[String | js.Any] = js.native
  var svgDocument: js.UndefOr[SVGElement] = js.native
}

object Ellipsis {
  @scala.inline
  def apply(): Ellipsis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ellipsis]
  }
  @scala.inline
  implicit class EllipsisOps[Self <: Ellipsis] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEllipsis(value: Boolean | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEllipsis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ellipsis")(js.undefined)
        ret
    }
    @scala.inline
    def withEol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eol")(js.undefined)
        ret
    }
    @scala.inline
    def withHyphenRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyphen(value: String | js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHyphen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyphen")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgDocument(value: SVGElement): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgDocument")(js.undefined)
        ret
    }
  }
  
}

