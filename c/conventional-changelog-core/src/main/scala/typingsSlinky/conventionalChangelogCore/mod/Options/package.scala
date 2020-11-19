package typingsSlinky.conventionalChangelogCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Options {
  
  // tslint:disable-next-line max-line-length
  type Config[TCommit /* <: typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */, TContext /* <: typingsSlinky.conventionalChangelogWriter.mod.Context */] = js.Promise[js.Object] | js.Function | js.Object
  
  type Logger = js.Function1[/* message */ js.UndefOr[js.Any], scala.Unit]
  
  type Transform[T /* <: typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol] */] = js.ThisFunction2[
    /* this */ typingsSlinky.node.streamMod.Transform, 
    /* commit */ typingsSlinky.conventionalCommitsParser.mod.Commit[java.lang.String | scala.Double | js.Symbol], 
    /* cb */ typingsSlinky.conventionalChangelogCore.mod.Options.Transform.Callback[T], 
    scala.Unit
  ]
}
