package typingsSlinky.avoscloudSdk.mod.Push

import typingsSlinky.avoscloudSdk.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("avoscloud-sdk", "Push.send")
@js.native
object send extends js.Object {
  
  def apply[T](data: PushData): Promise[T] = js.native
  def apply[T](data: PushData, options: SendOptions): Promise[T] = js.native
}
