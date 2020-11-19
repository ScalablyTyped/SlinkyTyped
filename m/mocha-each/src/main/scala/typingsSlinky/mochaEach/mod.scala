package typingsSlinky.mochaEach

import typingsSlinky.mocha.Mocha.SuiteFunction
import typingsSlinky.mocha.Mocha.TestFunction
import typingsSlinky.mocha.mod.Context
import typingsSlinky.mocha.mod.Suite_
import typingsSlinky.mocha.mod.Test_
import typingsSlinky.mochaEach.anon.Describe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mocha-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /**
    * This function takes an array collections of parameters to be used in
    * a series of mocha tests, defined using the `it` or `describe` notation common to
    * Mocha.
    */
  def apply(parameters: js.Array[_]): Describe = js.native
  def apply(parameters: js.Array[_], dIt: js.UndefOr[scala.Nothing], dDescribe: SuiteFunction): Describe = js.native
  def apply(parameters: js.Array[_], dIt: TestFunction): Describe = js.native
  def apply(parameters: js.Array[_], dIt: TestFunction, dDescribe: SuiteFunction): Describe = js.native
  
  /**
    * This interface describes the kind of `describe` available from a `forEach` call.
    * The result is almost identical to Mocha's `SuiteFunction` interface.
    */
  @js.native
  trait ForEachDescribeDefinition extends js.Object {
    
    def apply(expectation: String): Suite_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
    
    def only(expectation: String): Suite_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
    
    def skip(expectation: String): Suite_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Suite_ = js.native
  }
  
  /**
    * This interface describes the kind of `it` available from a `forEach` call.
    * The result is very similar to Mocha's `TestFunction` interface.
    */
  @js.native
  trait ForEachTestFunction extends js.Object {
    
    def apply(expectation: String): Test_ = js.native
    def apply(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
    
    def only(expectation: String): Test_ = js.native
    def only(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
    
    def skip(expectation: String): Test_ = js.native
    def skip(expectation: String, callback: js.ThisFunction1[/* this */ Context, /* repeated */ js.Any, _]): Test_ = js.native
  }
}
