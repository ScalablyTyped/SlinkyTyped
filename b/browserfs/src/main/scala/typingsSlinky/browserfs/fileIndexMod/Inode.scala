package typingsSlinky.browserfs.fileIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inode extends js.Object {
  def isDir(): Boolean = js.native
  def isFile(): Boolean = js.native
}

object Inode {
  @scala.inline
  def apply(isDir: () => Boolean, isFile: () => Boolean): Inode = {
    val __obj = js.Dynamic.literal(isDir = js.Any.fromFunction0(isDir), isFile = js.Any.fromFunction0(isFile))
    __obj.asInstanceOf[Inode]
  }
  @scala.inline
  implicit class InodeOps[Self <: Inode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDir(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDir")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

