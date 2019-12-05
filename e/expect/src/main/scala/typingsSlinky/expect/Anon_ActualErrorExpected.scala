package typingsSlinky.expect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActualErrorExpected extends js.Object {
  var actual: String | Double
  var error: js.Error
  var expected: String
}

object Anon_ActualErrorExpected {
  @scala.inline
  def apply(actual: String | Double, error: js.Error, expected: String): Anon_ActualErrorExpected = {
    val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expected = expected.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ActualErrorExpected]
  }
}

