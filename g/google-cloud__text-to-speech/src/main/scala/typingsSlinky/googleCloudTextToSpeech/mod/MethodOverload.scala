package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MethodOverload[T, R] extends js.Object {
  
  def apply(data: T): PromiseLike[js.Array[R]] = js.native
  def apply(data: T, callback: APICallback[R]): Unit = js.native
  def apply(data: T, options: CallOptions): PromiseLike[js.Array[R]] = js.native
  def apply(data: T, options: CallOptions, callback: APICallback[R]): Unit = js.native
}
