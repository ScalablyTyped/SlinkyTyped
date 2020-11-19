package typingsSlinky.asyncRedis.mod

import typingsSlinky.redis.mod.Commands
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promisified[T]
  extends Omitted
     with Commands[js.Promise[Boolean]]
