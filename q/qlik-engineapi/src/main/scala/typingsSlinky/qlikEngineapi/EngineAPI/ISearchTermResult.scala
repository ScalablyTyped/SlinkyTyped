package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchTermResult...
  */
@js.native
trait ISearchTermResult extends js.Object {
  /**
    * Element number of the associated value.
    */
  var qElemNumber: Double = js.native
  /**
    * List of ranges.
    * For example, if the user searches the term read and the associative value is Reading,
    * then the corresponding range would be Read in Reading.
    */
  var qRanges: js.Array[ISearchCharRange] = js.native
  /**
    * Text of the associated value.
    */
  var qText: String = js.native
}

object ISearchTermResult {
  @scala.inline
  def apply(qElemNumber: Double, qRanges: js.Array[ISearchCharRange], qText: String): ISearchTermResult = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qRanges = qRanges.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchTermResult]
  }
  @scala.inline
  implicit class ISearchTermResultOps[Self <: ISearchTermResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQElemNumber(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qElemNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQRanges(value: js.Array[ISearchCharRange]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qText")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

