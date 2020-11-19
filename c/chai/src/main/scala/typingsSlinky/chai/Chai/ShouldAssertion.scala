package typingsSlinky.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShouldAssertion extends js.Object {
  
  def Throw(actual: js.Function): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Function): Unit = js.native
  def Throw(
    actual: js.Function,
    constructor: js.Function,
    expected: js.UndefOr[scala.Nothing],
    message: String
  ): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Function, expected: js.RegExp): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Function, expected: js.RegExp, message: String): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Error): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Error, expected: String): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Error, expected: String, message: String): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Error, expected: js.RegExp): Unit = js.native
  def Throw(actual: js.Function, constructor: js.Error, expected: js.RegExp, message: String): Unit = js.native
  def Throw(actual: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def Throw(actual: js.Function, expected: String): Unit = js.native
  def Throw(actual: js.Function, expected: String, message: String): Unit = js.native
  def Throw(actual: js.Function, expected: js.RegExp): Unit = js.native
  def Throw(actual: js.Function, expected: js.RegExp, message: String): Unit = js.native
  @JSName("Throw")
  var Throw_Original: ShouldThrow = js.native
  
  def equal(value1: js.Any, value2: js.Any): Unit = js.native
  def equal(value1: js.Any, value2: js.Any, message: String): Unit = js.native
  
  def exist(value: js.Any): Unit = js.native
  def exist(value: js.Any, message: String): Unit = js.native
  
  def `throw`(actual: js.Function): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Function): Unit = js.native
  def `throw`(
    actual: js.Function,
    constructor: js.Function,
    expected: js.UndefOr[scala.Nothing],
    message: String
  ): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Function, expected: String): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Function, expected: String, message: String): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Function, expected: js.RegExp): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Function, expected: js.RegExp, message: String): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Error): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Error, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Error, expected: String): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Error, expected: String, message: String): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Error, expected: js.RegExp): Unit = js.native
  def `throw`(actual: js.Function, constructor: js.Error, expected: js.RegExp, message: String): Unit = js.native
  def `throw`(actual: js.Function, expected: js.UndefOr[scala.Nothing], message: String): Unit = js.native
  def `throw`(actual: js.Function, expected: String): Unit = js.native
  def `throw`(actual: js.Function, expected: String, message: String): Unit = js.native
  def `throw`(actual: js.Function, expected: js.RegExp): Unit = js.native
  def `throw`(actual: js.Function, expected: js.RegExp, message: String): Unit = js.native
  @JSName("throw")
  var throw_Original: ShouldThrow = js.native
}
