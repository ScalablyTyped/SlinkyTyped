package typingsSlinky.cypress.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Match extends js.Object {
  def apply(regexp: js.RegExp): Assertion = js.native
  def apply(regexp: js.RegExp, message: String): Assertion = js.native
  def apply(selector: String): Assertion = js.native
}

