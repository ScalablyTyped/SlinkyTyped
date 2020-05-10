package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IVaultTraditionalFolderOperations extends js.Object {
  def GetTraditionalFolderContents(Folder: Double): ITraditionalFolderContents = js.native
}

object IVaultTraditionalFolderOperations {
  @scala.inline
  def apply(GetTraditionalFolderContents: Double => ITraditionalFolderContents): IVaultTraditionalFolderOperations = {
    val __obj = js.Dynamic.literal(GetTraditionalFolderContents = js.Any.fromFunction1(GetTraditionalFolderContents))
    __obj.asInstanceOf[IVaultTraditionalFolderOperations]
  }
  @scala.inline
  implicit class IVaultTraditionalFolderOperationsOps[Self <: IVaultTraditionalFolderOperations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetTraditionalFolderContents(value: Double => ITraditionalFolderContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetTraditionalFolderContents")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

