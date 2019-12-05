package typingsSlinky.eslint.eslintMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.eslint.eslintMod.Linter.Config
import typingsSlinky.eslint.eslintMod.Linter.FixOptions
import typingsSlinky.eslint.eslintMod.Linter.FixReport
import typingsSlinky.eslint.eslintMod.Linter.LintMessage
import typingsSlinky.eslint.eslintMod.Linter.LintOptions
import typingsSlinky.eslint.eslintMod.Linter.ParserModule
import typingsSlinky.eslint.eslintMod.Rule.RuleModule
import typingsSlinky.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "Linter")
@js.native
class Linter_ () extends js.Object {
  var version: String = js.native
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
}

