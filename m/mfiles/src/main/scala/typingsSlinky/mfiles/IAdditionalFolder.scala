package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAdditionalFolder extends js.Object {
  var Folder: String = js.native
  var Impersonation: IImpersonation = js.native
  var LimitInMB: Double = js.native
  def Clone(): IAdditionalFolder = js.native
}

object IAdditionalFolder {
  @scala.inline
  def apply(Clone: () => IAdditionalFolder, Folder: String, Impersonation: IImpersonation, LimitInMB: Double): IAdditionalFolder = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Folder = Folder.asInstanceOf[js.Any], Impersonation = Impersonation.asInstanceOf[js.Any], LimitInMB = LimitInMB.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalFolder]
  }
  @scala.inline
  implicit class IAdditionalFolderOps[Self <: IAdditionalFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IAdditionalFolder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withFolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Folder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImpersonation(value: IImpersonation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Impersonation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimitInMB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LimitInMB")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

