package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchMatchCombinations...
  */
@js.native
trait ISearchMatchCombinations extends js.Object {
  /**
    * Array of search combinations.
    */
  var qSearchMatchCombinations: js.Array[ISerachMatchCombination] = js.native
}

object ISearchMatchCombinations {
  @scala.inline
  def apply(qSearchMatchCombinations: js.Array[ISerachMatchCombination]): ISearchMatchCombinations = {
    val __obj = js.Dynamic.literal(qSearchMatchCombinations = qSearchMatchCombinations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchMatchCombinations]
  }
  @scala.inline
  implicit class ISearchMatchCombinationsOps[Self <: ISearchMatchCombinations] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQSearchMatchCombinations(value: js.Array[ISerachMatchCombination]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qSearchMatchCombinations")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

