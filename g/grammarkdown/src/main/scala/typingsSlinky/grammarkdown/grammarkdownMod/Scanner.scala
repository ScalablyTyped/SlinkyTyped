package typingsSlinky.grammarkdown.grammarkdownMod

import typingsSlinky.prex.prexMod.CancellationToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "Scanner")
@js.native
class Scanner protected ()
  extends typingsSlinky.grammarkdown.distScannerMod.Scanner {
  def this(
    filename: String,
    text: String,
    diagnostics: typingsSlinky.grammarkdown.distDiagnosticsMod.DiagnosticMessages
  ) = this()
  def this(
    filename: String,
    text: String,
    diagnostics: typingsSlinky.grammarkdown.distDiagnosticsMod.DiagnosticMessages,
    cancellationToken: CancellationToken
  ) = this()
}

