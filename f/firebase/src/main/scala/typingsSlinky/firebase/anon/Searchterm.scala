package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Searchterm
  extends /* key */ StringDictionary[js.Any] {
  var search_term: js.UndefOr[String] = js.native
}

object Searchterm {
  @scala.inline
  def apply(): Searchterm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Searchterm]
  }
  @scala.inline
  implicit class SearchtermOps[Self <: Searchterm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSearch_term(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_term")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearch_term: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("search_term")(js.undefined)
        ret
    }
  }
  
}

