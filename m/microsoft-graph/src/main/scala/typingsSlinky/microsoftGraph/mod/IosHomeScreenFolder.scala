package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IosHomeScreenFolder extends IosHomeScreenItem {
  /**
    * Pages of Home Screen Layout Icons which must be Application Type. This collection can contain a maximum of 500
    * elements.
    */
  var pages: js.UndefOr[js.Array[IosHomeScreenFolderPage]] = js.native
}

object IosHomeScreenFolder {
  @scala.inline
  def apply(): IosHomeScreenFolder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IosHomeScreenFolder]
  }
  @scala.inline
  implicit class IosHomeScreenFolderOps[Self <: IosHomeScreenFolder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPages(value: js.Array[IosHomeScreenFolderPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
  }
  
}

