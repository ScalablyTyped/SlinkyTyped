package typingsSlinky.maxmind

import typingsSlinky.maxmind.anon.FnCall
import typingsSlinky.maxmind.anon.FnCallFilenameOptionsListener
import typingsSlinky.maxmind.maxmindStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.Persistent
import typingsSlinky.node.anon.Recursive
import typingsSlinky.node.anon.`3`
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maxmind/lib/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def existsSync(path: PathLike): Boolean = js.native
    @JSName("existsSync")
    var existsSync_Original: js.Function1[/* path */ PathLike, Boolean] = js.native
    
    var readFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readFile.__promisify__ */ js.Any = js.native
    
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: BufferEncoding): String = js.native
    def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: Double, options: `3`): Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: `3`): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    var readFileSync_Original: FnCall = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
    
    def watch(filename: PathLike): FSWatcher = js.native
    def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: js.UndefOr[scala.Nothing],
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: String): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: String,
      listener: js.Function2[/* event */ String, /* filename */ String | Buffer, Unit]
    ): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Null,
      listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: BufferEncoding): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: BufferEncoding,
      listener: js.Function2[/* event */ String, /* filename */ String, Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: Persistent): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Persistent,
      listener: js.Function2[/* event */ String, Buffer | (/* filename */ String), Unit]
    ): FSWatcher = js.native
    def watch(filename: PathLike, options: Recursive): FSWatcher = js.native
    def watch(
      filename: PathLike,
      options: Recursive,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
    ): FSWatcher = js.native
    @JSName("watch")
    var watch_Original: FnCallFilenameOptionsListener = js.native
    @JSName("watch")
    def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
    @JSName("watch")
    def watch_buffer(
      filename: PathLike,
      options: buffer,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
    ): FSWatcher = js.native
  }
}
