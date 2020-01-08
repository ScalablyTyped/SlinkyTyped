package typingsSlinky.dos2unix.dos2unixMod

import typingsSlinky.dos2unix.dos2unixStrings.convertDotend
import typingsSlinky.dos2unix.dos2unixStrings.convertDoterror
import typingsSlinky.dos2unix.dos2unixStrings.convertDotstart
import typingsSlinky.dos2unix.dos2unixStrings.end
import typingsSlinky.dos2unix.dos2unixStrings.error
import typingsSlinky.dos2unix.dos2unixStrings.processingDotend
import typingsSlinky.dos2unix.dos2unixStrings.processingDoterror
import typingsSlinky.dos2unix.dos2unixStrings.processingDotskip
import typingsSlinky.dos2unix.dos2unixStrings.processingDotstart
import typingsSlinky.dos2unix.dos2unixStrings.start
import typingsSlinky.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dos2UnixConverter extends EventEmitter {
  @JSName("on")
  def on_convertend(event: convertDotend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_converterror(event: convertDoterror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_convertstart(event: convertDotstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_end(event: end, cb: js.Function1[/* stats */ Stats, Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, cb: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): this.type = js.native
  @JSName("on")
  def on_processingend(event: processingDotend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingerror(event: processingDoterror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingskip(event: processingDotskip, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
  @JSName("on")
  def on_processingstart(event: processingDotstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
  def process(globPatterns: js.Array[String]): Unit = js.native
  def process(globPatterns: js.Array[String], options: Options): Unit = js.native
}

