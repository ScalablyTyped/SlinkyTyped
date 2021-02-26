package typingsSlinky.nodelibFsStat

import typingsSlinky.node.fsMod.BigIntOptions
import typingsSlinky.node.fsMod.BigIntStats
import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.StatOptions
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.nodelibFsStat.anon.FnCall
import typingsSlinky.nodelibFsStat.anon.PartialFileSystemAdapter
import typingsSlinky.nodelibFsStat.anon.Typeoflstat
import typingsSlinky.nodelibFsStat.anon.Typeofstat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "FILE_SYSTEM_ADAPTER")
  @js.native
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "createFileSystemAdapter")
  @js.native
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  @JSImport("@nodelib/fs.stat/out/adapters/fs", "createFileSystemAdapter")
  @js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
  
  @js.native
  trait FileSystemAdapter extends StObject {
    
    var lstat: Typeoflstat = js.native
    
    def lstatSync(path: PathLike): Stats = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    
    var stat: Typeofstat = js.native
    
    def statSync(path: PathLike): Stats = js.native
    def statSync(path: PathLike, options: BigIntOptions): BigIntStats = js.native
    def statSync(path: PathLike, options: StatOptions): Stats | BigIntStats = js.native
    @JSName("statSync")
    var statSync_Original: FnCall = js.native
  }
}
