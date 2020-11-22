package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.anon.Typeofts
import typingsSlinky.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typingsSlinky.typescript.mod.Diagnostic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fork-ts-checker-webpack-plugin/lib/typescript-reporter/issue/TypeScriptIssueFactory", JSImport.Namespace)
@js.native
object typeScriptIssueFactoryMod extends js.Object {
  
  def createIssuesFromTsDiagnostics(typescript: Typeofts, diagnostics: js.Array[Diagnostic]): js.Array[Issue] = js.native
}
