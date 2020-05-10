package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatsBase[T] extends js.Object {
  var atime: js.Date = js.native
  var atimeMs: T = js.native
  var birthtime: js.Date = js.native
  var birthtimeMs: T = js.native
  var blksize: T = js.native
  var blocks: T = js.native
  var ctime: js.Date = js.native
  var ctimeMs: T = js.native
  var dev: T = js.native
  var gid: T = js.native
  var ino: T = js.native
  var mode: T = js.native
  var mtime: js.Date = js.native
  var mtimeMs: T = js.native
  var nlink: T = js.native
  var rdev: T = js.native
  var size: T = js.native
  var uid: T = js.native
  def isBlockDevice(): Boolean = js.native
  def isCharacterDevice(): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isFIFO(): Boolean = js.native
  def isFile(): Boolean = js.native
  def isSocket(): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
}

object StatsBase {
  @scala.inline
  def apply[T](
    atime: js.Date,
    atimeMs: T,
    birthtime: js.Date,
    birthtimeMs: T,
    blksize: T,
    blocks: T,
    ctime: js.Date,
    ctimeMs: T,
    dev: T,
    gid: T,
    ino: T,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: T,
    mtime: js.Date,
    mtimeMs: T,
    nlink: T,
    rdev: T,
    size: T,
    uid: T
  ): StatsBase[T] = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatsBase[T]]
  }
  @scala.inline
  implicit class StatsBaseOps[Self[t] <: StatsBase[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withAtime(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAtimeMs(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthtime(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBirthtimeMs(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("birthtimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlksize(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blksize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBlocks(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtime(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCtimeMs(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ctimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDev(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGid(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIno(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ino")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsBlockDevice(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCharacterDevice(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCharacterDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDirectory(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFIFO(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFIFO")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFile(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSocket(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSocket")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSymbolicLink(value: () => Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSymbolicLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withMode(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtime(value: js.Date): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMtimeMs(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mtimeMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNlink(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nlink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRdev(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rdev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSize(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUid(value: T): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uid")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

