package typingsSlinky.expectations

import typingsSlinky.expectations.Expectations.IAssertions
import typingsSlinky.expectations.Expectations.IExpectations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Expectations {
    
    @JSGlobal("Expectations.Expect")
    @js.native
    class Expect protected ()
      extends typingsSlinky.expectations.Expectations.Expect {
      def this(value: js.Any) = this()
      def this(value: js.Any, assertions: IAssertions) = this()
      def this(value: js.Any, assertions: js.UndefOr[scala.Nothing], expr: js.Any) = this()
      def this(value: js.Any, assertions: IAssertions, expr: js.Any) = this()
      def this(
        value: js.Any,
        assertions: js.UndefOr[scala.Nothing],
        expr: js.UndefOr[scala.Nothing],
        parent: typingsSlinky.expectations.Expectations.Expect
      ) = this()
      def this(
        value: js.Any,
        assertions: js.UndefOr[scala.Nothing],
        expr: js.Any,
        parent: typingsSlinky.expectations.Expectations.Expect
      ) = this()
      def this(
        value: js.Any,
        assertions: IAssertions,
        expr: js.UndefOr[scala.Nothing],
        parent: typingsSlinky.expectations.Expectations.Expect
      ) = this()
      def this(
        value: js.Any,
        assertions: IAssertions,
        expr: js.Any,
        parent: typingsSlinky.expectations.Expectations.Expect
      ) = this()
    }
  }
  
  @JSGlobal("expect")
  @js.native
  def expect: IExpectations = js.native
  @scala.inline
  def expect_=(x: IExpectations): Unit = js.Dynamic.global.updateDynamic("expect")(x.asInstanceOf[js.Any])
}
