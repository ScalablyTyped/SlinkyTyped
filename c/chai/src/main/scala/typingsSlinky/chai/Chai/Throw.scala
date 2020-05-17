package typingsSlinky.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Throw extends js.Object {
  def apply(): Assertion = js.native
  def apply(constructor: js.Function): Assertion = js.native
  def apply(constructor: js.Function, expected: String): Assertion = js.native
  def apply(constructor: js.Function, expected: String, message: String): Assertion = js.native
  def apply(constructor: js.Function, expected: js.RegExp): Assertion = js.native
  def apply(constructor: js.Function, expected: js.RegExp, message: String): Assertion = js.native
  def apply(constructor: js.Error): Assertion = js.native
  def apply(constructor: js.Error, expected: String): Assertion = js.native
  def apply(constructor: js.Error, expected: String, message: String): Assertion = js.native
  def apply(constructor: js.Error, expected: js.RegExp): Assertion = js.native
  def apply(constructor: js.Error, expected: js.RegExp, message: String): Assertion = js.native
  def apply(expected: String): Assertion = js.native
  def apply(expected: String, message: String): Assertion = js.native
  def apply(expected: js.RegExp): Assertion = js.native
  def apply(expected: js.RegExp, message: String): Assertion = js.native
}

