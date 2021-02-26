package typingsSlinky.readableStream.mod

import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.streamMod.TransformCallback
import typingsSlinky.readableStream.anon.AfterTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
- typingsSlinky.node.streamMod.Transform because Inheritance from two classes. Inlined _flush, _transform */ @JSImport("readable-stream", "Transform")
@js.native
class Transform () extends Duplex {
  def this(options: TransformOptions) = this()
  
  def _flush(
    callback: (js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
  
  def _transform(
    chunk: js.Any,
    encoding: BufferEncoding,
    callback: (js.Function2[/* error */ js.UndefOr[js.Error], /* data */ js.UndefOr[js.Any], Unit]) | TransformCallback
  ): Unit = js.native
  
  var _transformState: AfterTransform = js.native
}
