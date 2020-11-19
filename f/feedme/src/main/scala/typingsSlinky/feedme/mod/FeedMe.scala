package typingsSlinky.feedme.mod

import typingsSlinky.feedme.feedmeStrings.`type`
import typingsSlinky.feedme.feedmeStrings.close
import typingsSlinky.feedme.feedmeStrings.drain
import typingsSlinky.feedme.feedmeStrings.error
import typingsSlinky.feedme.feedmeStrings.finish
import typingsSlinky.feedme.feedmeStrings.item
import typingsSlinky.feedme.feedmeStrings.pipe
import typingsSlinky.feedme.feedmeStrings.unpipe
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeedMe extends Writable {
  
  /**
    * Can only be used if buffer is true. It returns the feed as a Javascript object, should be called after end is emitted from the parser.
    * Subelements are put as children objects with their names as keys. When one object has more than one child of the same name, they are
    * put into an array. Items are always put into an array.
    */
  def done(): Document = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_item(event: item, listener: js.Function1[/* item */ Item, Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_type(event: `type`, listener: js.Function1[/* type */ Type, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
}
