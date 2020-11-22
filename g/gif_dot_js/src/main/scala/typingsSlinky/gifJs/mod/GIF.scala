package typingsSlinky.gifJs.mod

import org.scalajs.dom.raw.Blob
import org.scalajs.dom.raw.CanvasRenderingContext2D
import org.scalajs.dom.raw.ImageData
import org.scalajs.dom.raw.WebGLRenderingContext
import typingsSlinky.gifJs.gifJsStrings.abort
import typingsSlinky.gifJs.gifJsStrings.finished
import typingsSlinky.gifJs.gifJsStrings.progress
import typingsSlinky.gifJs.gifJsStrings.start
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.CanvasImageSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GIF extends EventEmitter {
  
  def addFrame(image: CanvasImageSource): Unit = js.native
  def addFrame(image: CanvasImageSource, options: AddFrameOptions): Unit = js.native
  def addFrame(image: CanvasRenderingContext2D): Unit = js.native
  def addFrame(image: CanvasRenderingContext2D, options: AddFrameOptions): Unit = js.native
  def addFrame(image: ImageData): Unit = js.native
  def addFrame(image: ImageData, options: AddFrameOptions): Unit = js.native
  def addFrame(image: WebGLRenderingContext): Unit = js.native
  def addFrame(image: WebGLRenderingContext, options: AddFrameOptions): Unit = js.native
  
  @JSName("on")
  def on_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("on")
  def on_finished(
    event: finished,
    listener: js.Function2[/* blob */ Blob, /* data */ js.typedarray.Uint8Array, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  
  @JSName("once")
  def once_abort(event: abort, listener: js.Function0[Unit]): this.type = js.native
  @JSName("once")
  def once_finished(
    event: finished,
    listener: js.Function2[/* blob */ Blob, /* data */ js.typedarray.Uint8Array, Unit]
  ): this.type = js.native
  @JSName("once")
  def once_progress(event: progress, listener: js.Function1[/* percent */ Double, Unit]): this.type = js.native
  @JSName("once")
  def once_start(event: start, listener: js.Function0[Unit]): this.type = js.native
  
  def render(): Unit = js.native
}
