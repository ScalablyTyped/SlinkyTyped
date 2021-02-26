package typingsSlinky.ecmarkup

import org.scalajs.dom.raw.Document
import typingsSlinky.ecmarkup.specMod.Spec
import typingsSlinky.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lintMod {
  
  @JSImport("ecmarkup/lib/lint/lint", "lint")
  @js.native
  def lint(report: js.Function1[/* err */ Warning, Unit], sourceText: String, spec: Spec, document: Document): Unit = js.native
}
