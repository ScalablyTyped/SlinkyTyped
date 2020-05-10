package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchGroupOptions...
  */
@js.native
trait ISearchGroupOptions extends js.Object {
  /**
    * Maximum number of items per group (in qItems[ ]).
    * The default value is -1;
    * all values are returned.
    */
  var qCount: Double = js.native
  /**
    * Type of the group. Can be:
    * - GenericObjectType: the type of the search group item is a generic object.
    *   Groups have this type when you are calling SearchObjects.
    * - DatasetType: type of the search group item is a dataset association.
    *   Groups have this type when you are calling SearchResults.
    */
  var qGroupType: js.Any = js.native
  /**
    * Position starting from 0.
    * >> The default value is 0.
    */
  var qOffset: Double = js.native
}

object ISearchGroupOptions {
  @scala.inline
  def apply(qCount: Double, qGroupType: js.Any, qOffset: Double): ISearchGroupOptions = {
    val __obj = js.Dynamic.literal(qCount = qCount.asInstanceOf[js.Any], qGroupType = qGroupType.asInstanceOf[js.Any], qOffset = qOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupOptions]
  }
  @scala.inline
  implicit class ISearchGroupOptionsOps[Self <: ISearchGroupOptions] (val x: Self) extends AnyVal {
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
    def withQGroupType(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qGroupType")(value.asInstanceOf[js.Any])
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

