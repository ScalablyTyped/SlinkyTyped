package typingsSlinky.eslint.mod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.eslint.anon.Cwd
import typingsSlinky.eslint.mod.Linter.Config
import typingsSlinky.eslint.mod.Linter.FixOptions
import typingsSlinky.eslint.mod.Linter.FixReport
import typingsSlinky.eslint.mod.Linter.LintMessage
import typingsSlinky.eslint.mod.Linter.LintOptions
import typingsSlinky.eslint.mod.Linter.ParserModule
import typingsSlinky.eslint.mod.Rule.RuleModule
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("eslint", "Linter")
@js.native
class Linter_ () extends js.Object {
  def this(options: Cwd) = this()
  
  def defineParser(name: String, parser: ParserModule): Unit = js.native
  
  def defineRule(name: String, rule: RuleModule): Unit = js.native
  
  def defineRules(rules: StringDictionary[RuleModule]): Unit = js.native
  
  def getRules(): Map[String, RuleModule] = js.native
  
  def getSourceCode(): SourceCode = js.native
  
  def verify(code: String, config: Config): js.Array[LintMessage] = js.native
  def verify(code: String, config: Config, filename: String): js.Array[LintMessage] = js.native
  def verify(code: String, config: Config, options: LintOptions): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config, filename: String): js.Array[LintMessage] = js.native
  def verify(code: SourceCode, config: Config, options: LintOptions): js.Array[LintMessage] = js.native
  
  def verifyAndFix(code: String, config: Config): FixReport = js.native
  def verifyAndFix(code: String, config: Config, filename: String): FixReport = js.native
  def verifyAndFix(code: String, config: Config, options: FixOptions): FixReport = js.native
  
  var version: String = js.native
}
