package typingsSlinky.officeUiFabricReact.documentCardTitleBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDocumentCardTitleState extends js.Object {
  var clientWidth: js.UndefOr[Double] = js.native
  /**
    * In measuring, it will render a same style text with whiteSpace: 'nowrap', to get overflow rate.
    * So that the logic can predict truncated text well.
    */
  var needMeasurement: Boolean = js.native
  var previousTitle: String = js.native
  var truncatedTitleFirstPiece: js.UndefOr[String] = js.native
  var truncatedTitleSecondPiece: js.UndefOr[String] = js.native
}

object IDocumentCardTitleState {
  @scala.inline
  def apply(needMeasurement: Boolean, previousTitle: String): IDocumentCardTitleState = {
    val __obj = js.Dynamic.literal(needMeasurement = needMeasurement.asInstanceOf[js.Any], previousTitle = previousTitle.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDocumentCardTitleState]
  }
  @scala.inline
  implicit class IDocumentCardTitleStateOps[Self <: IDocumentCardTitleState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNeedMeasurement(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("needMeasurement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClientWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncatedTitleFirstPiece(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitleFirstPiece")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncatedTitleFirstPiece: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitleFirstPiece")(js.undefined)
        ret
    }
    @scala.inline
    def withTruncatedTitleSecondPiece(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitleSecondPiece")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTruncatedTitleSecondPiece: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("truncatedTitleSecondPiece")(js.undefined)
        ret
    }
  }
  
}

