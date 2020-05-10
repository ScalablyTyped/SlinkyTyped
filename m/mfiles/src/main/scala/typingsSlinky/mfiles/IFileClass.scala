package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileClass extends js.Object {
  var DisplayName: String = js.native
  val DotAndExtension: String = js.native
  val Extension: String = js.native
  val FileClass: String = js.native
  def Clone(): IFileClass = js.native
  def LoadByExtension(Extension: String): Unit = js.native
  def LoadByFileClass(Extension: String, FileClass: String): Unit = js.native
  def SetFileClassInfo(DotAndFileExtension: String, FileClass: String, FileClassDisplayName: String): Unit = js.native
}

object IFileClass {
  @scala.inline
  def apply(
    Clone: () => IFileClass,
    DisplayName: String,
    DotAndExtension: String,
    Extension: String,
    FileClass: String,
    LoadByExtension: String => Unit,
    LoadByFileClass: (String, String) => Unit,
    SetFileClassInfo: (String, String, String) => Unit
  ): IFileClass = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), DisplayName = DisplayName.asInstanceOf[js.Any], DotAndExtension = DotAndExtension.asInstanceOf[js.Any], Extension = Extension.asInstanceOf[js.Any], FileClass = FileClass.asInstanceOf[js.Any], LoadByExtension = js.Any.fromFunction1(LoadByExtension), LoadByFileClass = js.Any.fromFunction2(LoadByFileClass), SetFileClassInfo = js.Any.fromFunction3(SetFileClassInfo))
    __obj.asInstanceOf[IFileClass]
  }
  @scala.inline
  implicit class IFileClassOps[Self <: IFileClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IFileClass): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDisplayName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDotAndExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DotAndExtension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFileClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadByExtension(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadByExtension")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadByFileClass(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LoadByFileClass")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSetFileClassInfo(value: (String, String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFileClassInfo")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

