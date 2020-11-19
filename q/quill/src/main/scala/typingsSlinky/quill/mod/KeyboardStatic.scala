package typingsSlinky.quill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeyboardStatic extends js.Object {
  
  def addBinding(key: Key, callback: js.Function2[/* range */ RangeStatic, /* context */ js.Any, Unit]): Unit = js.native
  def addBinding(
    key: Key,
    context: js.Any,
    callback: js.Function2[/* range */ RangeStatic, /* context */ js.Any, Unit]
  ): Unit = js.native
}
