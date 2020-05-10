package typingsSlinky.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutocompleteResult extends js.Object {
  var keyword: String = js.native
  def getNumPois(): Double = js.native
  def getPoi(i: Double): AutocompleteResultPoi = js.native
}

object AutocompleteResult {
  @scala.inline
  def apply(getNumPois: () => Double, getPoi: Double => AutocompleteResultPoi, keyword: String): AutocompleteResult = {
    val __obj = js.Dynamic.literal(getNumPois = js.Any.fromFunction0(getNumPois), getPoi = js.Any.fromFunction1(getPoi), keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutocompleteResult]
  }
  @scala.inline
  implicit class AutocompleteResultOps[Self <: AutocompleteResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetNumPois(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNumPois")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetPoi(value: Double => AutocompleteResultPoi): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPoi")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyword(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyword")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

