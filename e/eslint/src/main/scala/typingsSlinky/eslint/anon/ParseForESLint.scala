package typingsSlinky.eslint.anon

import typingsSlinky.eslint.mod.Linter.ESLintParseResult
import typingsSlinky.eslint.mod.Linter.ParserModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseForESLint extends ParserModule {
  
  def parseForESLint(text: String): ESLintParseResult = js.native
  def parseForESLint(text: String, options: js.Any): ESLintParseResult = js.native
}
