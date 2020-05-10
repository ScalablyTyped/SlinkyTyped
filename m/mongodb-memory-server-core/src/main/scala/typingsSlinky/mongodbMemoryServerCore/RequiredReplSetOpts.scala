package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.mongoMemoryReplSetMod.MongoMemoryReplSetConfigSettingsT
import typingsSlinky.mongodbMemoryServerCore.typesMod.StorageEngineT
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Required<mongodb-memory-server-core.mongodb-memory-server-core/lib/MongoMemoryReplSet.ReplSetOpts> */
@js.native
trait RequiredReplSetOpts extends js.Object {
  var args: js.Array[String] = js.native
  var auth: Boolean = js.native
  var configSettings: MongoMemoryReplSetConfigSettingsT = js.native
  var count: Double = js.native
  var dbName: String = js.native
  var ip: String = js.native
  var name: String = js.native
  var oplogSize: Double = js.native
  var spawn: SpawnOptions = js.native
  var storageEngine: StorageEngineT = js.native
}

object RequiredReplSetOpts {
  @scala.inline
  def apply(
    args: js.Array[String],
    auth: Boolean,
    configSettings: MongoMemoryReplSetConfigSettingsT,
    count: Double,
    dbName: String,
    ip: String,
    name: String,
    oplogSize: Double,
    spawn: SpawnOptions,
    storageEngine: StorageEngineT
  ): RequiredReplSetOpts = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], auth = auth.asInstanceOf[js.Any], configSettings = configSettings.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], oplogSize = oplogSize.asInstanceOf[js.Any], spawn = spawn.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequiredReplSetOpts]
  }
  @scala.inline
  implicit class RequiredReplSetOptsOps[Self <: RequiredReplSetOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArgs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigSettings(value: MongoMemoryReplSetConfigSettingsT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("configSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOplogSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oplogSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpawn(value: SpawnOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageEngine(value: StorageEngineT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEngine")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

