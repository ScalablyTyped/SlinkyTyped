package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.Document
import typingsSlinky.ecmarkup.algorithmErrorReporterTypeMod.Reporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/lint", JSImport.Namespace)
@js.native
object lintMod extends js.Object {
  
  def lint(report: Reporter, sourceText: String, dom: js.Any, document: Document): Unit = js.native
}
