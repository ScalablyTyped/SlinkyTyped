package typingsSlinky.chai.Chai

import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChaiStatic extends js.Object {
  
  var Assertion: AssertionStatic = js.native
  
  var AssertionError: Instantiable3[
    /* message */ String, 
    /* _props */ js.UndefOr[js.Any], 
    /* ssf */ js.UndefOr[js.Function], 
    typingsSlinky.chai.Chai.AssertionError
  ] = js.native
  
  /**
    * @param expression    Expression to test for truthiness.
    * @param message    Message to display on error.
    */
  def assert(expression: js.Any): Unit = js.native
  def assert(expression: js.Any, message: String): Unit = js.native
  @JSName("assert")
  var assert_Original: AssertStatic = js.native
  
  var config: Config = js.native
  
  def expect(`val`: js.Any): Assertion = js.native
  def expect(`val`: js.Any, message: String): Assertion = js.native
  @JSName("expect")
  var expect_Original: ExpectStatic = js.native
  
  def should(): Should = js.native
  
  /**
    * Provides a way to extend the internals of Chai
    */
  def use(fn: ChaiPlugin): ChaiStatic = js.native
  
  var util: ChaiUtils = js.native
  
  var version: String = js.native
}
