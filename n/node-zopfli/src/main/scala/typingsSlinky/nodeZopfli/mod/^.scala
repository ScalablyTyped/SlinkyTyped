package typingsSlinky.nodeZopfli.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-zopfli", JSImport.Namespace)
@js.native
class ^ () extends Transform {
  def this(format: Format) = this()
  def this(format: js.UndefOr[scala.Nothing], options: Options) = this()
  def this(format: Format, options: Options) = this()
}
@JSImport("node-zopfli", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def compress(input: Buffer, format: Format): js.Promise[Buffer] = js.native
  def compress(input: Buffer, format: Format, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  def compress(input: Buffer, format: Format, options: Options): js.Promise[Buffer] = js.native
  def compress(
    input: Buffer,
    format: Format,
    options: Options,
    cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]
  ): Unit = js.native
  
  def createDeflate(): Zopfli = js.native
  def createDeflate(options: Options): Zopfli = js.native
  
  def createGzip(): Zopfli = js.native
  def createGzip(options: Options): Zopfli = js.native
  
  def createZlib(): Zopfli = js.native
  def createZlib(options: Options): Zopfli = js.native
  
  def deflate(input: Buffer): js.Promise[Buffer] = js.native
  def deflate(input: Buffer, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  def deflate(input: Buffer, options: Options): js.Promise[Buffer] = js.native
  def deflate(input: Buffer, options: Options, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  
  def deflateSync(): Buffer = js.native
  def deflateSync(options: Options): Buffer = js.native
  
  def gzip(input: Buffer): js.Promise[Buffer] = js.native
  def gzip(input: Buffer, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  def gzip(input: Buffer, options: Options): js.Promise[Buffer] = js.native
  def gzip(input: Buffer, options: Options, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  
  def gzipSync(): Buffer = js.native
  def gzipSync(options: Options): Buffer = js.native
  
  def zlib(input: Buffer): js.Promise[Buffer] = js.native
  def zlib(input: Buffer, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  def zlib(input: Buffer, options: Options): js.Promise[Buffer] = js.native
  def zlib(input: Buffer, options: Options, cb: js.Function2[/* err */ js.Error, /* out */ Buffer, Unit]): Unit = js.native
  
  def zlibSync(): Buffer = js.native
  def zlibSync(options: Options): Buffer = js.native
}
