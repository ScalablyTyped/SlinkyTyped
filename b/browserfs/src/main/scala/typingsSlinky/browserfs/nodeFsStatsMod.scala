package typingsSlinky.browserfs

import typingsSlinky.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeFsStatsMod {
  
  @JSImport("browserfs/dist/node/core/node_fs_stats", JSImport.Default)
  @js.native
  class default protected () extends Stats {
    /**
      * Provides information about a particular entry in the file system.
      * @param [Number] item_type type of the item (FILE, DIRECTORY, SYMLINK, or SOCKET)
      * @param [Number] size Size of the item in bytes. For directories/symlinks,
      *   this is normally the size of the struct that represents the item.
      * @param [Number] mode Unix-style file mode (e.g. 0o644)
      * @param [Date?] atime time of last access
      * @param [Date?] mtime time of last modification
      * @param [Date?] ctime time of creation
      */
    def this(itemType: FileType, size: Double) = this()
    def this(itemType: FileType, size: Double, mode: Double) = this()
    def this(itemType: FileType, size: Double, mode: js.UndefOr[scala.Nothing], atime: js.Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: js.Date) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.UndefOr[scala.Nothing],
      mtime: js.Date
    ) = this()
    def this(itemType: FileType, size: Double, mode: js.UndefOr[scala.Nothing], atime: js.Date, mtime: js.Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: js.UndefOr[scala.Nothing], mtime: js.Date) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: js.Date, mtime: js.Date) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.UndefOr[scala.Nothing],
      mtime: js.UndefOr[scala.Nothing],
      ctime: js.Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.UndefOr[scala.Nothing],
      mtime: js.Date,
      ctime: js.Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.Date,
      mtime: js.UndefOr[scala.Nothing],
      ctime: js.Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: js.UndefOr[scala.Nothing],
      atime: js.Date,
      mtime: js.Date,
      ctime: js.Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: Double,
      atime: js.UndefOr[scala.Nothing],
      mtime: js.UndefOr[scala.Nothing],
      ctime: js.Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: Double,
      atime: js.UndefOr[scala.Nothing],
      mtime: js.Date,
      ctime: js.Date
    ) = this()
    def this(
      itemType: FileType,
      size: Double,
      mode: Double,
      atime: js.Date,
      mtime: js.UndefOr[scala.Nothing],
      ctime: js.Date
    ) = this()
    def this(itemType: FileType, size: Double, mode: Double, atime: js.Date, mtime: js.Date, ctime: js.Date) = this()
  }
  /* static members */
  object default {
    
    @JSImport("browserfs/dist/node/core/node_fs_stats", "default.fromBuffer")
    @js.native
    def fromBuffer(buffer: Buffer): Stats = js.native
  }
  
  @js.native
  sealed trait FileType extends StObject
  @JSImport("browserfs/dist/node/core/node_fs_stats", "FileType")
  @js.native
  object FileType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FileType with Double] = js.native
    
    @js.native
    sealed trait DIRECTORY extends FileType
    /* 16384 */ val DIRECTORY: typingsSlinky.browserfs.nodeFsStatsMod.FileType.DIRECTORY with Double = js.native
    
    @js.native
    sealed trait FILE extends FileType
    /* 32768 */ val FILE: typingsSlinky.browserfs.nodeFsStatsMod.FileType.FILE with Double = js.native
    
    @js.native
    sealed trait SYMLINK extends FileType
    /* 40960 */ val SYMLINK: typingsSlinky.browserfs.nodeFsStatsMod.FileType.SYMLINK with Double = js.native
  }
  
  @js.native
  trait Stats
    extends typingsSlinky.node.fsMod.Stats {
    
    /**
      * Change the mode of the file. We use this helper function to prevent messing
      * up the type of the file, which is encoded in mode.
      */
    def chmod(mode: Double): Unit = js.native
    
    var fileData: Buffer | Null = js.native
    
    def toBuffer(): Buffer = js.native
  }
}
