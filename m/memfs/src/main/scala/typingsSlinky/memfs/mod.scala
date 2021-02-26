package typingsSlinky.memfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsSlinky.memfs.anon.COPYFILEEXCL
import typingsSlinky.memfs.direntMod.default
import typingsSlinky.memfs.promisesMod.IPromisesAPI
import typingsSlinky.memfs.statsMod.TStatNumber
import typingsSlinky.memfs.volumeMod.DirectoryJSON
import typingsSlinky.memfs.volumeMod.IReadStream
import typingsSlinky.memfs.volumeMod.IWriteStream
import typingsSlinky.memfs.volumeMod.NestedDirectoryJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("memfs", "Volume")
  @js.native
  class Volume ()
    extends typingsSlinky.memfs.volumeMod.Volume {
    def this(props: js.Object) = this()
  }
  object Volume {
    
    @JSImport("memfs", "Volume")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Global file descriptor counter. UNIX file descriptors start from 0 and go sequentially
      * up, so here, in order not to conflict with them, we choose some big number and descrease
      * the file descriptor of every new opened file.
      * @type {number}
      * @todo This should not be static, right?
      */
    @JSImport("memfs", "Volume.fd")
    @js.native
    def fd: Double = js.native
    @scala.inline
    def fd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fd")(x.asInstanceOf[js.Any])
    
    @JSImport("memfs", "Volume.fromJSON")
    @js.native
    def fromJSON(json: DirectoryJSON): typingsSlinky.memfs.volumeMod.Volume = js.native
    @JSImport("memfs", "Volume.fromJSON")
    @js.native
    def fromJSON(json: DirectoryJSON, cwd: String): typingsSlinky.memfs.volumeMod.Volume = js.native
    
    @JSImport("memfs", "Volume.fromNestedJSON")
    @js.native
    def fromNestedJSON(json: NestedDirectoryJSON): typingsSlinky.memfs.volumeMod.Volume = js.native
    @JSImport("memfs", "Volume.fromNestedJSON")
    @js.native
    def fromNestedJSON(json: NestedDirectoryJSON, cwd: String): typingsSlinky.memfs.volumeMod.Volume = js.native
  }
  
  @JSImport("memfs", "createFsFromVolume")
  @js.native
  def createFsFromVolume(vol: typingsSlinky.memfs.volumeMod.Volume): IFs = js.native
  
  object fs extends Shortcut {
    
    @JSImport("memfs", "fs")
    @js.native
    val ^ : IFs = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.Dirent")
    @js.native
    class Dirent protected () extends default {
      def this(args: js.Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.FSWatcher")
    @js.native
    class FSWatcher ()
      extends typingsSlinky.memfs.volumeMod.FSWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.ReadStream")
    @js.native
    class ReadStream protected () extends IReadStream {
      def this(args: js.Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.StatWatcher")
    @js.native
    class StatWatcher ()
      extends typingsSlinky.memfs.volumeMod.StatWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.Stats")
    @js.native
    class Stats protected ()
      extends typingsSlinky.memfs.statsMod.default[TStatNumber] {
      def this(args: js.Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.WriteStream")
    @js.native
    class WriteStream protected () extends IWriteStream {
      def this(args: js.Any*) = this()
    }
    
    type _To = IFs
    
    /* This means you don't have to write `^`, but can instead just say `fs.foo` */
    override def _to: IFs = ^
  }
  
  object vol extends Shortcut {
    
    @JSImport("memfs", "vol")
    @js.native
    val ^ : typingsSlinky.memfs.volumeMod.Volume = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.FSWatcher")
    @js.native
    class FSWatcher ()
      extends typingsSlinky.memfs.volumeMod.FSWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.ReadStream")
    @js.native
    class ReadStream protected () extends IReadStream {
      def this(args: js.Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.StatWatcher")
    @js.native
    class StatWatcher ()
      extends typingsSlinky.memfs.volumeMod.StatWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.WriteStream")
    @js.native
    class WriteStream protected () extends IWriteStream {
      def this(args: js.Any*) = this()
    }
    
    type _To = typingsSlinky.memfs.volumeMod.Volume
    
    /* This means you don't have to write `^`, but can instead just say `vol.foo` */
    override def _to: typingsSlinky.memfs.volumeMod.Volume = ^
  }
  
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
}
