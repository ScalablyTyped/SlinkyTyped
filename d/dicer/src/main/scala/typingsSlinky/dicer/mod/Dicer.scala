package typingsSlinky.dicer.mod

import typingsSlinky.dicer.dicerStrings.close
import typingsSlinky.dicer.dicerStrings.drain
import typingsSlinky.dicer.dicerStrings.error
import typingsSlinky.dicer.dicerStrings.finish
import typingsSlinky.dicer.dicerStrings.part
import typingsSlinky.dicer.dicerStrings.pipe
import typingsSlinky.dicer.dicerStrings.preamble
import typingsSlinky.dicer.dicerStrings.trailer
import typingsSlinky.dicer.dicerStrings.unpipe
import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable:unified-signatures
/**
  * A very fast streaming multipart parser for node.js.
  * Dicer is a WritableStream
  *
  * Dicer (special) events:
  * - on('finish', ()) - Emitted when all parts have been parsed and the Dicer instance has been ended.
  * - on('part', (stream: PartStream)) - Emitted when a new part has been found.
  * - on('preamble', (stream: PartStream)) - Emitted for preamble if you should happen to need it (can usually be ignored).
  * - on('trailer', (data: Buffer)) - Emitted when trailing data was found after the terminating boundary (as with the preamble, this can usually be ignored too).
  */
@js.native
trait Dicer extends Writable {
  
  @JSName("addListener")
  def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  @JSName("on")
  def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("on")
  def on_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("on")
  def on_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("on")
  def on_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("on")
  def on_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("on")
  def on_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  @JSName("once")
  def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("once")
  def once_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("once")
  def once_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("once")
  def once_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("once")
  def once_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("once")
  def once_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_drain(event: drain, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_finish(event: finish, listener: js.Function0[Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_part(event: part, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pipe(event: pipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_preamble(event: preamble, listener: js.Function1[/* stream */ PartStream, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_trailer(event: trailer, listener: js.Function1[/* data */ Buffer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_unpipe(event: unpipe, listener: js.Function1[/* src */ Readable, Unit]): this.type = js.native
  
  /**
    * Sets the boundary to use for parsing and performs some initialization needed for parsing.
    * You should only need to use this if you set headerFirst to true in the constructor and are parsing the boundary from the preamble header.
    *
    * @param boundary The boundary to use
    */
  def setBoundary(boundary: String): Unit = js.native
}
