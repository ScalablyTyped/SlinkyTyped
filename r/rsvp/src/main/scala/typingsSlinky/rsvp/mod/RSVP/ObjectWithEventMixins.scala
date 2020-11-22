package typingsSlinky.rsvp.mod.RSVP

import typingsSlinky.rsvp.rsvpStrings.chained
import typingsSlinky.rsvp.rsvpStrings.created
import typingsSlinky.rsvp.rsvpStrings.error
import typingsSlinky.rsvp.rsvpStrings.fulfilled
import typingsSlinky.rsvp.rsvpStrings.rejected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectWithEventMixins extends js.Object {
  
  def off(eventName: String): Unit = js.native
  def off(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  
  def on(eventName: String, callback: js.Function1[/* value */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_chained(eventName: chained, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_created(eventName: created, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_error(eventName: error, errorHandler: js.Function1[/* reason */ js.Any, Unit]): Unit = js.native
  @JSName("on")
  def on_fulfilled(eventName: fulfilled, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  @JSName("on")
  def on_rejected(eventName: rejected, listener: js.Function1[/* event */ InstrumentEvent, Unit]): Unit = js.native
  
  def trigger(eventName: String): Unit = js.native
  def trigger(eventName: String, options: js.UndefOr[scala.Nothing], label: String): Unit = js.native
  def trigger(eventName: String, options: js.Any): Unit = js.native
  def trigger(eventName: String, options: js.Any, label: String): Unit = js.native
}
