package typingsSlinky.browserfs.nodeFsStatsMod

import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@JSImport("browserfs/dist/node/core/node_fs_stats", JSImport.Default)
@js.native
object default extends js.Object {
  
  def fromBuffer(buffer: Buffer): Stats = js.native
}
