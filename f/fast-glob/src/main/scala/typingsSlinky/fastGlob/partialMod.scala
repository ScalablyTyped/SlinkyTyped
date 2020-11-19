package typingsSlinky.fastGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-glob/out/providers/matchers/partial", JSImport.Namespace)
@js.native
object partialMod extends js.Object {
  
  @js.native
  trait PartialMatcher
    extends typingsSlinky.fastGlob.matcherMod.default {
    
    def `match`(filepath: String): Boolean = js.native
  }
  
  @js.native
  class default () extends PartialMatcher
}
