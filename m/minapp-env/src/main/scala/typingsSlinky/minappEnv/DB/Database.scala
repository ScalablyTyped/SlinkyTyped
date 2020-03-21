package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("DB.Database")
@js.native
class Database protected () extends js.Object {
  val Geo: typingsSlinky.minappEnv.DB.Geo = js.native
  val command: DatabaseCommand = js.native
  val config: ICloudConfig = js.native
  def collection(collectionName: String): CollectionReference = js.native
  def serverDate(): ServerDate = js.native
}

