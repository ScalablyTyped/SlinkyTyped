package typingsSlinky.klaw.mod

import typingsSlinky.klaw.klawStrings.close
import typingsSlinky.klaw.klawStrings.data
import typingsSlinky.klaw.klawStrings.end
import typingsSlinky.klaw.klawStrings.error
import typingsSlinky.klaw.klawStrings.readable
import typingsSlinky.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Walker extends Readable {
  def on(event: Event, listener: js.Function): this.type = js.native
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_data(event: data, listener: js.Function1[/* item */ Item, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_readable(event: readable, listener: js.Function0[Unit]): this.type = js.native
}

