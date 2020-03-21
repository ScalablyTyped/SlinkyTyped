package typingsSlinky.relayCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object irvisitorMod {
  type NodeVisitor = typingsSlinky.relayCompiler.irvisitorMod.EnterLeave[typingsSlinky.relayCompiler.AnonArgument] | typingsSlinky.relayCompiler.AnonClientExtension
  type NodeVisitorObject[T /* <: typingsSlinky.relayCompiler.irvisitorMod.VisitNode */] = typingsSlinky.relayCompiler.irvisitorMod.EnterLeave[typingsSlinky.relayCompiler.irvisitorMod.VisitFn[T]] | typingsSlinky.relayCompiler.irvisitorMod.VisitFn[T]
  type VisitFn[T /* <: typingsSlinky.relayCompiler.irvisitorMod.VisitNode */] = js.Function5[
    /* node */ T, 
    /* key */ js.UndefOr[js.Any], 
    /* parent */ js.UndefOr[
      scala.Null | typingsSlinky.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsSlinky.relayCompiler.irvisitorMod.VisitNode]
    ], 
    /* path */ js.UndefOr[js.Array[js.Any]], 
    /* ancestors */ js.UndefOr[
      js.Array[
        typingsSlinky.relayCompiler.irvisitorMod.VisitNode | js.Array[typingsSlinky.relayCompiler.irvisitorMod.VisitNode]
      ]
    ], 
    // Note: ancestors includes arrays which contain the visited node
  // These correspond to array indices in `path`.
  js.Any
  ]
}
