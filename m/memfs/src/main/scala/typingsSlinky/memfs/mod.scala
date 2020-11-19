package typingsSlinky.memfs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.memfs.anon.COPYFILEEXCL
import typingsSlinky.memfs.direntMod.default
import typingsSlinky.memfs.promisesMod.IPromisesAPI
import typingsSlinky.memfs.statsMod.TStatNumber
import typingsSlinky.memfs.volumeMod.DirectoryJSON
import typingsSlinky.memfs.volumeMod.IReadStream
import typingsSlinky.memfs.volumeMod.IWriteStream
import typingsSlinky.memfs.volumeMod.NestedDirectoryJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memfs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def createFsFromVolume(vol: typingsSlinky.memfs.volumeMod.Volume): IFs = js.native
  
  @js.native
  trait IFs
    extends typingsSlinky.memfs.volumeMod.Volume {
    
    var Dirent: Instantiable1[/* args (repeated) */ js.Any, default] = js.native
    
    var Stats: Instantiable1[/* args (repeated) */ js.Any, typingsSlinky.memfs.statsMod.default[TStatNumber]] = js.native
    
    var _toUnixTimestamp: js.Any = js.native
    
    var constants: COPYFILEEXCL = js.native
    
    @JSName("promises")
    var promises_FIFs: IPromisesAPI = js.native
  }
  
  @js.native
  class Volume ()
    extends typingsSlinky.memfs.volumeMod.Volume {
    def this(props: js.Object) = this()
  }
  @js.native
  object Volume
    extends Instantiable0[typingsSlinky.memfs.volumeMod.Volume]
       with Instantiable1[/* props */ js.Object, typingsSlinky.memfs.volumeMod.Volume] {
    
    /**
      * Global file descriptor counter. UNIX file descriptors start from 0 and go sequentially
      * up, so here, in order not to conflict with them, we choose some big number and descrease
      * the file descriptor of every new opened file.
      * @type {number}
      * @todo This should not be static, right?
      */
    var fd: Double = js.native
    
    def fromJSON(json: DirectoryJSON): typingsSlinky.memfs.volumeMod.Volume = js.native
    def fromJSON(json: DirectoryJSON, cwd: String): typingsSlinky.memfs.volumeMod.Volume = js.native
    
    def fromNestedJSON(json: NestedDirectoryJSON): typingsSlinky.memfs.volumeMod.Volume = js.native
    def fromNestedJSON(json: NestedDirectoryJSON, cwd: String): typingsSlinky.memfs.volumeMod.Volume = js.native
  }
  
  @js.native
  object fs extends TopLevel[IFs] {
    
    @js.native
    class Dirent protected () extends default {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class FSWatcher ()
      extends typingsSlinky.memfs.volumeMod.FSWatcher
    
    @js.native
    class ReadStream protected () extends IReadStream {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class StatWatcher ()
      extends typingsSlinky.memfs.volumeMod.StatWatcher
    
    @js.native
    class Stats protected ()
      extends typingsSlinky.memfs.statsMod.default[TStatNumber] {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class WriteStream protected () extends IWriteStream {
      def this(args: js.Any*) = this()
    }
  }
  
  @js.native
  object vol
    extends TopLevel[typingsSlinky.memfs.volumeMod.Volume] {
    
    @js.native
    class FSWatcher ()
      extends typingsSlinky.memfs.volumeMod.FSWatcher
    
    @js.native
    class ReadStream protected () extends IReadStream {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class StatWatcher ()
      extends typingsSlinky.memfs.volumeMod.StatWatcher
    
    @js.native
    class WriteStream protected () extends IWriteStream {
      def this(args: js.Any*) = this()
    }
  }
}
