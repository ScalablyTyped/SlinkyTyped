package typingsSlinky.powerAssert

import org.scalablytyped.runtime.Instantiable1
import typingsSlinky.powerAssert.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Actual extends StObject {
    
    var actual: js.UndefOr[js.Any] = js.native
    
    var expected: js.UndefOr[js.Any] = js.native
    
    var message: js.UndefOr[String] = js.native
    
    var operator: js.UndefOr[String] = js.native
    
    var stackStartFunction: js.UndefOr[js.Function] = js.native
  }
  object Actual {
    
    @scala.inline
    def apply(): Actual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Actual]
    }
    
    @scala.inline
    implicit class ActualMutableBuilder[Self <: Actual] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActual(value: js.Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
      
      @scala.inline
      def setExpected(value: js.Any): Self = StObject.set(x, "expected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpectedUndefined: Self = StObject.set(x, "expected", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
      
      @scala.inline
      def setStackStartFunction(value: js.Function): Self = StObject.set(x, "stackStartFunction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackStartFunctionUndefined: Self = StObject.set(x, "stackStartFunction", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(block: js.Function): Unit = js.native
    def apply(block: js.Function, error: js.Function): Unit = js.native
    def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    def apply(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    def apply(block: js.Function, error: js.Function, message: String): Unit = js.native
    def apply(block: js.Function, error: js.RegExp): Unit = js.native
    def apply(block: js.Function, error: js.RegExp, message: String): Unit = js.native
    def apply(block: js.Function, message: String): Unit = js.native
  }
  
  @js.native
  trait TypeofpowerAssert extends StObject {
    
    def apply(value: js.Any): Unit = js.native
    def apply(value: js.Any, message: String): Unit = js.native
    
    var AssertionError: Instantiable1[/* options */ js.UndefOr[Actual], typingsSlinky.powerAssert.mod.AssertionError] = js.native
    
    def customize(options: Options): /* import warning: importer.ImportType#apply Failed type conversion: typeof assert */ js.Any = js.native
    
    def deepEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def deepEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def deepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def deepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def doesNotThrow(block: js.Function): Unit = js.native
    def doesNotThrow(block: js.Function, error: js.Function): Unit = js.native
    def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    def doesNotThrow(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    def doesNotThrow(block: js.Function, error: js.Function, message: String): Unit = js.native
    def doesNotThrow(block: js.Function, error: js.RegExp): Unit = js.native
    def doesNotThrow(block: js.Function, error: js.RegExp, message: String): Unit = js.native
    def doesNotThrow(block: js.Function, message: String): Unit = js.native
    @JSName("doesNotThrow")
    var doesNotThrow_Original: FnCall = js.native
    
    def equal(actual: js.Any, expected: js.Any): Unit = js.native
    def equal(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def fail(): scala.Nothing = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      operator: String
    ): scala.Nothing = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.UndefOr[scala.Nothing],
      message: String,
      operator: String
    ): scala.Nothing = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any): scala.Nothing = js.native
    def fail(
      actual: js.UndefOr[scala.Nothing],
      expected: js.Any,
      message: js.UndefOr[scala.Nothing],
      operator: String
    ): scala.Nothing = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String): scala.Nothing = js.native
    def fail(actual: js.UndefOr[scala.Nothing], expected: js.Any, message: String, operator: String): scala.Nothing = js.native
    def fail(actual: js.Any): scala.Nothing = js.native
    def fail(
      actual: js.Any,
      expected: js.UndefOr[scala.Nothing],
      message: js.UndefOr[scala.Nothing],
      operator: String
    ): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.UndefOr[scala.Nothing], message: String, operator: String): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: js.UndefOr[scala.Nothing], operator: String): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: String): scala.Nothing = js.native
    def fail(actual: js.Any, expected: js.Any, message: String, operator: String): scala.Nothing = js.native
    
    def ifError(value: js.Any): Unit = js.native
    
    def notDeepEqual(acutal: js.Any, expected: js.Any): Unit = js.native
    def notDeepEqual(acutal: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def notDeepStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notDeepStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def notEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def notStrictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def notStrictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def ok(value: js.Any): Unit = js.native
    def ok(value: js.Any, message: String): Unit = js.native
    
    def strictEqual(actual: js.Any, expected: js.Any): Unit = js.native
    def strictEqual(actual: js.Any, expected: js.Any, message: String): Unit = js.native
    
    def throws(block: js.Function): Unit = js.native
    def throws(block: js.Function, error: js.Function): Unit = js.native
    def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean]): Unit = js.native
    def throws(block: js.Function, error: js.Function1[/* err */ js.Any, Boolean], message: String): Unit = js.native
    def throws(block: js.Function, error: js.Function, message: String): Unit = js.native
    def throws(block: js.Function, error: js.RegExp): Unit = js.native
    def throws(block: js.Function, error: js.RegExp, message: String): Unit = js.native
    def throws(block: js.Function, message: String): Unit = js.native
    @JSName("throws")
    var throws_Original: FnCall = js.native
  }
}
