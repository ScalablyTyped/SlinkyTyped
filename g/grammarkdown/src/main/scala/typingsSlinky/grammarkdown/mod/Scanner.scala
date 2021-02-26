package typingsSlinky.grammarkdown.mod

import typingsSlinky.esfxCancelable.distMod.Cancelable
import typingsSlinky.prex.mod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("grammarkdown", "Scanner")
@js.native
class Scanner protected ()
  extends typingsSlinky.grammarkdown.scannerMod.Scanner {
  def this(
    filename: String,
    text: String,
    diagnostics: typingsSlinky.grammarkdown.diagnosticsMod.DiagnosticMessages
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typingsSlinky.grammarkdown.diagnosticsMod.DiagnosticMessages,
    cancelable: Cancelable
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typingsSlinky.grammarkdown.diagnosticsMod.DiagnosticMessages,
    cancelable: CancellationToken
  ) = this()
}
