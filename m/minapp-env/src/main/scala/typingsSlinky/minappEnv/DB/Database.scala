package typingsSlinky.minappEnv.DB

import typingsSlinky.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Database extends js.Object {
  val Geo: typingsSlinky.minappEnv.DB.Geo = js.native
  val command: DatabaseCommand = js.native
  val config: ICloudConfig = js.native
  def collection(collectionName: String): CollectionReference = js.native
  def serverDate(): ServerDate = js.native
}

object Database {
  @scala.inline
  def apply(
    Geo: Geo,
    collection: String => CollectionReference,
    command: DatabaseCommand,
    config: ICloudConfig,
    serverDate: () => ServerDate
  ): Database = {
    val __obj = js.Dynamic.literal(Geo = Geo.asInstanceOf[js.Any], collection = js.Any.fromFunction1(collection), command = command.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], serverDate = js.Any.fromFunction0(serverDate))
    __obj.asInstanceOf[Database]
  }
  @scala.inline
  implicit class DatabaseOps[Self <: Database] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGeo(value: Geo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Geo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCollection(value: String => CollectionReference): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collection")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCommand(value: DatabaseCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfig(value: ICloudConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerDate(value: () => ServerDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverDate")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

