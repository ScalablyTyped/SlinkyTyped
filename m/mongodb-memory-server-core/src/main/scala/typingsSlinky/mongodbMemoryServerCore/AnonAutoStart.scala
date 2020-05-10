package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAutoStart extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.native
  var binary: MongoBinaryOpts = js.native
  var instanceOpts: js.Array[MongoMemoryInstancePropBaseT] = js.native
  var replSet: RequiredReplSetOpts = js.native
}

object AnonAutoStart {
  @scala.inline
  def apply(
    binary: MongoBinaryOpts,
    instanceOpts: js.Array[MongoMemoryInstancePropBaseT],
    replSet: RequiredReplSetOpts
  ): AnonAutoStart = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], instanceOpts = instanceOpts.asInstanceOf[js.Any], replSet = replSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoStart]
  }
  @scala.inline
  implicit class AnonAutoStartOps[Self <: AnonAutoStart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBinary(value: MongoBinaryOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstanceOpts(value: js.Array[MongoMemoryInstancePropBaseT]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceOpts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplSet(value: RequiredReplSetOpts): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replSet")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

