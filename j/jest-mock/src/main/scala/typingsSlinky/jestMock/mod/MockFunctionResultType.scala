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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def incomplete: typingsSlinky.jestMock.jestMockStrings.incomplete = this.cast("incomplete")
  @scala.inline
  def `return`: typingsSlinky.jestMock.jestMockStrings.`return` = this.cast("return")
  @scala.inline
  def `throw`: typingsSlinky.jestMock.jestMockStrings.`throw` = this.cast("throw")
}

