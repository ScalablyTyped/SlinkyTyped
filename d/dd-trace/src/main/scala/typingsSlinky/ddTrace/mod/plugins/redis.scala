package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [redis](https://github.com/NodeRedis/node_redis) module.
  */
@js.native
trait redis
  extends Integration
     with Analyzable

object redis {
  @scala.inline
  def apply(): redis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[redis]
  }
}

