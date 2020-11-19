package typingsSlinky.redis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OverloadedKeyCommand[T, U, R] extends js.Object {
  
  def apply(args: (String | T | Callback[U])*): R = js.native
  def apply(key: String, arg1: T): R = js.native
  def apply(key: String, arg1: T, arg2: T): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, arg6: T, cb: Callback[U]): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, arg5: T, cb: Callback[U]): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, arg4: T, cb: Callback[U]): R = js.native
  def apply(key: String, arg1: T, arg2: T, arg3: T, cb: Callback[U]): R = js.native
  def apply(key: String, arg1: T, arg2: T, cb: Callback[U]): R = js.native
  def apply(key: String, arg1: T, cb: Callback[U]): R = js.native
  def apply(key: String, arg1: js.Array[T]): R = js.native
  def apply(key: String, arg1: js.Array[T], cb: Callback[U]): R = js.native
  def apply(key: String, args: (T | Callback[U])*): R = js.native
}
