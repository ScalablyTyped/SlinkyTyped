package typingsSlinky.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends js.Object {
  
  def apply(value: js.Any): /* asserts value */ Boolean = js.native
  def apply(value: js.Any, message: String): /* asserts value */ Boolean = js.native
  def apply(value: js.Any, message: js.Error): /* asserts value */ Boolean = js.native
}
