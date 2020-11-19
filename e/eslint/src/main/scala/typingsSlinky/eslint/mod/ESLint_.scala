package typingsSlinky.eslint.mod

import typingsSlinky.eslint.anon.FilePath
import typingsSlinky.eslint.mod.ESLint.Formatter
import typingsSlinky.eslint.mod.ESLint.LintResult
import typingsSlinky.eslint.mod.ESLint.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eslint", "ESLint")
@js.native
class ESLint_ protected () extends js.Object {
  def this(options: Options) = this()
  
  def calculateConfigForFile(filePath: String): js.Promise[_] = js.native
  
  def isPathIgnored(filePath: String): js.Promise[Boolean] = js.native
  
  def lintFiles(patterns: String): js.Promise[js.Array[LintResult]] = js.native
  def lintFiles(patterns: js.Array[String]): js.Promise[js.Array[LintResult]] = js.native
  
  def lintText(code: String): js.Promise[js.Array[LintResult]] = js.native
  def lintText(code: String, options: FilePath): js.Promise[js.Array[LintResult]] = js.native
  
  def loadFormatter(): js.Promise[Formatter] = js.native
  def loadFormatter(nameOrPath: String): js.Promise[Formatter] = js.native
}
