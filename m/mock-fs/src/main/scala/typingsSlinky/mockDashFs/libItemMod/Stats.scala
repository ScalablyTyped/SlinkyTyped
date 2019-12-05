package typingsSlinky.mockDashFs.libItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends js.Object {
  var atime: js.Date
  var birthtime: js.Date
  var blksize: Double
  var ctime: js.Date
  var dev: Double
  var gid: Double
  var ino: Double
  var mtime: js.Date
  var nlink: Double
  var rdev: Double
  var uid: Double
}

object Stats {
  @scala.inline
  def apply(
    atime: js.Date,
    birthtime: js.Date,
    blksize: Double,
    ctime: js.Date,
    dev: Double,
    gid: Double,
    ino: Double,
    mtime: js.Date,
    nlink: Double,
    rdev: Double,
    uid: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Stats]
  }
}

