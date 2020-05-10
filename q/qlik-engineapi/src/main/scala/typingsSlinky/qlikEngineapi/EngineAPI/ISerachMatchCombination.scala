package typingsSlinky.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SerachMatchCombination...
  */
@js.native
trait ISerachMatchCombination extends js.Object {
  /**
    * Information about the search matches.
    */
  var qFieldMatches: js.Array[ISerachFieldMatch] = js.native
  /**
    * Index of the search result, starting from 0.
    */
  var qId: Double = js.native
}

object ISerachMatchCombination {
  @scala.inline
  def apply(qFieldMatches: js.Array[ISerachFieldMatch], qId: Double): ISerachMatchCombination = {
    val __obj = js.Dynamic.literal(qFieldMatches = qFieldMatches.asInstanceOf[js.Any], qId = qId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerachMatchCombination]
  }
  @scala.inline
  implicit class ISerachMatchCombinationOps[Self <: ISerachMatchCombination] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQFieldMatches(value: js.Array[ISerachFieldMatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qFieldMatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("qId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

