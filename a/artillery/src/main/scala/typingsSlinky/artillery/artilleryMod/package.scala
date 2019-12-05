package typingsSlinky.artillery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object artilleryMod {
  type EventEmitter = typingsSlinky.node.eventsMod.EventEmitter
  type Next = js.Function1[/* err */ js.UndefOr[js.Error], Unit]
  type RequestResponse = typingsSlinky.request.requestMod.RequestResponse
  type ResponseRequest = typingsSlinky.request.requestMod.ResponseRequest
}
