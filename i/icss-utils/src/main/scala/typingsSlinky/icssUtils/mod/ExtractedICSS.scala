package typingsSlinky.icssUtils.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtractedICSS extends js.Object {
  var icssExports: CSSExports = js.native
  var icssImports: CSSImports = js.native
}

object ExtractedICSS {
  @scala.inline
  def apply(icssExports: CSSExports, icssImports: CSSImports): ExtractedICSS = {
    val __obj = js.Dynamic.literal(icssExports = icssExports.asInstanceOf[js.Any], icssImports = icssImports.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtractedICSS]
  }
  @scala.inline
  implicit class ExtractedICSSOps[Self <: ExtractedICSS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIcssExports(value: CSSExports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icssExports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIcssImports(value: CSSImports): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icssImports")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

