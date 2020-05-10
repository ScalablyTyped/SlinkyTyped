package typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod

import typingsSlinky.mongodbMemoryServerCore.typesMod.StorageEngineT
import typingsSlinky.tmp.mod.DirResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartupInstanceData extends js.Object {
  var dbName: String = js.native
  var dbPath: js.UndefOr[String] = js.native
  var ip: String = js.native
  var port: Double = js.native
  var replSet: js.UndefOr[String] = js.native
  var storageEngine: StorageEngineT = js.native
  var tmpDir: js.UndefOr[DirResult] = js.native
  var uri: js.UndefOr[String] = js.native
}

object StartupInstanceData {
  @scala.inline
  def apply(dbName: String, ip: String, port: Double, storageEngine: StorageEngineT): StartupInstanceData = {
    val __obj = js.Dynamic.literal(dbName = dbName.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], storageEngine = storageEngine.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartupInstanceData]
  }
  @scala.inline
  implicit class StartupInstanceDataOps[Self <: StartupInstanceData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStorageEngine(value: StorageEngineT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDbPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDbPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dbPath")(js.undefined)
        ret
    }
    @scala.inline
    def withReplSet(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replSet")(js.undefined)
        ret
    }
    @scala.inline
    def withTmpDir(value: DirResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpDir")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTmpDir: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tmpDir")(js.undefined)
        ret
    }
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
  }
  
}

