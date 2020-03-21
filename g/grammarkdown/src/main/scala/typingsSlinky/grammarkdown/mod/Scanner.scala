package typingsSlinky.grammarkdown.mod

import typingsSlinky.prex.mod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    cancellationToken: CancellationToken
  ) = this()
}

