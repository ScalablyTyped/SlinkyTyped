package typingsSlinky.asyncRedis.mod

import typingsSlinky.redis.mod.Commands
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promisified[T]
  extends Omitted
     with Commands[js.Promise[Boolean]]

