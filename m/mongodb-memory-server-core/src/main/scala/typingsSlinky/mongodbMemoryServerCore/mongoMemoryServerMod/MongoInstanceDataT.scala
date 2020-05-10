package typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod

import typingsSlinky.mongodbMemoryServerCore.typesMod.StorageEngineT
import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoInstanceDataT extends StartupInstanceData {
  var childProcess: js.UndefOr[ChildProcess] = js.native
  @JSName("dbPath")
  var dbPath_MongoInstanceDataT: String = js.native
  var instance: typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.default = js.native
  @JSName("uri")
  var uri_MongoInstanceDataT: String = js.native
}

object MongoInstanceDataT {
  @scala.inline
  def apply(
    dbName: String,
    dbPath: String,
    instance: typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.default,
    ip: String,
    port: Double,
    storageEngine: StorageEngineT,
    uri: String
  ): MongoInstanceDataT = {
    val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], dbPath = dbPath.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoInstanceDataT]
  }
  @scala.inline
  implicit class MongoInstanceDataTOps[Self <: MongoInstanceDataT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDbPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstance(value: typingsSlinky.mongodbMemoryServerCore.mongoInstanceMod.default): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChildProcess(value: ChildProcess): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProcess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildProcess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childProcess")(js.undefined)
        ret
    }
  }
  
}

