package typingsSlinky.fastJsonPatch.moduleDuplexMod

import typingsSlinky.fastJsonPatch.moduleCoreMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fast-json-patch/module/duplex", "observe")
@js.native
object observe extends js.Object {
  
  def apply[T](obj: js.Array[T]): Observer[T] = js.native
  def apply[T](obj: js.Array[T], callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
  def apply[T](obj: js.Object): Observer[T] = js.native
  def apply[T](obj: js.Object, callback: js.Function1[/* patches */ js.Array[Operation], Unit]): Observer[T] = js.native
}
