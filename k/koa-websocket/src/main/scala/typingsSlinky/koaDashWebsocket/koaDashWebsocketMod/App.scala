package typingsSlinky.koaDashWebsocket.koaDashWebsocketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait App[StateT, CustomT]
  extends typingsSlinky.koa.koaMod.^[StateT, CustomT] {
  var ws: Server[StateT, CustomT] = js.native
}

