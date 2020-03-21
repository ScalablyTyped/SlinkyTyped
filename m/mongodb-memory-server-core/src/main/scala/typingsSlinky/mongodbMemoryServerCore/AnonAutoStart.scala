package typingsSlinky.mongodbMemoryServerCore

import typingsSlinky.mongodbMemoryServerCore.mongoBinaryMod.MongoBinaryOpts
import typingsSlinky.mongodbMemoryServerCore.typesMod.MongoMemoryInstancePropBaseT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoStart extends js.Object {
  var autoStart: js.UndefOr[Boolean] = js.undefined
  var binary: MongoBinaryOpts
  var debug: Boolean
  var instanceOpts: js.Array[MongoMemoryInstancePropBaseT]
  var replSet: RequiredReplSetOpts
}

object AnonAutoStart {
  @scala.inline
  def apply(
    binary: MongoBinaryOpts,
    debug: Boolean,
    instanceOpts: js.Array[MongoMemoryInstancePropBaseT],
    replSet: RequiredReplSetOpts,
    autoStart: js.UndefOr[Boolean] = js.undefined
  ): AnonAutoStart = {
    val __obj = js.Dynamic.literal(binary = binary.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], instanceOpts = instanceOpts.asInstanceOf[js.Any], replSet = replSet.asInstanceOf[js.Any])
    if (!js.isUndefined(autoStart)) __obj.updateDynamic("autoStart")(autoStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoStart]
  }
}

