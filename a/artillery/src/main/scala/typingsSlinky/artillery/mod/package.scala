package typingsSlinky.artillery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type EventEmitter = typingsSlinky.node.eventsMod.EventEmitter
  type Next = js.Function1[/* err */ js.UndefOr[js.Error], scala.Unit]
  type RequestResponse = typingsSlinky.request.mod.RequestResponse
  type ResponseRequest = typingsSlinky.request.mod.ResponseRequest
}
