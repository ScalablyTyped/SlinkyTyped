package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchFieldDictionary...
  */
@js.native
trait ISearchFieldDictionary extends js.Object {
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double = js.native
  /**
    * List of the matching values.
    * The maximum number of values in this list is set by qMaxNbrFieldMatches.
    */
  var qResult: js.Array[ISearchTermResult] = js.native
}

object ISearchFieldDictionary {
  @scala.inline
  def apply(qField: Double, qResult: js.Array[ISearchTermResult]): ISearchFieldDictionary = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qResult = qResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchFieldDictionary]
  }
  @scala.inline
  implicit class ISearchFieldDictionaryOps[Self <: ISearchFieldDictionary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQField(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQResult(value: js.Array[ISearchTermResult]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qResult")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

