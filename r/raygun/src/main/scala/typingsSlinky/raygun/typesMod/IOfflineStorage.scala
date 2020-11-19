package typingsSlinky.raygun.typesMod

import typingsSlinky.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IOfflineStorage extends js.Object {
  
  def init(): Unit = js.native
  def init(options: OfflineStorageOptions): Unit = js.native
  
  def retrieve(callback: js.Function2[/* error */ ErrnoException | Null, /* items */ js.Array[String], Unit]): Unit = js.native
  
  def save(message: String, callback: js.Function1[/* error */ js.Error | Null, Unit]): Unit = js.native
  
  def send(
    callback: js.Function2[/* error */ js.Error | Null, /* items */ js.UndefOr[js.Array[String]], Unit]
  ): Unit = js.native
}
