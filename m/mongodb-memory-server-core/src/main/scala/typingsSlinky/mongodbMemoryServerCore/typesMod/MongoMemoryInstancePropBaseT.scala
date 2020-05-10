package typingsSlinky.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryInstancePropBaseT extends js.Object {
  var args: js.UndefOr[js.Array[String]] = js.native
  var dbPath: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double | Null] = js.native
  var storageEngine: js.UndefOr[StorageEngineT] = js.native
}

object MongoMemoryInstancePropBaseT {
  @scala.inline
  def apply(): MongoMemoryInstancePropBaseT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryInstancePropBaseT]
  }
  @scala.inline
  implicit class MongoMemoryInstancePropBaseTOps[Self <: MongoMemoryInstancePropBaseT] (val x: Self) extends AnyVal {
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
    def withPortNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("port")(null)
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

