package typingsSlinky.nodelibFsScandir

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.anon.BaseEncodingOptionswithFi
import typingsSlinky.node.anon.BaseEncodingOptionswithFiEncoding
import typingsSlinky.node.anon.Encoding
import typingsSlinky.node.anon.WithFileTypes
import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.Dirent
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.nodelibFsScandir.anon.FnCall
import typingsSlinky.nodelibFsScandir.anon.FnCallPathOptions
import typingsSlinky.nodelibFsScandir.anon.PartialFileSystemAdapter
import typingsSlinky.nodelibFsScandir.anon.Typeoflstat
import typingsSlinky.nodelibFsScandir.anon.Typeofreaddir
import typingsSlinky.nodelibFsScandir.anon.Typeofstat
import typingsSlinky.nodelibFsScandir.nodelibFsScandirStrings.buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", "createFileSystemAdapter")
  @js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  @JSImport("@nodelib/fs.scandir/out/adapters/fs", "createFileSystemAdapter")
  @js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
  
  @js.native
  trait FileSystemAdapter extends StObject {
    
    var lstat: Typeoflstat = js.native
    
    def lstatSync(path: PathLike): Stats = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    
    var readdir: Typeofreaddir = js.native
    
    def readdirSync(path: PathLike): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BufferEncoding): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFi): js.Array[Buffer | String] = js.native
    def readdirSync(path: PathLike, options: BaseEncodingOptionswithFiEncoding): js.Array[Dirent] = js.native
    def readdirSync(path: PathLike, options: Encoding): js.Array[Buffer] = js.native
    def readdirSync(path: PathLike, options: WithFileTypes): js.Array[String] = js.native
    @JSName("readdirSync")
    var readdirSync_Original: FnCallPathOptions = js.native
    @JSName("readdirSync")
    def readdirSync_buffer(path: PathLike, options: buffer): js.Array[Buffer] = js.native
    
    var stat: Typeofstat = js.native
    
    def statSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @JSName("statSync")
    var statSync_Original: FnCall = js.native
  }
}
