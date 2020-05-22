package typingsSlinky.maxmind

import typingsSlinky.maxmind.anon.FnCall
import typingsSlinky.maxmind.anon.FnCallFilenameOptionsListener
import typingsSlinky.maxmind.anon.FnCallPathOptions
import typingsSlinky.maxmind.maxmindStrings.buffer
import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.BaseEncodingOptionsflagst
import typingsSlinky.node.anon.EncodingBufferEncoding
import typingsSlinky.node.anon.EncodingNull
import typingsSlinky.node.anon.Persistent
import typingsSlinky.node.anon.Recursive
import typingsSlinky.node.fsMod.FSWatcher
import typingsSlinky.node.fsMod.PathLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maxmind/lib/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("readFileSync")
    var readFileSync_Original: FnCallPathOptions = js.native
    @JSName("readFile")
    var readFile_Original: FnCall = js.native
    @JSName("watch")
    var watch_Original: FnCallFilenameOptionsListener = js.native
    def readFile(path: Double): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def readFile(path: Double, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def readFile(path: Double, options: EncodingNull): js.Promise[Buffer] = js.native
    def readFile(path: PathLike): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: String): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: BaseEncodingOptionsflagst): js.Promise[String | Buffer] = js.native
    def readFile(path: PathLike, options: EncodingBufferEncoding): js.Promise[String] = js.native
    def readFile(path: PathLike, options: EncodingNull): js.Promise[Buffer] = js.native
    def readFileSync(path: Double): String | Buffer = js.native
    def readFileSync(path: Double, options: BufferEncoding): String = js.native
    def readFileSync(path: Double, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: Double, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: Double, options: EncodingNull): Buffer = js.native
    def readFileSync(path: PathLike): String | Buffer = js.native
    def readFileSync(path: PathLike, options: BufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: BaseEncodingOptionsflagst): String | Buffer = js.native
    def readFileSync(path: PathLike, options: EncodingBufferEncoding): String = js.native
    def readFileSync(path: PathLike, options: EncodingNull): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: Double): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Buffer(path: PathLike): Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: Double, options: BufferEncoding): String | Buffer = js.native
    @JSName("readFileSync")
    def readFileSync_Union(path: PathLike, options: BufferEncoding): String | Buffer = js.native
    def watch(filename: PathLike): FSWatcher = js.native
    def watch(filename: PathLike, listener: js.Function2[/* event */ String, /* filename */ String, _]): FSWatcher = js.native
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
    def watch_buffer(filename: PathLike, options: buffer): FSWatcher = js.native
    @JSName("watch")
    def watch_buffer(
      filename: PathLike,
      options: buffer,
      listener: js.Function2[/* event */ String, /* filename */ Buffer, Unit]
    ): FSWatcher = js.native
  }
  
}

