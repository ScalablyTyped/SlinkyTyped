package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISharedFileInfo extends js.Object {
  val ChangeTimeUtc: js.Date = js.native
  val Extension: String = js.native
  val LogicalSize: Double = js.native
  val LogicalSize_32bit: Double = js.native
  val Title: String = js.native
  def Clone(): ISharedFileInfo = js.native
}

object ISharedFileInfo {
  @scala.inline
  def apply(
    ChangeTimeUtc: js.Date,
    Clone: () => ISharedFileInfo,
    Extension: String,
    LogicalSize: Double,
    LogicalSize_32bit: Double,
    Title: String
  ): ISharedFileInfo = {
    val __obj = js.Dynamic.literal(ChangeTimeUtc = ChangeTimeUtc.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Extension = Extension.asInstanceOf[js.Any], LogicalSize = LogicalSize.asInstanceOf[js.Any], LogicalSize_32bit = LogicalSize_32bit.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISharedFileInfo]
  }
  @scala.inline
  implicit class ISharedFileInfoOps[Self <: ISharedFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeTimeUtc(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeTimeUtc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => ISharedFileInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withExtension(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLogicalSize_32bit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LogicalSize_32bit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Title")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

