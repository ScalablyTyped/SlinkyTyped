package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_passthrough ====
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typingsSlinky.node.eventsMod.EventEmitter because Already inherited
- typingsSlinky.node.eventsMod.global.NodeJS.EventEmitter because Already inherited
- typingsSlinky.node.childProcessMod.StdioNull because Already inherited
- typingsSlinky.node.streamMod.internal because Already inherited
- typingsSlinky.node.NodeJS.ReadableStream because Already inherited
- typingsSlinky.node.streamMod.Stream because Already inherited
- typingsSlinky.node.streamMod.Readable because Already inherited
- typingsSlinky.node.streamMod.Duplex because Already inherited
- typingsSlinky.node.streamMod.Transform because Already inherited
- typingsSlinky.node.streamMod.PassThrough because Inheritance from two classes. Inlined  */ @JSImport("readable-stream", "PassThrough")
@js.native
class PassThrough () extends Transform {
  def this(options: TransformOptions) = this()
  
  def _transform[T](
    chunk: T,
    encoding: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: String,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: Null,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
  def _transform[T](
    chunk: T,
    encoding: BufferEncoding,
    callback: js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[T], Unit]
  ): Unit = js.native
}
