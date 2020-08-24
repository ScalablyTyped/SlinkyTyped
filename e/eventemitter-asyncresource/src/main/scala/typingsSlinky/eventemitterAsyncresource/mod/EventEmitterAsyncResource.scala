package typingsSlinky.eventemitterAsyncresource.mod

import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventEmitterAsyncResource extends EventEmitter {
  def asyncId(): Double = js.native
  def asyncResource: EventEmitterReferencingAsyncResource = js.native
  def emitDestroy(): Unit = js.native
  def triggerAsyncId(): Double = js.native
}

