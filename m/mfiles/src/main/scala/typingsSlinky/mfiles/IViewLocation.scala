package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewLocation extends js.Object {
  var OverlappedFolder: ITypedValue = js.native
  var Overlapping: Boolean = js.native
  var ParentFolder: IFolderDefs = js.native
  def Clone(): IViewLocation = js.native
}

object IViewLocation {
  @scala.inline
  def apply(
    Clone: () => IViewLocation,
    OverlappedFolder: ITypedValue,
    Overlapping: Boolean,
    ParentFolder: IFolderDefs
  ): IViewLocation = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), OverlappedFolder = OverlappedFolder.asInstanceOf[js.Any], Overlapping = Overlapping.asInstanceOf[js.Any], ParentFolder = ParentFolder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewLocation]
  }
  @scala.inline
  implicit class IViewLocationOps[Self <: IViewLocation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IViewLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withOverlappedFolder(value: ITypedValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OverlappedFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOverlapping(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Overlapping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParentFolder(value: IFolderDefs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParentFolder")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

