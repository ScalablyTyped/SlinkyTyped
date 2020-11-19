package typingsSlinky.conventionalChangelogCore.mod

import typingsSlinky.conventionalCommitsParser.mod.Commit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriterOptions[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */]
  extends typingsSlinky.conventionalChangelogWriter.mod.Options[TCommit, MergedContext[TContext]]
object WriterOptions {
  
  @scala.inline
  def apply[TCommit /* <: Commit[String | Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */](): WriterOptions[TCommit, TContext] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WriterOptions[TCommit, TContext]]
  }
}
