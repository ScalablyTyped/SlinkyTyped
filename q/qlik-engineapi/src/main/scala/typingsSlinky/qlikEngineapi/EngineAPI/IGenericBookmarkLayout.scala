package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * GenericBookmarkLayout with extend GenericBaseLayout
  */
@js.native
trait IGenericBookmarkLayout extends IGenericBaseLayout {
  var qBookmark: INxBookmark = js.native
  @JSName("qMeta")
  var qMeta_IGenericBookmarkLayout: INxMetaTitleDescription = js.native
}

object IGenericBookmarkLayout {
  @scala.inline
  def apply(qBookmark: INxBookmark, qInfo: INxInfo, qMeta: INxMetaTitleDescription): IGenericBookmarkLayout = {
    val __obj = js.Dynamic.literal(qBookmark = qBookmark.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkLayout]
  }
  @scala.inline
  implicit class IGenericBookmarkLayoutOps[Self <: IGenericBookmarkLayout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQBookmark(value: INxBookmark): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qBookmark")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMeta(value: INxMetaTitleDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMeta")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

