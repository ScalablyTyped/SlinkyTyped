package typingsSlinky.conventionalChangelogWriter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GeneratedContext[TCommit /* <: typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = TContext with typingsSlinky.conventionalChangelogWriter.mod.TransformedCommit[TCommit] with typingsSlinky.conventionalChangelogWriter.mod.GeneratedContext.ExtraContext[TCommit]
  type Omit[T, K /* <: java.lang.String | scala.Double | js.Symbol */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in std.Exclude<keyof T, K> ]: T[P]}
    */ typingsSlinky.conventionalChangelogWriter.conventionalChangelogWriterStrings.Omit with org.scalablytyped.runtime.TopLevel[T]
  type Options[TCommit /* <: typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias conventional-changelog-writer.conventional-changelog-writer.Options<TCommit, TContext> */ js.Object
  type TransformedCommit[T /* <: typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */] = (typingsSlinky.conventionalChangelogWriter.mod.Omit[
    T, 
    typingsSlinky.conventionalChangelogWriter.conventionalChangelogWriterStrings.raw
  ]) with typingsSlinky.conventionalChangelogWriter.anon.Raw[T]
}
