package typingsSlinky.chai.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Property extends js.Object {
  
  def apply(name: String): Assertion = js.native
  def apply(name: String, message: String): Assertion = js.native
  def apply(name: String, value: js.Any): Assertion = js.native
  def apply(name: String, value: js.Any, message: String): Assertion = js.native
}
