package typingsSlinky.interfaceDashDatastore.interfaceDashDatastoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("interface-datastore", "Errors")
@js.native
object Errors extends js.Object {
  def dbDeleteFailedError(error: js.Error): ErrCode = js.native
  def dbOpenFailedError(error: js.Error): ErrCode = js.native
  def dbWriteFailedError(error: js.Error): ErrCode = js.native
  def notFoundError(error: js.Error): ErrCode = js.native
}

