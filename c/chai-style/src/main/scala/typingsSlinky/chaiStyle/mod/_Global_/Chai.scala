package typingsSlinky.chaiStyle.mod._Global_

import typingsSlinky.chai.Chai_.LanguageChains
import typingsSlinky.chai.Chai_.NumericComparison
import typingsSlinky.chai.Chai_.TypeComparison
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Chai")
@js.native
object Chai extends js.Object {
  @js.native
  trait Assertion
    extends LanguageChains
       with NumericComparison
       with TypeComparison {
    def style(styleName: String): Assertion = js.native
    def style(styleName: String, styleValue: String): Assertion = js.native
  }
  
}

