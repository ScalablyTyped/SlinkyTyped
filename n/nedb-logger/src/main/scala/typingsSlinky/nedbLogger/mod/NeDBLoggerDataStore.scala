package typingsSlinky.nedbLogger.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NeDBLoggerDataStore extends js.Object {
  
  /**
    * Insert a new document
    * @param cb Optional callback, signature: err, insertedDoc
    */
  def insert[T](newDoc: T): Unit = js.native
  def insert[T](newDoc: T, cb: js.Function2[/* err */ js.Error, /* document */ T, Unit]): Unit = js.native
}
