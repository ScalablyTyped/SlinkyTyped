package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchSuggestItem...
  */
@js.native
trait ISearchSuggestItem extends js.Object {
  /**
    * Index of the suggestion value.
    * The indexing starts from 0 and from the left.
    */
  var qTerm: Double = js.native
  /**
    * Value of the suggestion.
    */
  var qValue: String = js.native
}

object ISearchSuggestItem {
  @scala.inline
  def apply(qTerm: Double, qValue: String): ISearchSuggestItem = {
    val __obj = js.Dynamic.literal(qTerm = qTerm.asInstanceOf[js.Any], qValue = qValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchSuggestItem]
  }
  @scala.inline
  implicit class ISearchSuggestItemOps[Self <: ISearchSuggestItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQTerm(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qTerm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qValue")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

