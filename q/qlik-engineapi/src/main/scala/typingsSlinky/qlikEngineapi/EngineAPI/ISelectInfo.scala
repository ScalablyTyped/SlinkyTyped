package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SelectInfo...
  */
@js.native
trait ISelectInfo extends js.Object {
  /**
    * List of information about ranges for selections.
    */
  var qContinuousRangeInfo: js.Array[IRange] = js.native
  /**
    * Gives information about the formatting of the range.
    * This parameter is used when performing range selections or text searches in dimensions.
    */
  var qNumberFormat: IFieldAttributes = js.native
  /**
    * Highest value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeHi: Double = js.native
  /**
    * This parameter is used when performing range selections or text searches in measures.
    * Gives information about the range of selections.
    * bool SoftLock = false;
    */
  var qRangeInfo: js.Array[INxRangeSelectInfo] = js.native
  /**
    * Lower value of the search range.
    * This parameter is used when performing range selections or text searches in dimensions.
    * Default is Null.
    */
  var qRangeLo: Double = js.native
  /**
    * Text search string.
    * Everything that matches the text is selected.
    * >> This parameter is optional.
    */
  var qTextSearch: js.UndefOr[String] = js.native
}

object ISelectInfo {
  @scala.inline
  def apply(
    qContinuousRangeInfo: js.Array[IRange],
    qNumberFormat: IFieldAttributes,
    qRangeHi: Double,
    qRangeInfo: js.Array[INxRangeSelectInfo],
    qRangeLo: Double
  ): ISelectInfo = {
    val __obj = js.Dynamic.literal(qContinuousRangeInfo = qContinuousRangeInfo.asInstanceOf[js.Any], qNumberFormat = qNumberFormat.asInstanceOf[js.Any], qRangeHi = qRangeHi.asInstanceOf[js.Any], qRangeInfo = qRangeInfo.asInstanceOf[js.Any], qRangeLo = qRangeLo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISelectInfo]
  }
  @scala.inline
  implicit class ISelectInfoOps[Self <: ISelectInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQContinuousRangeInfo(value: js.Array[IRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qContinuousRangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQNumberFormat(value: IFieldAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qNumberFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeHi(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeHi")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeInfo(value: js.Array[INxRangeSelectInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRangeLo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRangeLo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTextSearch(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTextSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQTextSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTextSearch")(js.undefined)
        ret
    }
  }
  
}

