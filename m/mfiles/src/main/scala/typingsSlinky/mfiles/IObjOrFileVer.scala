package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjOrFileVer extends js.Object {
  var FileVer: IFileVer = js.native
  var ObjVer: IObjVer = js.native
  def Clone(): IObjOrFileVer = js.native
  def IsFile(): Boolean = js.native
}

object IObjOrFileVer {
  @scala.inline
  def apply(Clone: () => IObjOrFileVer, FileVer: IFileVer, IsFile: () => Boolean, ObjVer: IObjVer): IObjOrFileVer = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), FileVer = FileVer.asInstanceOf[js.Any], IsFile = js.Any.fromFunction0(IsFile), ObjVer = ObjVer.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjOrFileVer]
  }
  @scala.inline
  implicit class IObjOrFileVerOps[Self <: IObjOrFileVer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjOrFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFileVer(value: IFileVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsFile(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsFile")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

