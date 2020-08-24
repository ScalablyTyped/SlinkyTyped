package typingsSlinky.framebus

import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.framebus.typesMod.FramebusSubscribeHandler
import typingsSlinky.framebus.typesMod.FramebusSubscriberArg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("framebus/dist/lib/dispatch", JSImport.Namespace)
@js.native
object dispatchMod extends js.Object {
  def dispatch(origin: String, event: String): Unit = js.native
  def dispatch(
    origin: String,
    event: String,
    data: js.UndefOr[scala.Nothing],
    reply: js.UndefOr[scala.Nothing],
    e: MessageEvent
  ): Unit = js.native
  def dispatch(origin: String, event: String, data: js.UndefOr[scala.Nothing], reply: FramebusSubscribeHandler): Unit = js.native
  def dispatch(
    origin: String,
    event: String,
    data: js.UndefOr[scala.Nothing],
    reply: FramebusSubscribeHandler,
    e: MessageEvent
  ): Unit = js.native
  def dispatch(origin: String, event: String, data: FramebusSubscriberArg): Unit = js.native
  def dispatch(
    origin: String,
    event: String,
    data: FramebusSubscriberArg,
    reply: js.UndefOr[scala.Nothing],
    e: MessageEvent
  ): Unit = js.native
  def dispatch(origin: String, event: String, data: FramebusSubscriberArg, reply: FramebusSubscribeHandler): Unit = js.native
  def dispatch(
    origin: String,
    event: String,
    data: FramebusSubscriberArg,
    reply: FramebusSubscribeHandler,
    e: MessageEvent
  ): Unit = js.native
}

