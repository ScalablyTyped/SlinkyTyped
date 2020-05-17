package typingsSlinky.divaJs.anon

import typingsSlinky.divaJs.interfacesMod.SourceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAllZoomLevelsForPage extends js.Object {
  var getAllZoomLevelsForPage: Double | js.Array[SourceProvider] = js.native
  var getBestZoomLevelForPage: Double | SourceProvider = js.native
}

object GetAllZoomLevelsForPage {
  @scala.inline
  def apply(
    getAllZoomLevelsForPage: Double | js.Array[SourceProvider],
    getBestZoomLevelForPage: Double | SourceProvider
  ): GetAllZoomLevelsForPage = {
    val __obj = js.Dynamic.literal(getAllZoomLevelsForPage = getAllZoomLevelsForPage.asInstanceOf[js.Any], getBestZoomLevelForPage = getBestZoomLevelForPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAllZoomLevelsForPage]
  }
  @scala.inline
  implicit class GetAllZoomLevelsForPageOps[Self <: GetAllZoomLevelsForPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetAllZoomLevelsForPage(value: Double | js.Array[SourceProvider]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAllZoomLevelsForPage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetBestZoomLevelForPage(value: Double | SourceProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBestZoomLevelForPage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

