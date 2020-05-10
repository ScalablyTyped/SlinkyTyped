package typingsSlinky.ddTrace.mod.plugins

import typingsSlinky.ddTrace.mod.Analyzable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This plugin automatically instruments the
  * [ioredis](https://github.com/luin/ioredis) module.
  */
@js.native
trait ioredis
  extends Integration
     with Analyzable

object ioredis {
  @scala.inline
  def apply(): ioredis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ioredis]
  }
}

