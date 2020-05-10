package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.typesMod.StorageEngineT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonArgs extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var auth: js.UndefOr[Boolean] = js.native
  var dbPath: js.UndefOr[String] = js.native
  var ip: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var replSet: js.UndefOr[String] = js.native
  var storageEngine: js.UndefOr[StorageEngineT] = js.native
}

object AnonArgs {
  @scala.inline
  def apply(): AnonArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonArgs]
  }
  @scala.inline
  implicit class AnonArgsOps[Self <: AnonArgs] (val x: Self) extends AnyVal {
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
    def withoutArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("args")(js.undefined)
        ret
    }
    @scala.inline
    def withAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
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
    def withIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(js.undefined)
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
    def withStorageEngine(value: StorageEngineT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageEngine")(js.undefined)
        ret
    }
  }
  
}

