package typingsSlinky.expressRateLimit.mod

import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Query
import typingsSlinky.expressServeStaticCore.mod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimit
  extends RequestHandler[ParamsDictionary, js.Any, js.Any, Query] {
  def resetIp(key: String): Unit = js.native
  def resetKey(key: String): Unit = js.native
}

