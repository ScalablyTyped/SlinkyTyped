package typingsSlinky.jestMock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Possible types of a MockFunctionResult.
  * 'return': The call completed by returning normally.
  * 'throw': The call completed by throwing a value.
  * 'incomplete': The call has not completed yet. This is possible if you read
  *               the  mock function result from within the mock function itself
  *               (or a function called by the mock function).
  */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.jestMock.jestMockStrings.`return`
  - typingsSlinky.jestMock.jestMockStrings.`throw`
  - typingsSlinky.jestMock.jestMockStrings.incomplete
*/
trait MockFunctionResultType extends js.Object

object MockFunctionResultType {
  @scala.inline
  def incomplete: typingsSlinky.jestMock.jestMockStrings.incomplete = "incomplete".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.incomplete]
  @scala.inline
  def `return`: typingsSlinky.jestMock.jestMockStrings.`return` = "return".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.`return`]
  @scala.inline
  def `throw`: typingsSlinky.jestMock.jestMockStrings.`throw` = "throw".asInstanceOf[typingsSlinky.jestMock.jestMockStrings.`throw`]
}

