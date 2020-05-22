package typingsSlinky.mongodbMemoryServerCore.mongoMemoryServerMod

import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropT
import typingsSlinky.node.childProcessMod.SpawnOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MongoMemoryServerOptsT extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var binary: js.UndefOr[MongoBinaryOpts] = js.undefined
  var instance: js.UndefOr[MongoMemoryInstancePropT] = js.undefined
  var spawn: js.UndefOr[SpawnOptions] = js.undefined
}

object MongoMemoryServerOptsT {
  @scala.inline
  def apply(
    autoStart: js.UndefOr[Boolean] = js.undefined,
    binary: MongoBinaryOpts = null,
    instance: MongoMemoryInstancePropT = null,
    spawn: SpawnOptions = null
  ): MongoMemoryServerOptsT = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.get.asInstanceOf[js.Any])
    if (binary != null) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (instance != null) __obj.updateDynamic("instance")(instance.asInstanceOf[js.Any])
    if (spawn != null) __obj.updateDynamic("spawn")(spawn.asInstanceOf[js.Any])
    __obj.asInstanceOf[MongoMemoryServerOptsT]
  }
}

