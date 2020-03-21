package typingsSlinky.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  type Rule[S /* <: typingsSlinky.markdownIt.stateCoreMod.^ */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[scala.Boolean], scala.Boolean | scala.Unit]
  type RuleBlock = typingsSlinky.markdownIt.libMod.Rule[typingsSlinky.markdownIt.stateBlockMod.^]
  type RuleInline = typingsSlinky.markdownIt.libMod.Rule[typingsSlinky.markdownIt.stateInlineMod.^]
  type RulerBlock = typingsSlinky.markdownIt.rulerMod.Ruler[typingsSlinky.markdownIt.stateBlockMod.^]
  type RulerInline = typingsSlinky.markdownIt.rulerMod.Ruler[typingsSlinky.markdownIt.stateInlineMod.^]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[typingsSlinky.markdownIt.tokenMod.^], 
    /* index */ scala.Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ typingsSlinky.markdownIt.rendererMod.^, 
    java.lang.String
  ]
}
