package typingsSlinky.hibp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResults extends js.Object {
  var breaches: js.Array[Breach_] | Null = js.native
  var pastes: js.Array[Paste] | Null = js.native
}

object SearchResults {
  @scala.inline
  def apply(): SearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResults]
  }
  @scala.inline
  implicit class SearchResultsOps[Self <: SearchResults] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBreaches(value: js.Array[Breach_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBreachesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("breaches")(null)
        ret
    }
    @scala.inline
    def withPastes(value: js.Array[Paste]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPastesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pastes")(null)
        ret
    }
  }
  
}

