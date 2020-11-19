package typingsSlinky.readableStream.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== destroy ====
@js.native
trait Destroy extends js.Object {
  
  def destroy(): Readable | Writable = js.native
  def destroy(error: Null, callback: js.Function1[/* error */ js.Error | Null, Unit]): Readable | Writable = js.native
  def destroy(error: js.Error): Readable | Writable = js.native
  def destroy(error: js.Error, callback: js.Function1[/* error */ js.Error | Null, Unit]): Readable | Writable = js.native
  
  def undestroy(): Unit = js.native
}
