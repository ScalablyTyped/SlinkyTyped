package typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod

import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryServerOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var binary: js.UndefOr[MongoBinaryOpts] = js.native
  var instance: js.UndefOr[MongoMemoryInstancePropT] = js.native
  var spawn: js.UndefOr[SpawnOptions] = js.native
}

object MongoMemoryServerOptsT {
  @scala.inline
  def apply(): MongoMemoryServerOptsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryServerOptsT]
  }
  @scala.inline
  implicit class MongoMemoryServerOptsTOps[Self <: MongoMemoryServerOptsT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withBinary(value: MongoBinaryOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBinary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(js.undefined)
        ret
    }
    @scala.inline
    def withInstance(value: MongoMemoryInstancePropT): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instance")(js.undefined)
        ret
    }
    @scala.inline
    def withSpawn(value: SpawnOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpawn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spawn")(js.undefined)
        ret
    }
  }
  
}

