package typingsSlinky.chaiLike.mod

import typingsSlinky.chai.Chai.LanguageChains
import typingsSlinky.chai.Chai.NumericComparison
import typingsSlinky.chai.Chai.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object Chai extends js.Object {
    @js.native
    trait Assertion
      extends LanguageChains
         with NumericComparison
         with TypeComparison {
      def like(expected: js.Any): Unit = js.native
    }
    
  }
  
}

