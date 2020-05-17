package typingsSlinky.jsreportHtmlToXlsx.anon

import typingsSlinky.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod.htmlEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlEngine extends js.Object {
  var htmlEngine: typingsSlinky.jsreportHtmlToXlsx.mod.jsreportCoreAugmentingMod.htmlEngine = js.native
}

object HtmlEngine {
  @scala.inline
  def apply(htmlEngine: htmlEngine): HtmlEngine = {
    val __obj = js.Dynamic.literal(htmlEngine = htmlEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlEngine]
  }
  @scala.inline
  implicit class HtmlEngineOps[Self <: HtmlEngine] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmlEngine(value: htmlEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlEngine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

