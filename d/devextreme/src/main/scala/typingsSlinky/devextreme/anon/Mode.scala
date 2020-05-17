package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.details
import typingsSlinky.devextreme.devextremeStrings.thumbnails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mode extends js.Object {
  var mode: js.UndefOr[details | thumbnails] = js.native
  var showFolders: js.UndefOr[Boolean] = js.native
  var showParentFolder: js.UndefOr[Boolean] = js.native
}

object Mode {
  @scala.inline
  def apply(): Mode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mode]
  }
  @scala.inline
  implicit class ModeOps[Self <: Mode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: details | thumbnails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(js.undefined)
        ret
    }
    @scala.inline
    def withShowFolders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFolders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowFolders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showFolders")(js.undefined)
        ret
    }
    @scala.inline
    def withShowParentFolder(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showParentFolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowParentFolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showParentFolder")(js.undefined)
        ret
    }
  }
  
}

