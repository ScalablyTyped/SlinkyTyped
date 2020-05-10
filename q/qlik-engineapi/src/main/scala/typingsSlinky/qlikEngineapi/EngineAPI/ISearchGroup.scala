package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroup...
  */
@js.native
trait ISearchGroup extends js.Object {
  /**
    * Type of the search group.
    * One of:
    *
    * -  1 for DatasetType: the type of the group is a data set.
    *      This group contains search matches that are related to fields in the app.
    * -  2 for GenericObjectsType: the type of the group is a generic object.
    *      This group contains search matches that are related to generic objects in the app.
    */
  var qGroupType: SearchObjectsGroupType = js.native
  /**
    * Identifier of the search group.
    */
  var qId: Double = js.native
  /**
    * List of items in the search group.
    * The group items are numbered
    * from
    * the value of SearchGroupOptions.qOffset
    * to
    * the value of SearchGroupOptions.qOffset + SearchGroupOptions.qCount
    */
  var qItems: js.Array[ISearchGroupItem] = js.native
  /**
    * Indexes of the search terms that are included in the group.
    * These search terms are related to the list of terms defined in SearchResult.qSearchTerms.
    */
  var qSearchTermsMatched: js.Array[Double] = js.native
  /**
    * Total number of distinct items in the search group.
    */
  var qTotalNumberOfItems: Double = js.native
}

object ISearchGroup {
  @scala.inline
  def apply(
    qGroupType: SearchObjectsGroupType,
    qId: Double,
    qItems: js.Array[ISearchGroupItem],
    qSearchTermsMatched: js.Array[Double],
    qTotalNumberOfItems: Double
  ): ISearchGroup = {
    val __obj = js.Dynamic.literal(qGroupType = qGroupType.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any], qItems = qItems.asInstanceOf[js.Any], qSearchTermsMatched = qSearchTermsMatched.asInstanceOf[js.Any], qTotalNumberOfItems = qTotalNumberOfItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroup]
  }
  @scala.inline
  implicit class ISearchGroupOps[Self <: ISearchGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQGroupType(value: SearchObjectsGroupType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQItems(value: js.Array[ISearchGroupItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQSearchTermsMatched(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSearchTermsMatched")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQTotalNumberOfItems(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTotalNumberOfItems")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

