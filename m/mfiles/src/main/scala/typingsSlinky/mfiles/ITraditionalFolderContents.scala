package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITraditionalFolderContents extends js.Object {
  val ID: Double = js.native
  val ObjectVersions: IObjectVersions = js.native
  val TraditionalFolders: ITraditionalFolders = js.native
}

object ITraditionalFolderContents {
  @scala.inline
  def apply(ID: Double, ObjectVersions: IObjectVersions, TraditionalFolders: ITraditionalFolders): ITraditionalFolderContents = {
    val __obj = js.Dynamic.literal(ID = ID.asInstanceOf[js.Any], ObjectVersions = ObjectVersions.asInstanceOf[js.Any], TraditionalFolders = TraditionalFolders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITraditionalFolderContents]
  }
  @scala.inline
  implicit class ITraditionalFolderContentsOps[Self <: ITraditionalFolderContents] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withID(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObjectVersions(value: IObjectVersions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjectVersions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTraditionalFolders(value: ITraditionalFolders): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TraditionalFolders")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

