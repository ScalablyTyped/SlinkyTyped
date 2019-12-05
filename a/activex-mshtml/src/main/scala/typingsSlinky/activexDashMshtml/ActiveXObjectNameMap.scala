package typingsSlinky.activexDashMshtml

import typingsSlinky.activexDashMshtml.MSHTML.CTemplatePrinter
import typingsSlinky.activexDashMshtml.MSHTML.HTMLDocument
import typingsSlinky.activexDashMshtml.MSHTML.Scriptlet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `ScriptBridge.ScriptBridge`: Scriptlet
  var `TemplatePrinter.TemplatePrinter`: CTemplatePrinter
  var htmlfile: HTMLDocument
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `ScriptBridge.ScriptBridge`: Scriptlet,
    `TemplatePrinter.TemplatePrinter`: CTemplatePrinter,
    htmlfile: HTMLDocument
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal(htmlfile = htmlfile.asInstanceOf[js.Any])
    __obj.updateDynamic("ScriptBridge.ScriptBridge")(`ScriptBridge.ScriptBridge`.asInstanceOf[js.Any])
    __obj.updateDynamic("TemplatePrinter.TemplatePrinter")(`TemplatePrinter.TemplatePrinter`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

