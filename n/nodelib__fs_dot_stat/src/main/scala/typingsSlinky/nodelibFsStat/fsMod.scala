package typingsSlinky.nodelibFsStat

import typingsSlinky.node.fsMod.PathLike
import typingsSlinky.node.fsMod.Stats
import typingsSlinky.nodelibFsStat.anon.PartialFileSystemAdapter
import typingsSlinky.nodelibFsStat.anon.Typeoflstat
import typingsSlinky.nodelibFsStat.anon.Typeofstat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@nodelib/fs.stat/out/adapters/fs", JSImport.Namespace)
@js.native
object fsMod extends js.Object {
  
  val FILE_SYSTEM_ADAPTER: FileSystemAdapter = js.native
  
  def createFileSystemAdapter(): FileSystemAdapter = js.native
  def createFileSystemAdapter(fsMethods: PartialFileSystemAdapter): FileSystemAdapter = js.native
  
  @js.native
  trait FileSystemAdapter extends js.Object {
    
    var lstat: Typeoflstat = js.native
    
    def lstatSync(path: PathLike): Stats = js.native
    @JSName("lstatSync")
    var lstatSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
    
    var stat: Typeofstat = js.native
    
    def statSync(path: PathLike): Stats = js.native
    @JSName("statSync")
    var statSync_Original: js.Function1[/* path */ PathLike, Stats] = js.native
  }
}
