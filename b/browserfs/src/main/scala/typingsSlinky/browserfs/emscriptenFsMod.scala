package typingsSlinky.browserfs

import typingsSlinky.browserfs.anon.Opts
import typingsSlinky.browserfs.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emscriptenFsMod {
  
  @JSImport("browserfs/dist/node/generic/emscripten_fs", JSImport.Default)
  @js.native
  class default () extends BFSEmscriptenFS {
    def this(_FS: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.UndefOr[scala.Nothing], _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.UndefOr[scala.Nothing], _ERRNO_CODES: js.Any) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.Any,
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.Any,
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.UndefOr[scala.Nothing],
      _PATH: js.Any,
      _ERRNO_CODES: js.Any,
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.Any,
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.Any,
      _PATH: js.UndefOr[scala.Nothing],
      _ERRNO_CODES: js.Any,
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(
      _FS: js.Any,
      _PATH: js.Any,
      _ERRNO_CODES: js.UndefOr[scala.Nothing],
      nodefs: typingsSlinky.browserfs.fSMod.default
    ) = this()
    def this(_FS: js.Any, _PATH: js.Any, _ERRNO_CODES: js.Any, nodefs: typingsSlinky.browserfs.fSMod.default) = this()
  }
  
  @js.native
  trait BFSEmscriptenFS extends EmscriptenFS {
    
    var ERRNO_CODES: js.Any = js.native
    
    var FS: js.Any = js.native
    
    var PATH: js.Any = js.native
    
    def createNode(parent: Null, name: String, mode: Double): EmscriptenFSNode = js.native
    def createNode(parent: Null, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
    
    def flagsToPermissionString(flags: String): String = js.native
    def flagsToPermissionString(flags: Double): String = js.native
    
    var flagsToPermissionStringMap: `0` = js.native
    
    def getERRNO_CODES(): js.Any = js.native
    
    def getFS(): js.Any = js.native
    
    def getNodeFS(): typingsSlinky.browserfs.fSMod.default = js.native
    
    def getPATH(): js.Any = js.native
    
    var nodefs: js.Any = js.native
  }
  
  @js.native
  trait EmscriptenFS extends StObject {
    
    def createNode(parent: EmscriptenFSNode, name: String, mode: Double): EmscriptenFSNode = js.native
    def createNode(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
    
    def getMode(path: String): Double = js.native
    
    def mount(mount: Opts): EmscriptenFSNode = js.native
    
    var node_ops: EmscriptenNodeOps = js.native
    
    def realPath(node: EmscriptenFSNode): String = js.native
    
    var stream_ops: EmscriptenStreamOps = js.native
  }
  
  @js.native
  trait EmscriptenFSNode extends StObject {
    
    var mode: Double = js.native
    
    var mount: Opts = js.native
    
    var name: String = js.native
    
    var node_ops: EmscriptenNodeOps = js.native
    
    var parent: EmscriptenFSNode = js.native
    
    var stream_ops: EmscriptenStreamOps = js.native
  }
  object EmscriptenFSNode {
    
    @scala.inline
    def apply(
      mode: Double,
      mount: Opts,
      name: String,
      node_ops: EmscriptenNodeOps,
      parent: EmscriptenFSNode,
      stream_ops: EmscriptenStreamOps
    ): EmscriptenFSNode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mount = mount.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_ops = node_ops.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], stream_ops = stream_ops.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenFSNode]
    }
    
    @scala.inline
    implicit class EmscriptenFSNodeMutableBuilder[Self <: EmscriptenFSNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMount(value: Opts): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode_ops(value: EmscriptenNodeOps): Self = StObject.set(x, "node_ops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: EmscriptenFSNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStream_ops(value: EmscriptenStreamOps): Self = StObject.set(x, "stream_ops", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmscriptenNodeOps extends StObject {
    
    def getattr(node: EmscriptenFSNode): Stats = js.native
    
    def lookup(parent: EmscriptenFSNode, name: String): EmscriptenFSNode = js.native
    
    def mknod(parent: EmscriptenFSNode, name: String, mode: Double, dev: js.Any): EmscriptenFSNode = js.native
    
    def readdir(node: EmscriptenFSNode): js.Array[String] = js.native
    
    def readlink(node: EmscriptenFSNode): String = js.native
    
    def rename(oldNode: EmscriptenFSNode, newDir: EmscriptenFSNode, newName: String): Unit = js.native
    
    def rmdir(parent: EmscriptenFSNode, name: String): Unit = js.native
    
    def setattr(node: EmscriptenFSNode, attr: Stats): Unit = js.native
    
    def symlink(parent: EmscriptenFSNode, newName: String, oldPath: String): Unit = js.native
    
    def unlink(parent: EmscriptenFSNode, name: String): Unit = js.native
  }
  object EmscriptenNodeOps {
    
    @scala.inline
    def apply(
      getattr: EmscriptenFSNode => Stats,
      lookup: (EmscriptenFSNode, String) => EmscriptenFSNode,
      mknod: (EmscriptenFSNode, String, Double, js.Any) => EmscriptenFSNode,
      readdir: EmscriptenFSNode => js.Array[String],
      readlink: EmscriptenFSNode => String,
      rename: (EmscriptenFSNode, EmscriptenFSNode, String) => Unit,
      rmdir: (EmscriptenFSNode, String) => Unit,
      setattr: (EmscriptenFSNode, Stats) => Unit,
      symlink: (EmscriptenFSNode, String, String) => Unit,
      unlink: (EmscriptenFSNode, String) => Unit
    ): EmscriptenNodeOps = {
      val __obj = js.Dynamic.literal(getattr = js.Any.fromFunction1(getattr), lookup = js.Any.fromFunction2(lookup), mknod = js.Any.fromFunction4(mknod), readdir = js.Any.fromFunction1(readdir), readlink = js.Any.fromFunction1(readlink), rename = js.Any.fromFunction3(rename), rmdir = js.Any.fromFunction2(rmdir), setattr = js.Any.fromFunction2(setattr), symlink = js.Any.fromFunction3(symlink), unlink = js.Any.fromFunction2(unlink))
      __obj.asInstanceOf[EmscriptenNodeOps]
    }
    
    @scala.inline
    implicit class EmscriptenNodeOpsMutableBuilder[Self <: EmscriptenNodeOps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetattr(value: EmscriptenFSNode => Stats): Self = StObject.set(x, "getattr", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLookup(value: (EmscriptenFSNode, String) => EmscriptenFSNode): Self = StObject.set(x, "lookup", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMknod(value: (EmscriptenFSNode, String, Double, js.Any) => EmscriptenFSNode): Self = StObject.set(x, "mknod", js.Any.fromFunction4(value))
      
      @scala.inline
      def setReaddir(value: EmscriptenFSNode => js.Array[String]): Self = StObject.set(x, "readdir", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReadlink(value: EmscriptenFSNode => String): Self = StObject.set(x, "readlink", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRename(value: (EmscriptenFSNode, EmscriptenFSNode, String) => Unit): Self = StObject.set(x, "rename", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRmdir(value: (EmscriptenFSNode, String) => Unit): Self = StObject.set(x, "rmdir", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetattr(value: (EmscriptenFSNode, Stats) => Unit): Self = StObject.set(x, "setattr", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSymlink(value: (EmscriptenFSNode, String, String) => Unit): Self = StObject.set(x, "symlink", js.Any.fromFunction3(value))
      
      @scala.inline
      def setUnlink(value: (EmscriptenFSNode, String) => Unit): Self = StObject.set(x, "unlink", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait EmscriptenStream extends StObject {
    
    var flags: String = js.native
    
    var nfd: js.Any = js.native
    
    var node: EmscriptenFSNode = js.native
    
    var position: Double = js.native
  }
  object EmscriptenStream {
    
    @scala.inline
    def apply(flags: String, nfd: js.Any, node: EmscriptenFSNode, position: Double): EmscriptenStream = {
      val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], nfd = nfd.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmscriptenStream]
    }
    
    @scala.inline
    implicit class EmscriptenStreamMutableBuilder[Self <: EmscriptenStream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNfd(value: js.Any): Self = StObject.set(x, "nfd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: EmscriptenFSNode): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmscriptenStreamOps extends StObject {
    
    def close(stream: EmscriptenStream): Unit = js.native
    
    def llseek(stream: EmscriptenStream, offset: Double, whence: Double): Double = js.native
    
    def open(stream: EmscriptenStream): Unit = js.native
    
    def read(
      stream: EmscriptenStream,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
    
    def write(
      stream: EmscriptenStream,
      buffer: js.typedarray.Uint8Array,
      offset: Double,
      length: Double,
      position: Double
    ): Double = js.native
  }
  object EmscriptenStreamOps {
    
    @scala.inline
    def apply(
      close: EmscriptenStream => Unit,
      llseek: (EmscriptenStream, Double, Double) => Double,
      open: EmscriptenStream => Unit,
      read: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double,
      write: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double
    ): EmscriptenStreamOps = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), llseek = js.Any.fromFunction3(llseek), open = js.Any.fromFunction1(open), read = js.Any.fromFunction5(read), write = js.Any.fromFunction5(write))
      __obj.asInstanceOf[EmscriptenStreamOps]
    }
    
    @scala.inline
    implicit class EmscriptenStreamOpsMutableBuilder[Self <: EmscriptenStreamOps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: EmscriptenStream => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLlseek(value: (EmscriptenStream, Double, Double) => Double): Self = StObject.set(x, "llseek", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOpen(value: EmscriptenStream => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRead(value: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = StObject.set(x, "read", js.Any.fromFunction5(value))
      
      @scala.inline
      def setWrite(value: (EmscriptenStream, js.typedarray.Uint8Array, Double, Double, Double) => Double): Self = StObject.set(x, "write", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    var atime: js.Date = js.native
    
    var blksize: Double = js.native
    
    var blocks: Double = js.native
    
    var ctime: js.Date = js.native
    
    var dev: Double = js.native
    
    var gid: Double = js.native
    
    var ino: Double = js.native
    
    var mode: Double = js.native
    
    var mtime: js.Date = js.native
    
    var nlink: Double = js.native
    
    var rdev: Double = js.native
    
    var size: Double = js.native
    
    var timestamp: js.UndefOr[Double] = js.native
    
    var uid: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(
      atime: js.Date,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
      dev: Double,
      gid: Double,
      ino: Double,
      mode: Double,
      mtime: js.Date,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
