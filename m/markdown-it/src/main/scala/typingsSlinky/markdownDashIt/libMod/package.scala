package typingsSlinky.markdownDashIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMod {
  import typingsSlinky.markdownDashIt.libRulerMod.Ruler

  type Rule[S /* <: typingsSlinky.markdownDashIt.libRulesUnderscoreCoreStateUnderscoreCoreMod.^ */] = js.Function2[/* state */ S, /* silent */ js.UndefOr[Boolean], Boolean | Unit]
  type RuleBlock = Rule[typingsSlinky.markdownDashIt.libRulesUnderscoreBlockStateUnderscoreBlockMod.^]
  type RuleInline = Rule[typingsSlinky.markdownDashIt.libRulesUnderscoreInlineStateUnderscoreInlineMod.^]
  type RulerBlock = Ruler[typingsSlinky.markdownDashIt.libRulesUnderscoreBlockStateUnderscoreBlockMod.^]
  type RulerInline = Ruler[typingsSlinky.markdownDashIt.libRulesUnderscoreInlineStateUnderscoreInlineMod.^]
  type TokenRender = js.Function5[
    /* tokens */ js.Array[typingsSlinky.markdownDashIt.libTokenMod.^], 
    /* index */ Double, 
    /* options */ js.Any, 
    /* env */ js.Any, 
    /* self */ typingsSlinky.markdownDashIt.libRendererMod.^, 
    String
  ]
}
