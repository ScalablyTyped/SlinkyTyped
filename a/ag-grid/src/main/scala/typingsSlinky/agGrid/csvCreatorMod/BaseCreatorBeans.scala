package typingsSlinky.agGrid.csvCreatorMod

import typingsSlinky.agGrid.downloaderMod.Downloader
import typingsSlinky.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typingsSlinky.agGrid.gridSerializerMod.GridSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseCreatorBeans extends js.Object {
  var downloader: Downloader = js.native
  var gridOptionsWrapper: GridOptionsWrapper = js.native
  var gridSerializer: GridSerializer = js.native
}

object BaseCreatorBeans {
  @scala.inline
  def apply(downloader: Downloader, gridOptionsWrapper: GridOptionsWrapper, gridSerializer: GridSerializer): BaseCreatorBeans = {
    val __obj = js.Dynamic.literal(downloader = downloader.asInstanceOf[js.Any], gridOptionsWrapper = gridOptionsWrapper.asInstanceOf[js.Any], gridSerializer = gridSerializer.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCreatorBeans]
  }
  @scala.inline
  implicit class BaseCreatorBeansOps[Self <: BaseCreatorBeans] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloader(value: Downloader): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridOptionsWrapper(value: GridOptionsWrapper): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridOptionsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGridSerializer(value: GridSerializer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gridSerializer")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

