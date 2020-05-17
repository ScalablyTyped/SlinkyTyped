package typingsSlinky.expectations

import typingsSlinky.expectations.Expectations.IAssertions
import typingsSlinky.expectations.Expectations.IExpectations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  var expect: IExpectations = js.native
  @js.native
  object Expectations extends js.Object {
    @js.native
    class Expect protected ()
      extends typingsSlinky.expectations.Expectations.Expect {
      def this(value: js.Any) = this()
      def this(value: js.Any, assertions: IAssertions) = this()
      def this(value: js.Any, assertions: IAssertions, expr: js.Any) = this()
      def this(
        value: js.Any,
        assertions: IAssertions,
        expr: js.Any,
        parent: typingsSlinky.expectations.Expectations.Expect
      ) = this()
    }
    
  }
  
}

