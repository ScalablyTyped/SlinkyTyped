package typingsSlinky.forkTsCheckerWebpackPlugin

import typingsSlinky.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueWebpackErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueWebpackError", "IssueWebpackError")
  @js.native
  class IssueWebpackError protected () extends Error {
    def this(message: String, issue: Issue) = this()
    
    val file: js.UndefOr[String] = js.native
    
    val hideStack: /* true */ Boolean = js.native
    
    val issue: Issue = js.native
  }
}
