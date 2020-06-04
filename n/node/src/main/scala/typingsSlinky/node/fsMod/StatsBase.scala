package typingsSlinky.node.fsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsBase[T] extends js.Object {
  var atime: js.Date
  var atimeMs: T
  var birthtime: js.Date
  var birthtimeMs: T
  var blksize: T
  var blocks: T
  var ctime: js.Date
  var ctimeMs: T
  var dev: T
  var gid: T
  var ino: T
  var mode: T
  var mtime: js.Date
  var mtimeMs: T
  var nlink: T
  var rdev: T
  var size: T
  var uid: T
  def isBlockDevice(): Boolean
  def isCharacterDevice(): Boolean
  def isDirectory(): Boolean
  def isFIFO(): Boolean
  def isFile(): Boolean
  def isSocket(): Boolean
  def isSymbolicLink(): Boolean
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
  implicit class StatsBaseOps[Self <: StatsBase[_], T] (val x: Self with StatsBase[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtime(value: js.Date): Self = this.set("atime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAtimeMs(value: T): Self = this.set("atimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirthtime(value: js.Date): Self = this.set("birthtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirthtimeMs(value: T): Self = this.set("birthtimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlksize(value: T): Self = this.set("blksize", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlocks(value: T): Self = this.set("blocks", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtime(value: js.Date): Self = this.set("ctime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCtimeMs(value: T): Self = this.set("ctimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setDev(value: T): Self = this.set("dev", value.asInstanceOf[js.Any])
    @scala.inline
    def setGid(value: T): Self = this.set("gid", value.asInstanceOf[js.Any])
    @scala.inline
    def setIno(value: T): Self = this.set("ino", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsBlockDevice(value: () => Boolean): Self = this.set("isBlockDevice", js.Any.fromFunction0(value))
    @scala.inline
    def setIsCharacterDevice(value: () => Boolean): Self = this.set("isCharacterDevice", js.Any.fromFunction0(value))
    @scala.inline
    def setIsDirectory(value: () => Boolean): Self = this.set("isDirectory", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFIFO(value: () => Boolean): Self = this.set("isFIFO", js.Any.fromFunction0(value))
    @scala.inline
    def setIsFile(value: () => Boolean): Self = this.set("isFile", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSocket(value: () => Boolean): Self = this.set("isSocket", js.Any.fromFunction0(value))
    @scala.inline
    def setIsSymbolicLink(value: () => Boolean): Self = this.set("isSymbolicLink", js.Any.fromFunction0(value))
    @scala.inline
    def setMode(value: T): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtime(value: js.Date): Self = this.set("mtime", value.asInstanceOf[js.Any])
    @scala.inline
    def setMtimeMs(value: T): Self = this.set("mtimeMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNlink(value: T): Self = this.set("nlink", value.asInstanceOf[js.Any])
    @scala.inline
    def setRdev(value: T): Self = this.set("rdev", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: T): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: T): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
  
}

