package typingsSlinky.markdownIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object parserInlineMod {
  
  type RuleInline = js.Function2[
    /* state */ typingsSlinky.markdownIt.stateInlineMod.^, 
    /* silent */ scala.Boolean, 
    scala.Boolean
  ]
  
  type RuleInline2 = js.Function1[/* state */ typingsSlinky.markdownIt.stateInlineMod.^, scala.Boolean]
}
