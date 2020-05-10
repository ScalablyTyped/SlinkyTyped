package typingsSlinky.nodelibFsScandir.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dirent extends js.Object {
  var name: String = js.native
  def isBlockDevice(): Boolean = js.native
  def isCharacterDevice(): Boolean = js.native
  def isDirectory(): Boolean = js.native
  def isFIFO(): Boolean = js.native
  def isFile(): Boolean = js.native
  def isSocket(): Boolean = js.native
  def isSymbolicLink(): Boolean = js.native
}

object Dirent {
  @scala.inline
  def apply(
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    name: String
  ): Dirent = {
    val __obj = js.Dynamic.literal(isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dirent]
  }
  @scala.inline
  implicit class DirentOps[Self <: Dirent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsBlockDevice(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isBlockDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsCharacterDevice(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isCharacterDevice")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDirectory(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDirectory")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFIFO(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFIFO")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsFile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSocket(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSocket")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSymbolicLink(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSymbolicLink")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

