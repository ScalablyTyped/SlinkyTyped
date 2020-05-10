package typingsSlinky.aureliaBinding.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGAnalyzer extends js.Object {
  def isStandardSvgAttribute(nodeName: String, attributeName: String): Boolean = js.native
}

object SVGAnalyzer {
  @scala.inline
  def apply(isStandardSvgAttribute: (String, String) => Boolean): SVGAnalyzer = {
    val __obj = js.Dynamic.literal(isStandardSvgAttribute = js.Any.fromFunction2(isStandardSvgAttribute))
    __obj.asInstanceOf[SVGAnalyzer]
  }
  @scala.inline
  implicit class SVGAnalyzerOps[Self <: SVGAnalyzer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsStandardSvgAttribute(value: (String, String) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStandardSvgAttribute")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

