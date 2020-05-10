package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchPage...
  */
@js.native
trait ISearchPage extends js.Object {
  /**
    * Number of search groups to return (in qSearchGroupArray).
    */
  var qCount: Double = js.native
  /**
    * Options of the search group items.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupItemOptions: js.Array[ISearchGroupItemOptions] = js.native
  /**
    * Options of the search groups.
    * If this property is not set, all values are returned.
    * This property is to be used with the SearchResults method or the SearchObjects method.
    */
  var qGroupOptions: js.Array[ISearchGroupOptions] = js.native
  /**
    * Maximum number of matching values to return per search result.
    * The default value is -1; all values are returned.
    * This property is to be used with the SearchAssociations method.
    */
  var qMaxNbrFieldMatches: Double = js.native
  /**
    * Position from the top, starting from 0.
    * If the offset is set to 0, the first search result to be returned is at position 0.
    */
  var qOffset: Double = js.native
}

object ISearchPage {
  @scala.inline
  def apply(
    qCount: Double,
    qGroupItemOptions: js.Array[ISearchGroupItemOptions],
    qGroupOptions: js.Array[ISearchGroupOptions],
    qMaxNbrFieldMatches: Double,
    qOffset: Double
  ): ISearchPage = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupItemOptions = qGroupItemOptions.asInstanceOf[js.Any], qGroupOptions = qGroupOptions.asInstanceOf[js.Any], qMaxNbrFieldMatches = qMaxNbrFieldMatches.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchPage]
  }
  @scala.inline
  implicit class ISearchPageOps[Self <: ISearchPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGroupItemOptions(value: js.Array[ISearchGroupItemOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupItemOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQGroupOptions(value: js.Array[ISearchGroupOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQMaxNbrFieldMatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qMaxNbrFieldMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qOffset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

