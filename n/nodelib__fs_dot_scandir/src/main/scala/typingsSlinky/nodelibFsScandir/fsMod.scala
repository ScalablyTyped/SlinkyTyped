package typingsSlinky.nodelibFsScandir

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.nodelibFsScandir.anon.FnCall
import typingsSlinky.nodelibFsScandir.anon.PartialFileSystemAdapter
import typingsSlinky.nodelibFsScandir.anon.Typeoflstat
import typingsSlinky.nodelibFsScandir.anon.Typeofreaddir
import typingsSlinky.nodelibFsScandir.anon.Typeofstat
import typingsSlinky.nodelibFsScandir.nodelibFsScandirStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.scandir/out/adapters/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  @js.native
  trait FileSystemAdapter extends js.Object {
    var lstat: Typeoflstat = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    var readdir: Typeofreaddir = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCall = js.native
    var stat: Typeofstat = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    def lstatSync(path: PathLike): Stats = js.native
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    def statSync(path: PathLike): Stats = js.native
  }
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
}

