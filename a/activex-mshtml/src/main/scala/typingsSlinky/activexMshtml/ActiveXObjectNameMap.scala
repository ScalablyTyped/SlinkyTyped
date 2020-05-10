package typingsSlinky.activexMshtml

import typingsSlinky.activexMshtml.MSHTML.CTemplatePrinter
import typingsSlinky.activexMshtml.MSHTML.HTMLDocument
import typingsSlinky.activexMshtml.MSHTML.Scriptlet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("ScriptBridge.ScriptBridge")
  var ScriptBridgeDotScriptBridge: Scriptlet = js.native
  @JSName("TemplatePrinter.TemplatePrinter")
  var TemplatePrinterDotTemplatePrinter: CTemplatePrinter = js.native
  var htmlfile: HTMLDocument = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    ScriptBridgeDotScriptBridge: Scriptlet,
    TemplatePrinterDotTemplatePrinter: CTemplatePrinter,
    htmlfile: HTMLDocument
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(htmlfile = htmlfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ScriptBridge.ScriptBridge")(ScriptBridgeDotScriptBridge.asInstanceOf[js.Any])
    __obj.updateDynamic("TemplatePrinter.TemplatePrinter")(TemplatePrinterDotTemplatePrinter.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withScriptBridgeDotScriptBridge(value: Scriptlet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ScriptBridge.ScriptBridge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTemplatePrinterDotTemplatePrinter(value: CTemplatePrinter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TemplatePrinter.TemplatePrinter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlfile(value: HTMLDocument): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlfile")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

