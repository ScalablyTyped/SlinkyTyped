package typingsSlinky.intlMessageformatParser.mod

import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.`class`
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.any
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.end
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.literal
import typingsSlinky.intlMessageformatParser.intlMessageformatParserStrings.other
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.intlMessageformatParser.mod.ILiteralExpectation
  - typingsSlinky.intlMessageformatParser.mod.IClassExpectation
  - typingsSlinky.intlMessageformatParser.mod.IAnyExpectation
  - typingsSlinky.intlMessageformatParser.mod.IEndExpectation
  - typingsSlinky.intlMessageformatParser.mod.IOtherExpectation
*/
trait Expectation extends js.Object

object Expectation {
  @scala.inline
  def IClassExpectation(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IAnyExpectation(`type`: any): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def ILiteralExpectation(ignoreCase: Boolean, text: String, `type`: literal): Expectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IOtherExpectation(description: String, `type`: other): Expectation = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
  @scala.inline
  def IEndExpectation(`type`: end): Expectation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expectation]
  }
}

