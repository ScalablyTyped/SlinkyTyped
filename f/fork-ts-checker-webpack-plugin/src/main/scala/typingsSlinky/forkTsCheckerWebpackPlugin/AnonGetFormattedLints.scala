package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.eslint.mod.CLIEngine.LintReport
import typingsSlinky.forkTsCheckerWebpackPlugin.normalizedMessageMod.NormalizedMessage
import typingsSlinky.std.IterableIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonGetFormattedLints extends js.Object {
  def getFormattedLints(lintReports: js.Array[LintReport]): js.Array[NormalizedMessage] = js.native
  def getFormattedLints(lintReports: IterableIterator[LintReport]): js.Array[NormalizedMessage] = js.native
  def getLints(filepath: String): js.UndefOr[LintReport] = js.native
}

