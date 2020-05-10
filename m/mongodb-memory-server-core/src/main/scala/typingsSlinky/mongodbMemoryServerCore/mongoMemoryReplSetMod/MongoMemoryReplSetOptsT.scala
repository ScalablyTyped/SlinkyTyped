package typingsSlinky.mongodbMemoryServerCore.mongoMemoryReplSetMod

import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MongoMemoryReplSetOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var binary: js.UndefOr[MongoBinaryOpts] = js.native
  var instanceOpts: js.UndefOr[js.Array[MongoMemoryInstancePropBaseT]] = js.native
  var replSet: js.UndefOr[ReplSetOpts] = js.native
}

object MongoMemoryReplSetOptsT {
  @scala.inline
  def apply(): MongoMemoryReplSetOptsT = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MongoMemoryReplSetOptsT]
  }
  @scala.inline
  implicit class MongoMemoryReplSetOptsTOps[Self <: MongoMemoryReplSetOptsT] (val x: Self) extends AnyVal {
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
    def withInstanceOpts(value: js.Array[MongoMemoryInstancePropBaseT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOpts")(js.undefined)
        ret
    }
    @scala.inline
    def withReplSet(value: ReplSetOpts): Self = {
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
  }
  
}

