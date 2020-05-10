package typingsSlinky.fsExt.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatFVS extends js.Object {
  /** Number of free blocks for unprivileged users. */
  var f_bavail: Double = js.native
  /** Number of free blocks. */
  var f_bfree: Double = js.native
  /** Size of fs in f_frsize units. */
  var f_blocks: Double = js.native
  /** File system block size. */
  var f_bsize: Double = js.native
  /** Number of free inodes for unprivileged users. */
  var f_favail: Double = js.native
  /** Number of free inodes. */
  var f_ffree: Double = js.native
  /** Number of inodes. */
  var f_files: Double = js.native
  /** Mount flags. */
  var f_flag: Double = js.native
  /** Fragment size. */
  var f_frsize: Double = js.native
  /** Filesystem ID. */
  var f_fsid: Double = js.native
  /** Maximum filename length. */
  var f_namemax: Double = js.native
}

object StatFVS {
  @scala.inline
  def apply(
    f_bavail: Double,
    f_bfree: Double,
    f_blocks: Double,
    f_bsize: Double,
    f_favail: Double,
    f_ffree: Double,
    f_files: Double,
    f_flag: Double,
    f_frsize: Double,
    f_fsid: Double,
    f_namemax: Double
  ): StatFVS = {
    val __obj = js.Dynamic.literal(f_bavail = f_bavail.asInstanceOf[js.Any], f_bfree = f_bfree.asInstanceOf[js.Any], f_blocks = f_blocks.asInstanceOf[js.Any], f_bsize = f_bsize.asInstanceOf[js.Any], f_favail = f_favail.asInstanceOf[js.Any], f_ffree = f_ffree.asInstanceOf[js.Any], f_files = f_files.asInstanceOf[js.Any], f_flag = f_flag.asInstanceOf[js.Any], f_frsize = f_frsize.asInstanceOf[js.Any], f_fsid = f_fsid.asInstanceOf[js.Any], f_namemax = f_namemax.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatFVS]
  }
  @scala.inline
  implicit class StatFVSOps[Self <: StatFVS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withF_bavail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_bavail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_bfree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_bfree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_blocks(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_blocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_bsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_bsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_favail(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_favail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_ffree(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_ffree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_files(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_files")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_flag(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_flag")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_frsize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_frsize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_fsid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_fsid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withF_namemax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("f_namemax")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

