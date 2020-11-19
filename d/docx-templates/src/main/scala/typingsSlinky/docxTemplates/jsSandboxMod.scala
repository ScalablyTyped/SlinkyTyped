package typingsSlinky.docxTemplates

import typingsSlinky.docxTemplates.typesMod.Context
import typingsSlinky.docxTemplates.typesMod.ReportData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("docx-templates/lib/jsSandbox", JSImport.Namespace)
@js.native
object jsSandboxMod extends js.Object {
  
  def runUserJsAndGetRaw(data: js.UndefOr[scala.Nothing], code: String, ctx: Context): js.Promise[_] = js.native
  def runUserJsAndGetRaw(data: ReportData, code: String, ctx: Context): js.Promise[_] = js.native
}
