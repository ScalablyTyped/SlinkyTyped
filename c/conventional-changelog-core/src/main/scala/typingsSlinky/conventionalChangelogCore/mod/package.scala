package typingsSlinky.conventionalChangelogCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type MergedContext[T /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = T with typingsSlinky.conventionalChangelogCore.mod.MergedContext.ExtraContext
  
  type Options[TCommit /* <: typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = typingsSlinky.conventionalChangelogCore.mod.Options_[TCommit, TContext]
}
